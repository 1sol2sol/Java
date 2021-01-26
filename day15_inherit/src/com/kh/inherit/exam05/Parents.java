package com.kh.inherit.exam05;
//부모 클래스
public class Parents {
//	public final class Parents{ //final 클래스는 상속 불가능
//<필드>
	private String p_var1;
	private String p_var2;
	
//<생성자>
	public Parents() {
		System.out.println("부모 객체 생성");
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
	//final 메소드 - 자식 클래스에서 오버라이딩 불가능 
	public final void p_method02() {
		System.out.println("부모 메소드 2");
	}

	@Override
	public String toString() {
		return "Parents [p_var1=" + p_var1 + ", p_var2=" + p_var2 + "]";
	}
	
}
