package oop.method2;

public class Test01 {
public static void main(String[] args) {
	//객체 생성
	Cafe item1 = new Cafe();
	Cafe item2 = new Cafe();
	Cafe item3 = new Cafe();
	
	//생성 초기화
	item1.setup("아메리카노", "음료", 1500, false);
	item2.setup("카페라떼", "음료", 2000, true);
	item3.setup("샌드위치", "식사", 3000, true);
	
	//출력
	item1.output();
	item2.output();
	item3.output();
	
}
}
