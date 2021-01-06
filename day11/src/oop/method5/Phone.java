package oop.method5;
//전화기 = 이름 + 통신사 + 번호 + 가격
public class Phone {
	//멤버변수
	String name;
	String telecom;
	String number;
	int price;
	
	//멤버 메소드
	
	//- 일반 메소드
	void setup(String name, String telecom, String number, int price) {
		this.setName(name);
		this.setTelecom(telecom);
		this.setNumber(number);
		this.setPrice(price);
	}
	void output() {
		System.out.println("name = " + name);
		System.out.println("telecom = " + telecom);
		System.out.println("number = " + number);
		System.out.println("price = " + price);
	}
	
	//- 세터 메소드(변수와 1:1 매칭)
	void setName(String name) {
		this.name = name;
	}
	void setTelecom(String telecom) {
//		문자열은 참조형이다. 참조형은 ==로 비교하지 않는다. equals()라는 명령으로 비교한다
//		- switch는 상관없이 사용 가능하다
		
//		if(telecom == "SKT" || telecom == "KT" || telecom == "LGT") {//실패할 가능성이 높은 명령
		if(telecom.equals("SKT") || telecom.equals("KT") || telecom.equals("LGT")) {
			this.telecom = telecom;
		}
		
//		switch(telecom) {
//		case "SKT":
//		case "KT":
//		case "LGT":
//			this.telecom = telecom;
//		}
	}
	void setNumber(String number) {
		if(number.length() == 11) {
			this.number = number;
		}
	}
	void setPrice(int price) {
//		price가 0 이상이라면 설정하도록 구현 
//		if(price >= 0) {
//			this.price = price;
//		}
		
//		price가 0보다 작다면 설정하지 않도록 구현
		if(price < 0) {
			return;//메소드를 중지시키는 명령
		}
		this.price = price;
	}
}
