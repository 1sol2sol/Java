/*<문제>
사용자가 월을 입력하면 날짜를 알려주는 프로그램을 구현
ex : 사용자가 5를 입력하면 "5월은 31일까지 있습니다" 출력
     (2월은 28일까지 있다고 가정합니다)*/
package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test3_1 {
	public static void main(String[] args) {
		//목표 
		//준비 : 월 정보, 연도정보
		int year = 2020;
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12월 중 월을 입력하시오");
		int month = sc.nextInt();
	
		//계산 : 윤년여부,월별 마지막 날짜
		boolean yun = year%4 == 0 && year%100 != 0 || year%400 == 0;
		int days; //28 or 30 or 31
		          // 변수를 선언했을 경우에는 반드시 스위치문에서는 default, if문에서는 else가 있어야한다.
		//출력
		switch(month) {
		case 2:
			if(yun) {//윤년이라면
				days = 29;
			}
			else {//윤년이 아니라면
				days = 28;
			}
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		System.out.println(month + "월은 " + days + "일까지 있습니다");
	}
}
