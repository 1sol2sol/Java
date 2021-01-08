package oop.modifier6;

//변수를 없애고 메소드를 일회성 계산으로 변경
//= 간편한 계산 위주로 구현해야 할 경우 사용
public class Calculator {
	public int plus(int first, int second) {
		return first + second;
	}
	public int minus(int first, int second) {
		return first - second;
	}
}