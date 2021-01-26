package com.kh.inherit.exam05;
//자식 클래스
					// Parents 클래스를 상속받음
public class Child extends Parents{
//필드
	private String c_var1; //인스턴스 변수 (자기 객체안에서만 사용되는 변수)
	private static String c_var2;//클래스 변수 
	
//생성
	public Child() {
		System.out.println("자식 객체 생성");
	}
	
//메소드
	public void c_method01() {
		System.out.println("자식 메소드 1");
	}
	
	//정적(static)메소드 - 객체를 생성하지 않고 사용가능한 메소드 
	public static void c_method02() {
		System.out.println("자식 메소드 2");
	}
	
	//오버라이딩 - 부모 클래스에서 final 메소드로 선언된 경우 오버라이딩 불가능 
//	@Override
//	public void p_method02() {
//		System.out.println("자식메소드에서 재정의");
//	}
	
	//객체의 모든 필드값을 문자열 형태로 반환하는 메소드
		//Object 클래서의 toString() 메소드를 오버라이딩해서 사용 가능
	@Override
	public String toString() {
		return "Child [c_var1=" + c_var1 + "]  " + super.toString();
	}
	
	
	// setter & getter
	
	public String getC_var1() {
		return c_var1;
	}
	public void setC_var1(String c_var1) {
		this.c_var1 = c_var1;
	}
	public static String getC_var2() {
		return c_var2;
	}
	public static void setC_var2(String c_var2) {
		Child.c_var2 = c_var2;
	}
	
}
