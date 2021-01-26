package com.kh.inherit.exam02;

public class Run {
	/**
	 * 상속 접근 제한자 실습(같은 패키지)
	 */
	public static void main(String[] args) {
		System.out.println("### 자식 클래스로 객체 생성 및 사용 ###");
		Child ch = new Child();
		
		//자식 클래스의 메소드 내부에서 부모 객체 멤버 접근 
		ch.c_method01();
		
		//같은 패키지의 다른 클래스에서 자식 객체를 이용해 부모 객체 멤버에 접근 
		//ch.p_var1 = "hihi"; 	// private 접근 제한자 오류 발생
		ch.p_var2 = "hihi"; 	//protected 접근 제한자 - 정상 접근 가능 
		System.out.println(ch.p_var2);
		ch.p_method01();		//public 접근 제한자 - 정산 접근 가능
		ch.p_method02();		//protected 접근 제한자 - 정상 접근 가능
		
	}

}
