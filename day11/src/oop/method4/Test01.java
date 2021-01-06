package oop.method4;

public class Test01 {
public static void main(String[] args) {
	Student s = new Student();
	
	s.setup("홍길동", -20);
	s.output();
	
	//s의 정보 중 이름 변경 후 출력(홍길동--->이소룡)
	//s.setup("이소룡", 20);
	s.setName("이소룡");//메소드로 변경
	//s.name = "이소룡";//직접 변경
	s.output();
	
	//s의 정보 중 나이 변경 후 출력(20--->25)
	s.setAge(25);//메소드로 변경(필터링 가능)
	//s.age = 25;//변수를 직접 변경(필터링 불가)
	s.output();
}
}
