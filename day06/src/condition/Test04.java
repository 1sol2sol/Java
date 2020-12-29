/*
사용자에게 나이를 입력받아 청소년인지 아닌지 판정하여 출력
- 청소년은 나이가 14~19세 인 경우를 말합니다
- 청소년일 경우 `당신은 청소년입니다`, 아닐 경우 `당신은 청소년이 아닙니다` 출력
 */
package condition;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		sc.close();
		
		boolean teen = age >= 14 && age <= 19;
		
		if(teen) {
			System.out.println("당신은 청소년입니다");
		}
		else {
			System.out.println("당신은 청소년이 아닙니다");
		}
	}
	
}
