package com.saeyan.dto;

public class MemberVO {

	/*
	 * 
	 *  name varchar(30),
    userid varchar(30) primary key,
    pass varchar(30) not null,
    nick varchar(30),
    email varchar(30),
    phone char(13),
    admin int(1)    
    
	 */
	
	private String name;
	private String userid;
	private String pass;
	private String dnick;
	private String email;
	private String phone;
	private int admin;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDnick() {
		return dnick;
	}
	public void setDnick(String dnick) {
		this.dnick = dnick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", userid=" + userid + ", pass=" + pass + ", dnick=" + dnick + ", email="
				+ email + ", phone=" + phone + ", admin=" + admin + "]";
	}
	
	
	
	
}
