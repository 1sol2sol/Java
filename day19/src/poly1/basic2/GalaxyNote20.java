package poly1.basic2;
//갤노트 20 - 자식클래스
public class GalaxyNote20 extends Phone {
	public GalaxyNote20() {
	}

	public GalaxyNote20(String manufacture, String serialNumber, String mobileCarrier, String phoneNumber,
			String color) {
		super(manufacture, serialNumber, mobileCarrier, phoneNumber, color);
	}

	@Override
	public void photo() {
		System.out.println("100배 확대해서 사진찍기");
	}

	public void samsungpay() {
		System.out.println("삼성페이");
	}
}
