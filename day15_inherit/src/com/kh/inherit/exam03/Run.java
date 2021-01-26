package com.kh.inherit.exam03;

public class Run {
	/**
	 * 오버라이딩 실습
	 */
	public static void main(String[] args) {
		System.out.println("### 부모 클래스로 객체 생성 및 사용 ###");
		Parents pa = new Parents();
		pa.p_method01();
		pa.p_method02();
		
		System.out.println("### 자식 클래스로 객체 생성 및 사용 ###");
		Child ch = new Child();
		ch.c_method01();
		ch.p_method01();
		ch.p_method02(); //자식 클래스에서 재정의된 메소드 실행됨
		
		System.out.println("### Object 클래스의 toString() 오버라이딩 ###");
		System.out.println("Parents 객체의 toString() : " + pa.toString());
		System.out.println("Parents 참조변수 출력 : " + pa);
		System.out.println("Child 객체의 toString() : " + ch.toString());
		System.out.println("Child 참조변수 출력 : " + ch);
		
		/*
		 * 오버라이딩 전 결과값 Parents 객체의 toString() : com.kh.inherit.exam03.Parents@4926097b
		 * Parents 참조변수 출력 : com.kh.inherit.exam03.Parents@4926097b 
		 * Child 객체의 toString(): com.kh.inherit.exam03.Child@762efe5d 
		 * Child 참조변수 출력 : com.kh.inherit.exam03.Child@762efe5d
		 */
	}

}
