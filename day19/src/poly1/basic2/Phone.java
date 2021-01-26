package poly1.basic2;

// 부모 클래스 
public class Phone {
	// 필드
	private String manufacture; //제조사
	private String serialNumber; //시리얼 번호
	private String mobileCarrier; //통신사
	private String phoneNumber; //전화번호
	private String color; //색상

	// 생성자
	public Phone() {
	}

	public Phone(String manufacture, String serialNumber, String mobileCarrier, String phoneNumber, String color) {
		this.manufacture = manufacture;
		this.serialNumber = serialNumber;
		this.mobileCarrier = mobileCarrier;
		this.phoneNumber = phoneNumber;
		this.color = color;
	}

	// 메소드
	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getMobileCarrier() {
		return mobileCarrier;
	}

	public void setMobileCarrier(String mobileCarrier) {
		this.mobileCarrier = mobileCarrier;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 전화하기 메소드
	public void call() {
		System.out.println("전화하기");
	}

	// 문자보내기 메소드
	public void text() {
		System.out.println("문자하기");
	}

	// 사진찍기 메소드
	public void photo() {
		System.out.println("사진찍기");
	}
}
