package poly1.basic2;
//갤폴드2 - 자식 클래스
public class GalaxyFold2 extends Phone {
	public GalaxyFold2() {
	}

	public GalaxyFold2(String manufacture, String serialNumber, String mobileCarrier, String phoneNumber,
			String color) {
		super(manufacture, serialNumber, mobileCarrier, phoneNumber, color);
	}

	@Override
	public void photo() {
		System.out.println("1200만 화소로 사진찍기");
	}

	public void screenFold() {
		System.out.println("화면접기");
	}
}
