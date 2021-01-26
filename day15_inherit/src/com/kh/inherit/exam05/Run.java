package com.kh.inherit.exam05;

public class Run {
	/**
	 * static, final 예약어
	 */
	public static void main(String[] args) {
		System.out.println("### 인스턴스 변수와 클래스 변수 ###");
		Child ch1 = new Child();
		Child ch2 = new Child();
		
		ch1.setC_var1("1번 객체의 1번 변수");
		ch1.setC_var2("1번 객체의 2번 변수");
		ch2.setC_var1("2번 객체의 1번 변수");
		ch2.setC_var2("2번 객체의 2번 변수");
		
		
		System.out.println(ch1.getC_var1());
		System.out.println(ch1.getC_var2());
		System.out.println(ch2.getC_var1());
		System.out.println(ch2.getC_var2());
		
		System.out.println("### 정적(static) 메소드 ###");
		Child ch3 = new Child();
		
		ch3.c_method01();
		ch3.c_method02();
	
		Child.c_method02();
		
	}

}
