package com.kh.inherit.exam03;
//부모 클래스
public class Parents {
//필드
	private String p_var1;
	private String p_var2;
	
//생성자
	public Parents() {
		System.out.println("부모 객체 생성!!");
	}
	
//메소드
	public void p_method01() {
		System.out.println("부모 메소드 1");
	}
	public void p_method02() {
		System.out.println("부모 메소드 2");
	}

	@Override // => 여기서의 오버라이딩은 조상 클래스 Object 객체를 오버라이딩 한 것이다. 
	public String toString() {// => to String은() 객체를 하나의 문자열로 표현(설명)해주기 위한 메소드 
		return "Parents [p_var1=" + p_var1 + ", p_var2=" + p_var2 + "]";
	}
	
}
