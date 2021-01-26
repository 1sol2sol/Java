package com.kh.inherit.exam03;
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
	}
	
	//메소드 오버라이딩
		// 부모 클래스에 정의된 메소드를 다시 재정의해서 사용
	@Override // Annotation : 해당 메소드가 오버라이딩이 맞는지 체크 
	public void p_method02() {
		System.out.println("자식 클래스에서 재정의됨");
	}
	
	//객체의 모든 필드값을 문자열 형태로 반환하는 메소드
		//Object 클래서의 toString() 메소드를 오버라이딩해서 사용 가능
	
	public String inform() {
		return "Child [c_var1=" + c_var1 + "]";
	} //=> 객체 정보를 설명하기 위해 이렇게 별도의 메소드를 만들어줘도 되지만 
	//     이미 만들어진 메소드가 있으므로 아래와 같이 오버라이딩 하는 방법을 쓴다 

	@Override
	public String toString() {
		return "Child [c_var1=" + c_var1 + "]";
	}
	
}
