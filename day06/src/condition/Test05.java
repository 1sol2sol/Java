/*<문제>
사용자에게 입력받은 숫자가 짝수인지 판정하여 출력하시오
-짝수일 경우 "짝수입니다", 아니라면 "홀수입니다" 출력*/
package condition;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		/*-짝수 = 2의 배수 = 2로 나눈 나머지가 0인 수
		-3의 배수 = 3으로 나눈 나머지가 0인 수 
		-소수, 인수분해 ..*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = sc.nextInt();
		
		boolean evenNumber = (number%2)==0;
				
		if(evenNumber) {
			System.out.println("짝수입니다");
		}
		else {
			System.out.println("홀수입니다");
		}
	}
}
