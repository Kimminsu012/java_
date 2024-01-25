package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.member_dao;
import DTO.LoginHistory;
import DTO.member;

public class member_mypage implements member_action{
	private member_dao dao = new member_dao();

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		member user = (member)request.getSession().getAttribute("user");
		
		List<LoginHistory> login_list = dao.getHisotry( user.getNum() );
		
		
		request.setAttribute("login_list", login_list);
		request.setAttribute("prt", "member/info");
		return "/";
	}
}
