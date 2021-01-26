package poly2.abst1;

public class Test01 {
public static void main(String[] args) {
	// 추상 메소드 사용
	Phone ph;
	
	ph = new GalaxyNote20();
	ph.camera();
	
	ph = new Iphone12();
	ph.camera();
	
	// 추상 클래스는 객체 생성 불가능 
	//Phone ph2 = new Phone(); => 오류 발생 
}
}
