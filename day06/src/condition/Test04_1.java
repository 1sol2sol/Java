/*
사용자에게 나이를 입력받아 청소년인지 아닌지 판정하여 출력
- 청소년은 나이가 14~19세 인 경우를 말합니다
- 청소년일 경우 `당신은 청소년입니다`, 아닐 경우 `당신은 청소년이 아닙니다` 출력
 */
package condition;
import java.lang.*;
import java.util.Scanner;
public class Test04_1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		sc.close();
		
		boolean teen = age >= 14 && age <= 19;
		
		// !는 "논리부정" 연산자라고 부른다. 논리값을 반대로 뒤집는 효과를 발생시킨다
		
		//if(나이가 청소년에 해당하지 않는다면){
		//if(age < 14 || age >= 20){
		//if(teen == false){
		if(!teen) {
			System.out.println("당신은 청소년이 아닙니다");
		}
		else {
			System.out.println("당신은 청소년입니다");
		}
	}
	
}


