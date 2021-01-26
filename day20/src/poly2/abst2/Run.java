package poly2.abst2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Car[] c = new Car[3];
		c[0] = new Avante();
		c[1] = new Grandeur();
		c[2] = new Genesis();

		System.out.println("### VR 차량 시승 시뮬레이션 프로그램 ###");
		System.out.println("1. 아반떼");
		System.out.println("2. 그랜져");
		System.out.println("3. 제네시스");
		System.out.println("9. 그만하기");

		while (true) {
			System.out.println();
			System.out.print("시승할 차 번호를 선택하세요 : ");
			System.out.println();
			int select = sc.nextInt();

			switch (select) {
			case 1:
				System.out.println("[ " + c[select - 1].getClass().getSimpleName() + " 탑승 ]");
				c[select - 1].engineStart();
				c[select - 1].gearChange();
				c[select - 1].windowControl();
				break;
			case 2:
				System.out.println("[ " + c[select - 1].getClass().getSimpleName() + " 탑승 ]");
				c[select - 1].engineStart();
				c[select - 1].gearChange();
				c[select - 1].windowControl();
				break;
			case 3:
				System.out.println("[ " + c[select - 1].getClass().getSimpleName() + " 탑승 ]");
				c[select - 1].engineStart();
				c[select - 1].gearChange();
				c[select - 1].windowControl();
				break;
			case 9:
				System.out.println("프로그램 실행을 종료합니다");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				break;
			}

		}

	}

}
