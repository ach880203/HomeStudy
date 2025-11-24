package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.MemberDAO;

public class IdCheckAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String userid = request.getParameter("userid");
		
		MemberDAO mdao = MemberDAO.getInstance();
		int result = mdao.idOk(userid);
		
		request.setAttribute("userid", userid);
		request.setAttribute("result", result);
		
		request.getRequestDispatcher("/member/fruitJoin.jsp")
		.forward(request, response);
		
	}

}
