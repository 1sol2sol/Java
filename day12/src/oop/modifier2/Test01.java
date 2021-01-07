package oop.modifier2;

import oop.modifier1.Car;

public class Test01 {
public static void main(String[] args) {
// 다른 패키지의 Car 클래스를 사용할 수 있을까?
	Car a = new Car();
	
	a.setName("아반떼");
	a.setPrice(20000000);
	
	System.out.println(a.getName());
	System.out.println(a.getPrice());
}
}
