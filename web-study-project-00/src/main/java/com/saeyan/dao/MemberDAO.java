package com.saeyan.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.saeyan.dto.MemberVO;
import com.saeyan.util.DBManager;

public class MemberDAO {

	 public static MemberDAO instance = new MemberDAO();
	 
	 private MemberDAO() {
		 
	 }
	 
	 public static MemberDAO getInstance() {
		 return instance;
	 }
	
	 
	   //DB연결 확인
	 public MemberVO getMember(String userid) {
		    Connection con = null;
		    Statement stmt = null;
		    ResultSet rs = null;
		    MemberVO vo = null;

		    String sql = "SELECT * FROM member WHERE userid = '" + userid + "'";

		    try {
		        con = DBManager.getConnection();
		        stmt = con.createStatement();
		        rs = stmt.executeQuery(sql);

		        if (rs.next()) {
		            vo = new MemberVO();
		            vo.setUserid(rs.getString("userid"));
		            vo.setName(rs.getString("name"));
		            vo.setPass(rs.getString("pass"));
		            vo.setEmail(rs.getString("email"));
		            vo.setPhone(rs.getString("phone"));
		            vo.setAdmin(rs.getInt("admin"));
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        DBManager.close(con, stmt, rs);
		    }

		    return vo;
		}// end DB확인

	
	
	
}
