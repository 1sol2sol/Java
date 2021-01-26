package poly1.basic1;

public class Test04 {
public static void main(String[] args) {
	//객체 배열과 다형성
	//다양한 자식 객체들을 여러 개 만들어서 사용해야 하는 경우 사용 가능 
	Animal []ani = new Animal[3];
	ani[0] = new Cat();
//	ani[0].eat();
//	ani[0].speak();
	ani[1] = new Dog();
//	ani[1].eat();
//	ani[1].speak();
	ani[2] = new Cat();
//	ani[2].eat();
//	ani[2].speak();
	
	for(int i=0; i<ani.length; i++) {
		//객체 타입 확인 방법
		//객체.getClass().getName() : 패키지 + 클래스명을 문자열로 반환 
		System.out.println(ani[i].getClass().getName());
		//객체.getClass().getSimpleName() : 클래스명만 문자열로 반환 
		System.out.println(ani[i].getClass().getSimpleName());
		ani[i].eat();
		ani[i].speak();
	}
	
	
	
}
}
