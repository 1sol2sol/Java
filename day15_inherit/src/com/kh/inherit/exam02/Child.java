package com.kh.inherit.exam02;
//자식 클래스
					// Parents 클래스를 상속받음
public class Child extends Parents{
//필드
	private String c_var1;
	
//생성
	public Child() {
		System.out.println("자식 객체 생성");
	}
	
//메소드
	public void c_method01() {
		System.out.println("자식 메소드 1");
		
		//자식 클래스 내부에서 부모 클래스 멤버 접근
		//p_var1 = "Hello" // p_var1은 접근제한자가 private이므로 접근불가
		
		p_var2 = "p_var2 값 : " + "Hello"; // 접근제한자가 protected라서 접근 가능
		                  // protected 제한자는 같은 패키지 내부에서 사용이 가능하다 
		System.out.println(p_var2);
		p_method01(); //접근제한자가 public이라서 접근 가능
		p_method02(); //접근제한자가 protected라서 접근 가능 
		
		
	}
}
