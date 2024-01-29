package service;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import DAO.member_dao;
import DTO.member;

public class member_service implements member_action{
	private member_dao mdao = new member_dao();
	String path="C:\\Users\\dw\\git\\java_\\model2\\src\\main\\webapp\\static\\img";
	
	int size = 1024*1024*20;
	
	public String[] emailList() {
		return mdao.findAllEmail();
	}
	
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
			String email = null;
			String pw = null;
			String name = null;
			String tel = null;
			String face = null;
			
			try {
				MultipartRequest mr = new MultipartRequest(request, path, size, "UTF-8", new DefaultFileRenamePolicy());
				
				
				
				
					email = mr.getParameter("email");
					name = mr.getParameter("name");
					pw = mr.getParameter("pin");
					tel = mr.getParameter("tel");
					
					Enumeration em = mr.getFileNames();
					String files = (String)em.nextElement();
					face = mr.getFilesystemName(files);
				
				
			}catch(Exception e) {
				System.out.println("파일 업로드 실패");
				e.printStackTrace();
			}
			
			
			int id = mdao.insert( new member(email,pw,name,tel) );
			mdao.pictureInsert(face, id );
			
			response.sendRedirect("/members/signIn");
			
			return null;
			
		}
	
}
