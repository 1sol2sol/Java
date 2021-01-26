package poly1.basic1;

public class Test01 {

	public static void main(String[] args) {
		//상속관계의 객체 기본 사용 방법 
		//자식 클래스를 이용해서 참조변수 및 객체를 만들고, 객체의 주소를 담아서 사용
		//각 자식 객체의 참조변수를 이용해서 멤버에 접근
		System.out.println("## 고양이 ##");
		Cat c = new Cat();
		c.eat();
		c.speak();
		
		System.out.println("## 강아지 ##");
		Dog d = new Dog();
		d.eat();
		d.speak();
	}

}
