package service.board;

import java.io.IOException;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.board_dao;
import DTO.board;
import DTO.member;
import DTO.reply;

public class board_reply implements board_action {
	public board_dao dao = new board_dao();
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		member user = (member)request.getSession().getAttribute("user");
		
		int board_id = Integer.parseInt(request.getParameter("board_id"));
		int member_id = user.getNum();
		String comment = request.getParameter("comment");
		String writer = user.getName();
		
		
		
		// reply re = new reply(board_id, user.getNum(), comment, user.getName());
		reply re = new reply(board_id, member_id, comment, writer);
		
		dao.write(re);
		
		// 게시글 작성자 이메일 가져오기 - 그래야 글 작성자에게 답글이 등록이 되었다고 메일을 보낼 수 있다.
		board org = dao.selectDetail(board_id);
		
		// 메일 보내기
		final String username="km7081@naver.com";
		final String password="HZ63LFDFYZ9P";
		
		
		
		Properties prop = new Properties();
		prop.put("mail.smtp.starttls.enable", "true"); // tls(보안) 사용 여부
		prop.put("mail.smtp.auth", "true"); // smtp 서버 인증
		prop.put("mail.smtp.host", "smtp.naver.com"); // 이메일전송 smtp서버명
		prop.put("mail.smtp.port", "587"); // smtp 포트번호
		
		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});
		
		try { // 메세지 생성
			
			MimeMessage msg = new MimeMessage(session); // Message로는 UTF-8 셋팅이 안되서 MimeMessage로 해야 한다.
			msg.setFrom(new InternetAddress(username)); // 보내는이메일
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(org.getAnswer_mail())); // 받는이메일
			msg.setSubject(org.getTitle()+" 게시글에 댓글 등록"); // 제목
			msg.setText(org.getTitle()+"의 글에 "+user.getName()+
					"님이 댓글을 등록했습니다. 확인하시려면 아래 링크를 클릭해주세요.\n"+
					"http://192.168.0.29/board_read.do?id="+board_id,"UTF-8"); // 내용
			Transport.send(msg); // 전송
			
		}catch(MessagingException e) {
			System.out.println("이메일 전송 실패");
			e.printStackTrace();
		}
		
		
		response.sendRedirect("/board_read.do?id="+board_id);
		
		return null;
	}

}
