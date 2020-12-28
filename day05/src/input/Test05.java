/*<문제>

사용자에게 시작시간과 종료시간을 입력받아 이용요금을 계산하여 출력하세요
(이용요금은 한시간에 600원)*/
package input;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		int priceHour = 600;
		int priceMinute = priceHour / 60;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작시간과 분을 순서대로 입력하시오.");
		int inHour = sc.nextInt();
		int inMinute = sc.nextInt();
		System.out.println("종료시간과 분을 순서대로 입력하시오.");
		int outHour = sc.nextInt();
		int outMinute = sc.nextInt();
		sc.close();
		
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int usedTime = outTime - inTime;
		int price = usedTime * priceMinute;
		int hour = usedTime / 60;
		int minute = usedTime % 60;
		
		System.out.println("총 이용시간 :" + hour + "시간" + minute + "분");
		System.out.println("총 이용요금 :" + price);
		
	}
}
