package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	//필드
	Rectangle r = new Rectangle();
	
	//메소드
	public String calcArea(int x, int y, int height, int width) { // 사각형 넓이 
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int area = width * height ;
		return r.toString() + " / " + area ;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) { //사각형 둘레
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		int perimeter = (width + height) * 2 ;
		return r.toString() + " / " + perimeter ;
		
	}
	
}
