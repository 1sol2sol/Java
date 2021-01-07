package oop.method6;

public class Student {
	//변수 잠금(직접 접근 불가)
	//=접근 제한자 
	private String name; // => 잠금(숨김) 은닉화
	private int score;
	
	//멤버 변수를 만들고 나면 그에 맞게 setter 메소드를 만든는 것을 권장한다!
	void setName(String name) {
		this.name = name;
	}

	void setScore(int score) {
		if(score>=0&& score<=100) {
			this.score = score;
		}
	}
	//멤버 변수에 맞게 getter 메소드 준비
	//= 주인공이 가진 데이터(멤버 변수값) 반환
	//= return(중지 및 반환)
	//= void는 "반환활 값이 없음"을 나타내는 키워드
	//= 반환할 값이 있다면 해당 값의 자료형을 작성 
	
	String getName() {
		return this.name; // this.name 반환하며 종료 
	}
	int getScore() {
		return this.score;
	}
	
	void setup(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}
	
	void output() {
		System.out.println(this.getName());
		System.out.println(this.getScore());
	}
	
}
