/*<문제>
2000년생의 나이를 계산하여 화면에 출력하고, 성인인지(20세 이상) 판단하여 화면에 출력 (만나이 포함x)*/
package data;
import java.lang.*;
import java.util.Calendar;
public class Test15_1 {
	public static void main(String[] args) {
//		앞 예제에서는 올해 연도를 직접 사용하여 유지보수가 불리하다.
//		연도를 구하는 명령을 찾아서 관리하기가 편하도록 프로그램을 개선.
		
		//준비
		//나이 계산은 특정 구간에 있는 숫자 개수를 세는 것과 같다.
		//구간에 있는 숫자 계산을 구하는 공식 > 끝수 - 시작수 + 1
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int birth = 2000; //태어난 해 
		int age = year - birth + 1;
		boolean adult = age >= 20;
		
		//출력 : 나이, 성인여부
		System.out.println(age);
		System.out.println(adult);
		
	}
}
