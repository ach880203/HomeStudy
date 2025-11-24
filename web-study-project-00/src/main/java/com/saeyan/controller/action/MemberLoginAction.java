package com.saeyan.controller.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.saeyan.dao.MemberDAO;
import com.saeyan.dto.MemberVO;

public class MemberLoginAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userid = request.getParameter("userid");
        String pass = request.getParameter("pass");

        MemberDAO mdao = MemberDAO.getInstance();
        MemberVO mvo = mdao.getMember(userid);

        String url = "member/memberLogin.jsp"; // 실패 시 돌아오기

        if (mvo != null && mvo.getPass().equals(pass)) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", mvo);

            // 로그인 성공 → fruitHome으로 이동
            url = "/member/fruitHome.jsp";
        } else {
            request.setAttribute("message", "아이디 또는 비밀번호 확인해주세요");
        }

        request.getRequestDispatcher(url).forward(request, response);
    }
}
