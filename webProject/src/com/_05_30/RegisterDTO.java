package com._05_30;

public class RegisterDTO {
	//Data Transfer Object
	String id;
	String pw;
	String user_num;
	String age;
	String name;
	
	public RegisterDTO() {
		super();
	}
	
	public RegisterDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public void setAdditionalInfo(String user_num, String age, String name) {
		this.user_num = user_num;
		this.age = age;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		String result = 
				"아이디 (" + id + ")의 정보는 "
						+ "[이름 :" + name + ", "
								+ "나이 : " + age + ", "
										+ "사용자 번호 : " + user_num + "] 입니다.</br>";
		
		return result;
	}
	
	

}
