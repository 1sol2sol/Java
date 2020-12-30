/*<문제>
사용자에게 숫자 10개를 입력받아서 홀수가 몇개 입력되었는지 세어서 출력*/
package loop;

import java.lang.*;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		// 도구는 한번 만들면 계속 사용할 수 있기 때문에 반복문 바깥에서 만드는게 좋다 
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		for (int i = 0; i < 10; i = i + 1) {
			System.out.println("숫자를 입력하세요");
			int number = sc.nextInt();
			
			if (number % 2 == 1) {
				count++;
			}
		}
		sc.close();
		System.out.println("홀수 입력 횟수는: " + count + "번");
		
	}

}
