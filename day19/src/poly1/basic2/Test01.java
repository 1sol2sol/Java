package poly1.basic2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Phone[] p = new Phone[5];
		p[0] = new GalaxyNote20("삼성", "SGN-01", "SKT", "01012345678", "블루");
		p[1] = new GalaxyNote20("삼성", "SGN-02", "KT", "01011112222", "블랙");
		p[2] = new Iphone12("애플", "AP12-01", "LGU", "01023234545", "화이트");
		p[3] = new Iphone12("애플", "AP12-02", "KT", "01052524587", "블루");
		p[4] = new GalaxyFold2("삼성", "SGP-01", "SKT", "01025874563", "골드");

		System.out.println("번호\t제조사\t시리얼넘버\t\t통신사\t전화번호\t\t색상");
		for (int i = 0; i < p.length; i++) {
			System.out.println((i + 1) + "\t" + p[i].getManufacture() + "\t" + p[i].getSerialNumber() + "\t\t"
					+ p[i].getMobileCarrier() + "\t" + p[i].getPhoneNumber() + "\t" + p[i].getColor());
		}
		while (true) {
			System.out.println("어떤 휴대폰을 사용할 것입니까? 1~5까지 숫자를 입력해주세요.");
			System.out.println("9를 입력시 시스템을 종료합니다.");
			int select = sc.nextInt();
			if(select<1 || select>5) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			switch (select) {
			case 1:
				p[select - 1].call();
				p[select - 1].text();
				p[select - 1].photo();
				break;
			case 2:
				p[select - 1].call();
				p[select - 1].text();
				p[select - 1].photo();
				break;
			case 3:
				p[select - 1].call();
				p[select - 1].text();
				p[select - 1].photo();
				break;
			case 4:
				p[select - 1].call();
				p[select - 1].text();
				p[select - 1].photo();
				break;
			case 5:
				p[select - 1].call();
				p[select - 1].text();
				p[select - 1].photo();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;

			}
			if (p[select - 1] instanceof GalaxyNote20) {
				((GalaxyNote20) p[select - 1]).samsungpay();
			} else if (p[select - 1] instanceof Iphone12) {
				((Iphone12) p[select - 1]).gesture();
			} else {
				((GalaxyFold2) p[select - 1]).screenFold();
			}

		}
	}
}
