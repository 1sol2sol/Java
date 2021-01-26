package inherit.exam01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 각 동물 객체 생성
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. 고양이");
			System.out.println("2. 강아지");
			System.out.println("3. 토끼");
			System.out.println("9. 종료");
			System.out.println("어떤 동물이 좋으세요? : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				Cat c = new Cat();
				System.out.println("[Cat 객체]");
				c.walk();
				c.eat();
				c.speak();
				c.grumming();
				c.climb();
				break;
			case 2:
				Dog d = new Dog();
				System.out.println("[Dog 객체]");
				d.walk();
				d.eat();
				d.speak();
				d.protect();
				d.sniff();
				d.dig();
				break;
			case 3:
				Rabbit r = new Rabbit();
				System.out.println("[Rabbit 객체]");
				r.walk();
				r.eat();
				r.speak();
				r.listen();
				r.jump();
				break;
			case 9:
				System.out.println("종료합니다");
				return;
			}

		}
	}
}
