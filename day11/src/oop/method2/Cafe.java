package oop.method2;

public class Cafe {
	// 카페 = 이름(String)+분류(String)+판매가격(int)+행사여부(boolean)
	// 행사를 하고 안하고 2가지 있을경우는 boolean이 편하다

	// 멤버변수,인스턴스 변수, 멤버 필드(field)
	// = 객체의 데이터 저장
	String menu, category;
	int price;
	boolean event;

	// 멤버 메소드(method)
	// = 각종 필요한 코드 저장

	// 초기화 method 코드를 필요할때 부를 수 있도록 저장
	void setup(String menu, String category, int price, boolean event) {
		this.menu = menu;
		this.category = category;
		this.price = price;
		this.event = event;
	}

	// 출력 method 코드를 필요할때 부를 수 있도록 저장
	void output() {
		System.out.print(this.menu + "\t");
		System.out.print(this.category + "\t");
		
		
		if(this.event) {
			int discount = this.price * 90/100;
			System.out.print(discount+"원(정가 :"+this.price+"원)");
		}
		else {
			System.out.print(this.price + "\t");
		}
		

		if (this.event) {
			System.out.print("**현재 할인 행사중입니다**");
		}
		System.out.println();
	}
}