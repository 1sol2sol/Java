package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		//목표 : 초기화 및 출력의 단순화
		//- 코드는 그대로 실행이 되어야한다
		//- 객체는 1개인데 코드는 여러줄
		//- 코드를 묶어서 실행할 수 있다면 좋겠다 
		
		
		//객체 생성 지역변수
		Item item1 = new Item();//전달하는쪽
		Item item2 = new Item();
		Item item3 = new Item();
		
		//초기화
		item1.setup("A00001", "참이슬", "주류", 1200);
		item2.setup("A00002", "처음처럼", "주류", 1300);
		item3.setup("B00001", "고무장갑", "생필품", 2000);
		
		//출력
		item1.output(); //item1을 주인공으로 output 진행
		item2.output(); //item2을 주인공으로 output 진행
		item3.output(); //item3을 주인공으로 output 진행
	}
}
