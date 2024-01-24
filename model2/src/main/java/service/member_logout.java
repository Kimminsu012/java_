package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

public class member_logout implements member_action{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.getSession().removeAttribute("user");
		
//		HttpSession session = request.getSession(false);
//		if( session != null ) {
//			session.invalidate();
//		}

		response.sendRedirect("/");
		
		return null;
	}
}
