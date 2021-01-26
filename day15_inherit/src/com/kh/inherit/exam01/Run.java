package com.kh.inherit.exam01;

public class Run {
	/**
	 * 상속 기본 실습
	 */
	public static void main(String[] args) {
		System.out.println("### 부모 클래스로 객체 생성 및 사용 ###");
		//일반 클래스와 동일하게 사용 
		Parents pa = new Parents();
		pa.p_method01();
		pa.p_method02();
		//모든 클래스는 Object의 후손이기 때문에 Object 클래스 멤버 사용 가능 
		System.out.println(pa.toString());
		//=> 결과 : com.kh.inherit.exam01.Parents@7637f22 (패키지명 / 식별값(주소))
		
		System.out.println("### 자식 클래스로 객체 생성 및 사용 ###");
		Child ch = new Child(); //자식 객체 만들면서 부모 객체 같이 생성 
		ch.c_method01();
		
		//자식 객체를 이용해서 부모 클래스에 정의된 메소드 사용
		ch.p_method01();
		ch.p_method02();
	}

}
