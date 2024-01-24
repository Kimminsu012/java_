package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class member_mypage implements member_action{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		request.setAttribute("prt", "member/info");
		return "/";
	}
}
