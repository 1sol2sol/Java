package inherit.exam01;
//부모클래스 
public class Animal {
	//필드부
	private String type; //품종
	private String color ; //색깔
	private String state; // 상태
	
	public Animal() {}
	public Animal(String type, String color, String state) {
		this.type = type;
		this.color = color;
		this.state = state;
	}

	public void eat() {
		System.out.println("먹다");
	}
	public void speak() {
		System.out.println("짖다");
	}
	public void walk() {
		System.out.println("걷다");
	}

}
