package com.javaex.vo;

public class EmaillistVo {
	private int no;
	private String last_name;
	private String first_name;
	private String email;
	
	public EmaillistVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmaillistVo(String last_name, String first_name, String email) {
		super();
		this.last_name = last_name;
		this.first_name = first_name;
		this.email = email;
	}

	public EmaillistVo(int no, String last_name, String first_name, String email) {
		super();
		this.no = no;
		this.last_name = last_name;
		this.first_name = first_name;
		this.email = email;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmaillistVo [no=" + no + ", last_name=" + last_name + ", first_name=" + first_name + ", email=" + email
				+ "]";
	}
	
	
}
