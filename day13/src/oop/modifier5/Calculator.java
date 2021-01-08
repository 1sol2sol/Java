package oop.modifier5;

//계산기를 하나 만들어보자!
//-멤버 변수 : 첫번째 수 (first), 두번째 수(second)
//-멤버 메소드 : setter/getter, 일반메소드(더하기, 빼기, ...)
//-생성자 : first, second 모두 설정
public class Calculator {
	//멤버 변수
	private int first, second;

	//생성자
	public Calculator(int first, int second) {
		this.setFirst(first);
		this.setSecond(second);
	}
	//가상의 getter 메소드
	public int getPlus() {
		return this.first + this.second;
	}
	public int getMinus() {
		return this.first - this.second;
	}
	
	//세터&게터
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

}