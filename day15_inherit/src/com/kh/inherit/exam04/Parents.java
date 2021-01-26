package com.kh.inherit.exam04;
//부모 클래스
public class Parents {
//<필드>
	private String p_var1;
	private String p_var2;
	
//<생성자>
	public Parents() {
		System.out.println("부모 객체 생성");
	}
//<매개 변수 있는 생성자>
	public Parents(String p_var1, String p_var2) {
		this.p_var1 = p_var1;
		this.p_var2 = p_var2;
	}
//<메소드>
	
	public String getP_var1() {
		return p_var1;
	}
	public void setP_var1(String p_var1) {
		this.p_var1 = p_var1;
	}
	public String getP_var2() {
		return p_var2;
	}
	public void setP_var2(String p_var2) {
		this.p_var2 = p_var2;
	}
	
	public void p_method01() {
		System.out.println("부모 메소드 1");
	}
	public void p_method02() {
		System.out.println("부모 메소드 2");
	}

	@Override
	public String toString() {
		return "Parents [p_var1=" + p_var1 + ", p_var2=" + p_var2 + "]";
	}
	
}
