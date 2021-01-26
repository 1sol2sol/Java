package poly1.basic1;

public class Test07 {
	public static void main(String[] args) {
		// instanceof + 다운캐스팅 활용

		Animal[] ani = new Animal[3];

		ani[0] = new Cat();
		ani[1] = new Dog();
		ani[2] = new Cat();

		for (int i = 0; i < ani.length; i++) {
			ani[i].eat();
			ani[i].speak();

			if (ani[i] instanceof Cat) {
				((Cat) ani[i]).grumming();
			} else if (ani[i] instanceof Dog) {
				((Dog) ani[i]).protect();
			}
		}
	}
}
