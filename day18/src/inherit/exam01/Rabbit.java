package inherit.exam01;

public class Rabbit extends Animal{
	// 속성 - 필드부
	private int jumpingPower; //점프력 (0~100)
	// 생성자부
	public Rabbit() {}
	public Rabbit(String type, String color, String state, int cleanliness) {
		super(type, color, state);
		this.jumpingPower = jumpingPower;
	}
	// 기능 - 메소드부
	public void listen() {
		System.out.println("듣다");
	}
	public void jump() {
		System.out.println("점프하다");
	}
	@Override
	public void speak() {
		System.out.println("까오억~");
	}
}
