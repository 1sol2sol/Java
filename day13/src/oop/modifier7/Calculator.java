package oop.modifier7;
//객체를 생성하지 않아도 이용 가능하도록 고정(정적, static)
public class Calculator {
	
//	이 메소드는 "고정" 되었으므로 객체 없이 사용이 가능하다
	public static int plus(int first, int second) {
		return first + second;
	}
	public static int minus(int first, int second) {
		return first - second;
	}
}