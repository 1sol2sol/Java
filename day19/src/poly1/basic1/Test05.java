package poly1.basic1;

public class Test05 {
	public static void main(String[] args) {
		// 업 캐스팅을 해서 사용할 경우 자식 클래스의 멤버에는 접근 불가능
		// 다운 캐스팅
		// - 업 캐스팅을 수행한 객체를 임시로 원래 형태로 되돌리는 작업
		Animal ani;

		ani = new Cat();
		ani.eat();
		ani.speak();
		// ani.grumming(); 접근 불가능
		((Cat) ani).grumming(); // 다운 캐스팅

		ani = new Dog();
		ani.eat();
		ani.speak();
//	ani.protect(); 접근 불가능 
		((Dog) ani).protect(); // 다운 캐스팅

	}
}
