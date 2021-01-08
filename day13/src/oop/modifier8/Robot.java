package oop.modifier8;

public class Robot {
	//곱하기 기능
	public static int multiple(int a, int b) {
		return a * b;
	}
	//제곱기능
	public static int square(int a) {
		return a * a;
		//return multiple(a,a);
	}
	public static double triangle(int width, int height) {
		return width*height / 2.0;
		//return (double)width*height /2;
		//return multiple(width*height)/2.0;
		//return (double)multiple(width,height)/2;
	}
	public static double circle(int radius) {
		//double area = radus * radius * 3.14;
		double area = 3.14*square(radius);
		return area;
	}
	
}
