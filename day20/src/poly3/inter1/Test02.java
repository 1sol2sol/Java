package poly3.inter1;

public class Test02 {
	public static void main(String[] args) {
		// 구현 클래스를 이용한 객체 생성 
		Galaxy20 g = new Galaxy20();
		
		// 객체로 인터페이스 내 상수값 사용
		// - 접근이 가능하지만 경고 발생 
		//  	-> 정적 필드 Bluetooth.FREQUENCY는 정적인 방법으로 접근해야합니다. 
		
		System.out.println(g.FREQUENCY);
		
		g.on();
		g.search();
		Bluetooth.pairing(); // => 정적 메소드는 참조변수를 이용하여 접근 불가능 
		g.connect();		 // 구현 클래스에서 오버라이딩(재정의)한 내용 실행 됨 
		g.off();
		g.samsungPay();
	}
}
