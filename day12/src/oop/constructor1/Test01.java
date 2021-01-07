package oop.constructor1;

public class Test01 {
	public static void main(String[] args) {
		// Student 객체를 생성
		// = 생성자의 형태에 맞춰서만 생성 가능
		
		Student a = new Student("피카츄", 70);
		a.output();
	}
}
