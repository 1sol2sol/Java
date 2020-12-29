package condition;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
// 목표 : 보유자산을 이용하여 "부자"인지 판단하여 출력
// 기준 : 보유자산이 100억 이상이면 부자로 판단

   long money = 10000000000L;
   
   System.out.println("자산 :" + money);
   if(money >= 10000000000L){
   System.out.println("당신은 부자입니다"); // => 특정 상황을 만족할 경우에만 실행 효과
   }
   
   if(money < 10000000000L){
	   System.out.println("당신은 부자가 아닙니다");
	   }
	}
}
