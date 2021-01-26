package poly3.inter1;

public class Test01 {
	public static void main(String[] args) {
		// 인터페이스는 객체 생성 불가능 !!!
		// Bluetooth bt = new Bluetooth(); => 오류 발생 
		
		// 인터페이스 내 상수값 사용 
		// - 정적 상수이기 때문에 객체를 생성하지 않아도 사용 가능 
		// - 인터페이스명.상수명;
		System.out.println(Bluetooth.FREQUENCY);
		
		// 인터페이스 내 정적 메소드 사용 
		// - 객체를 생성하지 않아도 사용 가능 
		// - 인터페이스명.메소드명();
		Bluetooth.pairing();
	}
}
