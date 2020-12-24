/*<문제>
1시간에 600원인 PC방에서 오후 3시에 가서 오후 7시 40분까지 게임을 하고 계산대로 갔습니다
지불해야 할 금액을 구하여 출력하세요*/

package data;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		//변수선언
		int pricePerHour = 600;// 한시간당 요금
		int pricePerMinute = pricePerHour / 60;
		int inHour = 17, inMinute = 30;//시작시각
		int outHour = 19, outMinute = 00;//종료시각
		
		//계산
		//1. 이용시간을 분으로 계산
		//2. 계산된 시간으로 이용요금을 계산 
		int inTime = inHour * 60 + inMinute;
		//System.out.println(inTime);
		int outTime = outHour * 60 + outMinute;
		//System.out.println(outTime);
		int time = outTime - inTime; // 총 이용시간
		//System.out.println(time); 
		int price = time * pricePerMinute; //이용시간(분)*이용요금(분)
		
		int hour = time / 60;
		int minute = time % 60;
		
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(price);

	
	}

}
