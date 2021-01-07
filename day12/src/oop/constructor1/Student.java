package oop.constructor1;

public class Student {
	private String name;
	private int score;

	//초기화 구문을 메소드로 만들면 객체를 생성한 뒤에 호출할 수 밖에 없다
	// = 객체에 값을 초기화 시키면서 생성이 불가능하다
	// = 순서가 맞지 않는다 
	// = 자바에서는 "초기화" 전용 구문이 존재한다. 이를 생성자(constructor)라고 부른다
//	public void setup(String name, int score) { void=> 반환자료형 = 반환형
	public Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	//생성자 오버로딩 (많이 물어보는 개념이고 시험에도 많이 나옴)
	// => 뭘 좋아할지 몰라 다 준비했어 
	// => 선택지가 여러개 생긴다 
	public Student(String name) {
		this.name = name;
	//	this.score = 0;
	}
	public void output() {
		System.out.println("이름: " + this.name);
		System.out.println("점수: " + this.score);
	}
}
