package com.saeyan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {

	public static Connection getConnection() {
		Connection con = null;
		
		try {Class.forName("com.mysql.cj.jdbc.Driver");
		
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/edudb?serverTimezone=Asia/seoul",
					"jdbctest",
					"1234"
					);
		}catch(Exception e) {
			e.printStackTrace();
		}
						
		return con;
     	}
	
	public static void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
			con.close();
		}catch(Exception e) {
			
		}
	}
	 
	public static void close(Connection con, Statement stmt) {
		try {
			stmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	    Connection con = DBManager.getConnection();
	    System.out.println(con != null ? "DB 연결 성공!!" : "DB 연결 실패");
	}
}

