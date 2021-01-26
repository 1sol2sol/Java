package poly1.basic1;

public class Test06 {
public static void main(String[] args) {
	//instanceof 연산자
	//사용법 : 객체 instanceof 클래스명 
	//결과 : 해당 객체가 비교하고자하는 클래스와 일치하면 true, 아니면 false를 반환 
	
	Animal ani;
	ani = new Cat();
	System.out.println(ani instanceof Cat ); //ani가 Cat 객체가 맞니? 물어보는것 => true
	System.out.println(ani instanceof Dog ); //ani가 Dog 객체가 맞니? 물어보는것 => false
	
}
}
