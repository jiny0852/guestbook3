package com.javaex.vo;

public class PersonVo {
	
	//필드
	private int no;
	private String name;
	private String password;
	private String content;
	private String regDate;
	
	
	//생성자
	public PersonVo() {
	}
	public PersonVo(String name, String password, String content, String regDate) {
		super();
		this.name = name;
		this.password = password;
		this.content = content;
		this.regDate = regDate;
	}
	public PersonVo(int no, String name, String password, String content, String regDate) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.content = content;
		this.regDate = regDate;
	}
	
	
	
	//메서드 gs
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	


	//메서드 일반
	@Override
	public String toString() {
		return "PersonVo [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}

	
	

}
