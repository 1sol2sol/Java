package poly1.basic2;
//아이폰 12 - 자식 클래스
public class Iphone12 extends Phone {
	public Iphone12() {
	}

	public Iphone12(String manufacture, String serialNumber, String mobileCarrier, String phoneNumber, String color) {
		super(manufacture, serialNumber, mobileCarrier, phoneNumber, color);
	}

	@Override
	public void photo() {
		System.out.println("라이다센서로 사진찍기");
	}

	public void gesture() {
		System.out.println("제스처");
	}
}
