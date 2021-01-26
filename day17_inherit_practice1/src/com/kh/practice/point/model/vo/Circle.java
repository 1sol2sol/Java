package com.kh.practice.point.model.vo;

public class Circle extends Point{

	//필드
	private int radius;
	
	//생성자
	public Circle() {}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
//	getter&setter
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	@Override
	public String toString() {
		System.out.println(super.toString()+" "+radius);
		return super.toString()+ ", " + radius;
	}
	
}
