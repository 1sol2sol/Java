package poly3.inter1;

public class Test03 {
	public static void main(String[] args) {
		// 인터페이스로 객체 생성은 불가능하지만 참조변수로는 사용 가능
		// - 구현 객체의 주소를 담을 수 있음 (다형성)
		Bluetooth bt = new Galaxy20(); 
		bt.on();
		bt.search();
		Bluetooth.pairing();
		bt.connect();
		bt.off();
		
		//인터페이스에 구현되어 있지 않은 멤버는 접근 불가능 
		//bt.samsungPay(); => 오류발생 
		
		//다운 캐스팅을 이용해 접근 가능 
		((Galaxy20)bt).samsungPay();
	}
}
