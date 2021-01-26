package poly1.basic1;

import java.util.Scanner;

public class Test03 {
	//업캐스팅을 사용하여 중복되는 코드를 줄여 줄 수 있음.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.고양이 / 2.강아지 : ");
		int select = sc.nextInt();
		
//		//업캐스팅 미 적용 코드 
//		switch(select) {
//		case 1:
//			Cat c = new Cat();
//			c.eat();
//			c.speak();
//			break;
//		case 2:
//			Dog d = new Dog();
//			d.eat();
//			d.speak();
//			break;
//		default:
//		}
			
		//업 캐스팅 적용 코드
		Animal ani;
		switch(select) {
		case 1:
			ani = new Cat();
			break;
		case 2:
			ani = new Dog();
			break;
		default:
			ani = new Animal();
		}
		ani.eat();
		ani.speak();
	}

}
