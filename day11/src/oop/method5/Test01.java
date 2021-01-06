package oop.method5;

public class Test01 {
	public static void main(String[] args) {
		//생성
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		
		//초기화
		p1.setup("갤럭시폴드2", "SKT", "01012345678", 2500000);
		p2.setup("아이폰12", "LGT", "01011112222", 1800000);
		p3.setup("V60", "KT", "01077778888", 1500000);
		
		p3.setPrice(-1500000);//차단
//		p3.price = -1500000;//차단안됨
//		p3.setPrice = -1500000;//말이 안되는 코드
		
		//출력
		p1.output();
		p2.output();
		p3.output();
	}
}