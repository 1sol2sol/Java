package oop.constructor1;

public class Test01 {
	public static void main(String[] args) {
		// Student 객체를 생성
		// = 생성자의 형태에 맞춰서만 생성 가능
		
		//[1] 이름과 점수를 모두 설정하여 생성
		
		Student a = new Student("피카츄", 70);
		a.output();
		
		//[2] 이름만 설정하여 생성 
		Student b = new Student("파이리");
	}
}
