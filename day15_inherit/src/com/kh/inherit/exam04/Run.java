package com.kh.inherit.exam04;

public class Run {
	/**
	 * super. / super() 실습
	 * super. : 부모 객체 참조변수
	 * super() : 부모 생성자 호출 메소드 
	 */
	public static void main(String[] args) {
		System.out.println("### 부모 객체 참조변수 super. 사용 ###");
		Child ch = new Child();
		ch.c_method01();
		
		System.out.println("### 상속과 생성자 1 ###");
		//자식 생성자() -> 부모 생성자() -> 자식 생성자() 순으로 실행됨
		//자식 생성자의 코드 맨 위에 자동으로 부모 메소드를 호출하는 super()가 포함되어 있음 
		Child ch2 = new Child();
		System.out.println(ch2);
		
		System.out.println("### 상속과 생성자 2 ###");
		//매개 변수 있는 생성자 사용 
		Child ch3 = new Child("Hello");
		System.out.println(ch3);
		
		Child ch4 = new Child("Hello", "수업 끝~", "눈온다~");
		System.out.println(ch4);
	}

}
