package oop.modifier8;

public class Test01 {
public static void main(String[] args) {
	int a = Robot.multiple(10, 20);
	System.out.println("a = " + a);
	
	int b = Robot.square(11);
	System.out.println("b = " + b);
	
	double c = Robot.triangle(5, 7);
	System.out.println("c = " + c);
	
	double d = Robot.circle(5);
	System.out.println("d = "+d);
}
}
