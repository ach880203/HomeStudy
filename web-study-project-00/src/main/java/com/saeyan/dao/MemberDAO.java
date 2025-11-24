package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.saeyan.dto.MemberVO;

import util.DBManager;

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
		    PreparedStatement pstmt = null;
		    ResultSet rs = null;
		    MemberVO vo = null;

		    String sql = "SELECT * FROM member WHERE userid = ?";

		    try {
		        con = DBManager.getConnection();
		        pstmt = con.prepareStatement(sql);
		        pstmt.setString(1, userid);
		        rs = pstmt.executeQuery();

		        if (rs.next()) {
		            vo = new MemberVO();
		            vo.setNum(rs.getInt("num"));
		            vo.setUserid(rs.getString("userid"));
		            vo.setPass(rs.getString("pass"));
		            vo.setName(rs.getString("name"));
		            vo.setNick(rs.getString("nick"));
		            vo.setEmail(rs.getString("email"));
		            vo.setPhone(rs.getString("phone"));
		            vo.setAdmin(rs.getInt("admin"));
		            vo.setAddress(rs.getString("address"));
		            vo.setWritedate(rs.getTimestamp("writedate"));
		        }

		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        DBManager.close(con, pstmt, rs);
		    }

		    return vo;
		}// end DB확인

	
	
	
}
