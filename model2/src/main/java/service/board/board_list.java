package service.board;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class board_list implements board_action {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws IOException {

		request.setAttribute("prt", "board/index");
		return "/";
	}

}
