package poly3.inter1;
//블루투스 인터페이스를 구현하는 구현 클래스
public class Galaxy20 implements Bluetooth{
	//인터페이스 내 정의된 모든 추상 메소드를 오버라이딩(재정의) 해야함
	//-> 안하면 오류 발생 
	
	@Override
	public void on() {
		System.out.println("블루투스가 켜집니다~!");
	}

	@Override
	public void off() {
		System.out.println("블루투스가 꺼집니다~!");
	}

	@Override
	public void search() {
		System.out.println("디바이스를 찾는중입니다~!");
	}

	
	//인터페이스 내 정의된 디폴트 메소드는 오버라이딩(재정의) 가능
	//->불필요시 안해도 됨 
	@Override
	public void connect() {
		System.out.println("갤럭시랑 연결됨~!");
	}
	
	//인터페이스 내 정의되지 않은 필드/메소드 자유롭게 작성 가능 
	public void samsungPay() {
		System.out.println("삼성페이로 결제~!!");
		//인터페이스는 상속관계가 아닌 구현관계이기 때문에 super로 접근 불가능 
		//super.connect(); => 오류 발생 
	}
	
}
