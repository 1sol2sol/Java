package exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 멀티 catch문 

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("숫자 1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("숫자 2 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("나누기 : " + (num1 / num2));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e2) {
			System.out.println("정수만 입력해주세요~!");
		}
		
		System.out.println("프로그램 종료");
	}
}
