package service.board;

import java.io.IOException;

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
		
		
		
		response.sendRedirect("/board_read.do?id="+board_id);
		
		return null;
	}

}
