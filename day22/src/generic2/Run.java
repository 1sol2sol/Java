package generic2;

public class Run {

	public static void main(String[] args) {
		// 다형성 구현
		Animal ani1 = new Cat();
		ani1.eat();
		((Cat)ani1).grumming();
		
		// 제네릭 적용
		AnimalController <Cat>ac = new AnimalController<Cat>(new Cat());
		ac.ani.eat();
		ac.ani.grumming();
		
		
		
	}

}
