package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	// 메소드
	public void mainMenu() {
		while (true) {
			System.out.println("=====메뉴=====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");

			int select = sc.nextInt();
			switch (select) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void circleMenu() {
		System.out.println("=====원 메뉴=====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();
		switch (select) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
		default:
			return;
		}
	}

	public void rectangleMenu() {
		System.out.println("=====메뉴=====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();
		switch (select) {
		case 1:
			clacPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 9:
		default:
			return;
		}
	}

	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcCircum(x, y, radius);
		System.out.println("둘레 : " + result);
	}

	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcArea(x, y, radius);
		System.out.println("면적 : " + result );
	}

	public void clacPerimeter() { // 사각형 둘레 
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		String result = rc.calcPerimeter(x, y, height, width);
		
		System.out.println("둘레 : " + result);
	}

	public void calcRectArea() { // 사각형 넓이 
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		String result = rc.calcArea(x, y, height, width);
		
		System.out.println("면적 : " + result );
	}
}
