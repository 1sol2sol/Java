package com.kh.inherit.exam02;
//부모 클래스
public class Parents {
//필드
	private String p_var1;
	protected String p_var2; //접근 제한자를 protected로 설정
	
//생성자
	public Parents() {
		System.out.println("부모 객체 생성!!");
	}
	
//메소드
	public void p_method01() {
		System.out.println("부모 메소드 1");
	}
	protected void p_method02() { //접근 제한자를 protected로 설정
		System.out.println("부모 메소드 2");
	}
}
