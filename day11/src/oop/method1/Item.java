package oop.method1;

//상품 = 코드+이름+분류+가격
public class Item {
	//멤버 변수(필드)
	//= 객체의 정보를 저장 (데이터를 보관)
	String code;
	String name;
	String type;
	int price;
	
	//멤버 메소드
	//= 객체에서 사용할 코드를 저장(기능)
	
	//출력 코드를 필요할 때 부를 수 있도록 저장
	//= 주인공이 그때그때 다르다(item1,item2...)
	//= 주인공을 의미하는 키워드로 this를 사용
	//= this는 정확히 "객체 자신"을 의미
	void output() {
		System.out.println(this.code);
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
	}
	
	//초기화 코드를 필요할 때 부를 수 있도록 저장
	//= 실행될 때마다 다른 데이터가 설정되어야 함 
	//= 이 메소드는 실행하려면 데이터가 필요하다
	//= 준비물(매개변수라 부름)
	//= 매개변수는() 안에 선언만 하면 된다
	//= 호출할 때 할당될 데이터를 전달해야 한다 
	void setup(String a, String b, String c, int d) {
		this.code = a; // 수신하는쪽
		this.name = b;
		this.type = c;
		this.price = d;
	}
}