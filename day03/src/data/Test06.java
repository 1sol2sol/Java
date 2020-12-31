/*시간계산 유형 : JAVA와 사람은 다른 방식으로 계산한다. 

사람 : 머리가 좋지만 속도가 느리다. 
JAVA : 머리는 나쁘지만 속도가 빠르다.
분으로 바꿔서 계산 
1시간 30분 = 90분 , 3시간 50분 = 230분
합계 = 320분 => 시간은 나누기로 분은 나머지로 구한다. 
<문제> : 1시간30분+3시간50분
*/

package data;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		// 변수선언
		int aHour = 1, aMinute = 30;
		int bHour = 3, bMinute = 50;
		
		//계산 : 가장 작은 단위로 변환하여 계산하고 복원
		int aTime = aHour * 60 + aMinute;
		int bTime = bHour * 60 + bMinute;
		int time = aTime + bTime;
		
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		//System.out.println(time);
		System.out.println(hour);
		System.out.println(minute);
		
		
	}

}
