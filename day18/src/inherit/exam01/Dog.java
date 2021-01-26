package inherit.exam01;

public class Dog extends Animal{
	// 속성 - 필드부
	private int trainingStatus; // 훈련상태 (0~100)

	// 생성자부
	public Dog() {}
	public Dog(String type, String color, String state, int cleanliness) {
		super(type, color, state);
		this.trainingStatus = trainingStatus;
	}
	// 기능 - 메소드부
	public void sniff() {
		System.out.println("킁킁거리다");
	}
	public void protect() {
		System.out.println("집 지키기");
	}
	public void dig() {
		System.out.println("땅 파기");
	}
	@Override
	public void speak() {
		System.out.println("멍멍~");
	}
}
