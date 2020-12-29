package condition;
import java.lang.*;
import java.util.Calendar;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
//<문제>
//사용자에게 출생년도 4자리를 입력받아 나이를 계산하고 지하철 요금을 계산하세요
//
//지하철 요금표
//- 어른신(65세이상) : 0원
//- 성인(20세이상 65세미만) : 1250원
//- 청소년(14세 이상 20세미만) : 720원
//- 어린이(8세이상 14세미만) : 450원
//- 유아(8세미만) : 0원
		
	//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("출생년도 4자리를 입력하세요");
		int birth = sc.nextInt();
		sc.close();
	//계산
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int age = year-birth+1;
				
	//출력
		if(age >= 65) {
			System.out.println("지하철 요금:0원");
		}
		else if(age >= 20) {
			System.out.println("지하철 요금:1250원");
		}
		else if(age >= 14) {
			System.out.println("지하철 요금:720원");
		}
		else if(age >= 8) {
			System.out.println("지하철 요금:450원");
		}
		else {
			System.out.println("지하철 요금:0원");
		}
	}
}
