package poly2.abst2;

import java.util.Scanner;


public class Run01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car c = null;
		while(true) {
			System.out.println("## VR 차량 시승 시뮬레이션 프로그램 ##");
			System.out.println("1. 아반떼");
			System.out.println("2. 그랜져");
			System.out.println("3. 제네시스");
			System.out.println("9. 그만하기");
			System.out.print("시승할 차번호를 선택하세요 : ");
			int select = sc.nextInt();
			
			if(select > 0 && select <=3) {
				switch(select) {
				case 1:
					c = new Avante();			
					break;
				case 2:
					c = new Grandeur();
					break;
				case 3:
					c = new Genesis();
					break;
				}
				c.engineStart();
				c.gearChange();
				c.windowControl();
			}else if(select == 9) {
				System.out.println("종료합니다~!");
				sc.close();
				return;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");			
			}
		}		
	}
}