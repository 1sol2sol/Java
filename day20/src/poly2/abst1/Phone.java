package poly2.abst1;
//부모 클래스
	//추상 클래스
	// - 미완성 클래스 : 객체를 생성할 수 없음
public abstract class Phone {
	//모든 자식 객체에서 오버라이딩(재정의)해서 사용할 메서드 
//	public void camera() {
//		System.out.println("카메라~!");
//	}
	// 부모 클래스에서는 굳이 내용을 입력해주지 않아도 됨 
	// 그럼 메소드 자체를 만들지 않으면? -> 다형성을 구현하기 힘들어짐 
	
	//추상 메소드로 만들어서 사용
	//- 실제 내용이 없음 : 미완성 메소드 
	//- 반드시 자식 클래스에 오버라이딩(재정의) 해야한다  - 안하면 오류 
	public abstract void camera();
}
