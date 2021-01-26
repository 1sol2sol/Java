package inherit.exam02;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Wizard w = null; // 마법사 참조 변수
		BladeMaster b = null; // 검사 참조 변수

		while (true) {
			System.out.println("1. 캐릭터 생성");
			System.out.println("2. 캐릭터 정보보기");
			System.out.println("9. 종료");
			System.out.println("메뉴 선택: ");
			int select = sc.nextInt();
			switch (select) {
			case 1: // 캐릭터 생성
				System.out.println("### 캐릭터 생성!! ###");
				System.out.println("이름을 입력하세요 : ");
				String name = sc.next();
				System.out.println("직업을 선택하세요(1.마법사 / 2.검사) : ");
				int job = sc.nextInt();

				switch (job) {
				case 1: // 마법사
					w = new Wizard(name, "마법사"); // 마법사 객체 생성

					break;
				case 2: // 검사
					b = new BladeMaster(name, "검사"); // 검사 객체 생성

					break;
				default:
					System.out.println("잘못된 직업을 선택하셨습니다.");
				}
				break;
			case 2: // 캐릭터 정보보기
				if (w != null) {
					System.out.println(w);
					w.attack();
					w.defense();
				}
				if (b != null) {
					System.out.println(b);
					b.attack();
					b.defense();
				} 
				if(w == null && b == null) {
					System.out.println("캐릭터를 먼저 생성한 후 확인해주세요!");
				}
				break;
			case 9:
				System.out.println("종료");
				return;
			}
		}
	}
}
