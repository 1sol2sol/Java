package poly3.inter1;
// 접근제한자 interface 인터페이스명
// 인터페이스 : 클래스를 만들기 위한 설계도
// 클래스 : 객체를 만들기 위한 설계도 
// 블루투스 인터페이스 
public interface Bluetooth {
	// 상수형 필드
	// - 인터페이스에서 정해놓은 값을 고정으로 사용하도록 강제하고자 할 때 선언 
	// - 인터페이스 내 필드는 묵시적으로 public static final 로 선언됨
	/*public static final*/String FREQUENCY = "2.402~2.480GHz"; //주파수
	
	// 추상 메소드
	// - 몸체가 없는 메소드(미완성 메소드)
	// - 구현 클래스에서 반드시 오버라이딩(재정의) 해줘야함 : 강제적 구현 
	// - 모든 인터페이스 메소드는 묵시적으로 public abstract로 선언됨 (명시적으로 적어도 되고 안적어도 됨)
	public abstract void on(); // 블루투스 켜기
	/* public */ abstract void off(); // 블루투스 끄기
	/* public abstract */ void search(); // 디바이스 찾기 
	
	// 정적 메소드
	// - 인터페이스에서 제공해주는 고정된 기능(메소드) 구현할 때 사용
	// - 객체가 없어도 인터페이스만으로 호출 가능
	// - public 을 생략해도 컴파일시 자동으로 붙여준다
	/* public */ static void pairing() {	//페어링
		System.out.println("페어링중입니다~!");
	}
	
	// 디폴트 메소드
	// - 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위해서 허용됨
	// - 인터페이스에 선언되지만 실제로는 객체가 가지고 있는 인스턴스 메소드가 됨 
	// - 오버라이딩도 가능 
	// - public 을 생략해도 컴파일시 자동으로 붙여준다
	/* public */ default void connect() {	//연결
		System.out.println("블루투스 연결됨~~!!!");
	}
}
