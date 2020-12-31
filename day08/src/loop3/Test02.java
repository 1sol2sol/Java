package loop3;

import java.util.Scanner;

//import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
// do ~ while 반복문
// - 선 실행 후 검사 반복문
		
// 목표 : 사용자에게 올바른 시험점수를 입력받을 때까지 반복하여 입력을 수행하는 프로그램
// = 반복을 할지 말지 판단하려면 반드시 시험점수를 한 번은 입력받아야 한다
		Scanner sc = new Scanner(System.in);
		int score;
		do {
			System.out.println("시험 점수를 입력하세요");
			 score = sc.nextInt();
		}
//		while(잘못 입력했다면);
		while(score<0 || score>100);
		sc.close();
	}

}
