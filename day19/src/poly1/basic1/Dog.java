package poly1.basic1;
// 강아지 - 자식 클래스
public class Dog extends Animal{
	@Override
	public void speak() {
		System.out.println("멍멍~");
	}
	public void protect() {
		System.out.println("지키다~!");
	}
}
