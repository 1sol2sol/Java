package exception1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 예외 상황

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("더하기 : " + (num1 + num2));
		System.out.println("빼기 : " + (num1 - num2));
		System.out.println("곱하기 : " + (num1 * num2));
//		System.out.println("나누기 : " + (num1 / num2)); => 0으로 나눌 경우 예외 발생 

		// if문(조건문)을 이용한 예외처리
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다");
		} else {
			System.out.println("나누기 : " + (num1 / num2));
		}

	}

}
