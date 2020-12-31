/*<문제>
사용자에게 짝수를 입력받는 프로그램을 구현
홀수를 입력하면 종료시킬 예정이며, 종료될 경우 여태까지 입력한 짝수의 합계를 구하여 출력*/
package loop2;

import java.util.Scanner;

//imort java.lang.*;
public class Test03 { // 탈출조건 수행코드 주의
	public static void main(String[] args) {
		// 반복되는 내용 : 사용자에게 입력을 받는것
		// 종료되는 상황 : 입력한 값이 홀수인 경우

		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int count = 0;

		while (true) {
			System.out.println("짝수를 입력하세요(홀수 입력시 종료됩니다)");
			int even = sc.nextInt();
			if (even % 2 == 1) { // 홀수일때
				break;
			}
			else{ // 짝수일때
				count++;
				total += even;
			}
			
		}
		
		sc.close();
		System.out.println("입력한 짝수의 개수 : " + count);
		System.out.println("입력한 짝수의 합계 : " + total);
	}
}
