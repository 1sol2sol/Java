package com.kh.inherit.exam04;
//자식 클래스
					// Parents 클래스를 상속받음
public class Child extends Parents{
//필드
	private String c_var1;
	
//생성
	public Child() {
		//super(); 		//부모 생성자 호출 - 작성안해도 기본 포함되어 있음
		//super("hello", "hihi"); => 부모의 매개변수 있는 생성자 호출 
		System.out.println("자식 객체 생성");
	}
	//매개 변수 있는 생성자 1
	public Child(String c_var1) {
		this.c_var1 = c_var1;
		System.out.println("자식 객체 생성 2");
	}
	// 매개변수 있는 생성자 2 - 부모 클래스 멤버 필드도 초기화 하는 생성자
	public Child(String c_var1, String p_var1, String p_var2) {
		//초기화 방법 1 - 부모 클래스의 setter / getter  메소드로 값 초기화 
//		this.c_var1 = c_var1;
//		super.setP_var1(p_var1);
//		super.setP_var2(p_var2);
		
		//초기화 방법 2 - super() 메소드 사용
		super(p_var1, p_var2); // super()메소드는 항상 생성자 코드의 가장 위에 위치해야 함 ! 
		this.c_var1 = c_var1;
		System.out.println("자식 객체 생성 3");
	}
	
//메소드
	public void c_method01() {
		System.out.println("자식 메소드 1");
		System.out.print("p_method01() 호출 : ");
		p_method01();
		System.out.print("p_method02() 호출 : ");
		p_method02(); // 자식 클래스에서 오버라이딩 된 메소드가 실행 됨
		//자식 클래스에서 부모 멤버에 접근하고자 할때 super. 으로 접근 가능 
		System.out.print("super.p_method02() 호출 : ");
		super.p_method02(); //부모 클래스의 메소드가 실행 됨 
	}
	
	//메소드 오버라이딩
		// 부모 클래스에 정의된 메소드를 다시 재정의해서 사용
	@Override // Annotation : 해당 메소드가 오버라이딩이 맞는지 체크 
	public void p_method02() {
		System.out.println("자식 클래스에서 재정의됨");
	}
	
	//객체의 모든 필드값을 문자열 형태로 반환하는 메소드
		//Object 클래서의 toString() 메소드를 오버라이딩해서 사용 가능
	


	@Override
	public String toString() {
		return "Child [c_var1=" + c_var1 + "]  " + super.toString();
	}
	
}
