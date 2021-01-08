package oop.modifier5;

public class Test01 {
	public static void main(String[] args) {
		// 목표 : Calculator로 10+20 을 계산하여 출력
		Calculator c = new Calculator(10,20);
		System.out.println(c.getPlus());
	}

}

