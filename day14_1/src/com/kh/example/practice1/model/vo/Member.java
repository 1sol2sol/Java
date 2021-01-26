package com.kh.example.practice1.model.vo;

public class Member {
	//필드 선언
	private String memberId, memberPwd, memberName;
	private int age;
	private char gender;
	private String phone, email;
	
	//생성자
	public Member() {} // 디폴트(기본) 생성자 
	
	//메소드 
	public void changeName(String name) {
	//	memberName = name;
		this.memberName = name;
	}
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
}
