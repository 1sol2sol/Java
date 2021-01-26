package poly1.basic1;

public class Test02 {

	public static void main(String[] args) {
		//업캐스팅
		//상속관계일 경우, 부모클래스로 참조 변수를 만들고 자식 객체의 주소를 담아서 사용 가능 
		//부모 참조변수를 이용해서 각 객체의 멤버에 접근이 가능
		Animal ani; //부모 클래스 참조변수
		
		ani = new Cat();
		ani.eat();
		ani.speak();
		
		ani = new Dog();
		ani.eat();
		ani.speak();
		
		
	}

}
