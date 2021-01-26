package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	//필드
	private Circle c = new Circle();
	
	//메소드
	public String calcArea(int x, int y, int radius) { //원의 넓이 
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double area = radius * radius * Math.PI;
		return c.toString() + " / " + area ;
	}
	public String calcCircum(int x, int y, int radius) {//원의 둘레 
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		double circum = radius * 2 * Math.PI;
		return c.toString() + " / " + circum;
				
	}
}
