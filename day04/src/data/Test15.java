/*<문제>
2000년생의 나이를 계산하여 화면에 출력하고, 성인인지(20세 이상) 판단하여 화면에 출력 (만나이 포함x)*/
package data;
import java.lang.*;
public class Test15 {
	public static void main(String[] args) {
		//준비
		//나이 계산은 특정 구간에 있는 숫자 개수를 세는 것과 같다.
		//구간에 있는 숫자 계산을 구하는 공식 > 끝수 - 시작수 + 1
		
		int year = 2020; // 올해(애매한 키워드)Test15.java
		int birth = 2000; //태어난 해 
		int age = year - birth + 1;
		boolean adult = age >= 20;
		
		//출력 : 나이, 성인여부
		System.out.println(age);
		System.out.println(adult);
		
	}
}
