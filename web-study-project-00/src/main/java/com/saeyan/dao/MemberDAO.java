package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

	 public int insertMember(MemberVO vo) {
		 
		 Connection con = null;
		 PreparedStatement pstmt = null;
		 int result = -1;
		 
		 String sql ="insert into member(userid, pass, name, nick, "
		 		+ "email, phone, admin, address)values(?, ?, ?, ?, ?, ?, ?,?)";
		 
		 try {
			 con = DBManager.getConnection();
			 
			 pstmt = con.prepareStatement(sql);
			 
			 pstmt.setString(1, vo.getUserid());
			 pstmt.setString(2, vo.getPass());
			 pstmt.setString(3, vo.getName());
			 pstmt.setString(4, vo.getNick());
			 pstmt.setString(5, vo.getEmail());
			 pstmt.setString(6, vo.getPhone());
			 pstmt.setInt(7, 0); //기본은 일반회원
			 pstmt.setString(8, vo.getAddress());
			 
			 result = pstmt.executeUpdate();
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			DBManager.close(con, pstmt);
		}
		 	 		 
		 
		return result;
	 }

	 public int idOk(String userid) {
		 
		 int result = -1;
		 String sql = "select userid from member where userid = ?";
		 
		 try(
				 
				 Connection con = DBManager.getConnection();
				 PreparedStatement pstmt = con.prepareStatement(sql)){
			 
			 	pstmt.setString(1, userid);
			 	ResultSet rs = pstmt.executeQuery();
			 	
			 	
			 	if(rs.next()) result = 1; //아이디 존재
			 	else result = -1; //아이디 없음
			 
		 }catch (Exception e) {
			 
			 e.printStackTrace();
			 
		 }
		 
		return result;
		
	 }
		
	
	
}
