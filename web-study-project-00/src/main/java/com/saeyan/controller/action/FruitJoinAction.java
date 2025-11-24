package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

public class FruitJoinAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 request.setCharacterEncoding("UTF-8");
		 
		 MemberVO vo = new MemberVO();
		 vo.setUserid(request.getParameter("userid"));
		 vo.setPass(request.getParameter("pass"));
		 vo.setName(request.getParameter("name"));
		 vo.setNick(request.getParameter("nick"));
		 vo.setEmail(request.getParameter("email"));
		 vo.setPhone(request.getParameter("phone"));
		 vo.setAddress(request.getParameter("address"));
		 vo.setNum(0);
		 
		 MemberDAO mdao = MemberDAO.getInstance();
		 int result = mdao.insertMember(vo);
		 
		 		    
		 if(result > 0) {
			    response.sendRedirect("MemberServlet?command=memberLogin");
			} else {
			    request.setAttribute("message", "회원가입에 실패했습니다.");
			    request.getRequestDispatcher("/member/fruitJoin.jsp").forward(request, response);
			}

	}

}
