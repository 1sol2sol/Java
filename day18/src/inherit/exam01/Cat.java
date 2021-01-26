package inherit.exam01;

public class Cat extends Animal{
//속성 - 필드부
	private int cleanliness; //청결도(0~100)
//생성자부
	public Cat() {}
	public Cat(String type, String color, String state, int cleanliness) {
		super(type, color, state);
		this.cleanliness = cleanliness;
	}
	
//기능 - 메소드부
	public void climb() {
		System.out.println("올라가다");
	}
	public void grumming() {
		System.out.println("털손질");
	}
	@Override
	public void speak() {
		System.out.println("먀옹~");
	}
}
