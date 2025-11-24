package com.saeyan.dto;

import java.sql.Timestamp;

public class MemberVO {
    private int num;
    private String userid;
    private String pass;
    private String name;
    private String nick;
    private String email;
    private String phone;
    private int admin;
    private String address;
    private Timestamp writedate;

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNick() {
        return nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Timestamp getWritedate() {
        return writedate;
    }
    public void setWritedate(Timestamp writedate) {
        this.writedate = writedate;
    }

    @Override
    public String toString() {
        return "MemberVO [num=" + num + ", userid=" + userid + ", name=" + name + "]";
    }
}
