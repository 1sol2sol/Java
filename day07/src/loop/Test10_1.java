/*<문제>
고대 그리스에 아주 현명한 노인이 살고 있었습니다. 왕이 소문을 듣고 찾아가서 "원하는게 있으면 주겠다" 고 했더니 
노인이 다음과 같이 말합니다. 
"저는 많이 바라지 않습니다. 첫날 1원만 주시고, 둘째날부터는 전날보다 두 배만 더 주시면 됩니다"
1.30일동안 매일매일 노인이 받게되는 돈을 일자별로 출력하세요
2.30일동안 노인이 받게되는 돈의 총 액수를 출력하세요
3.40일로 기간을 바꾸면 노인이 받는 돈이 총 얼마인지 구하여 출력하세요
4.나라 예산이 1조원 있다고 했을 때, 3번의 경우 노인에게 돈을 줄 수 있는지 판정하여 출력하세요*/
package loop;
//import java.lang.*;
public class Test10_1 {
	public static void main(String[] args) {
		
//		초기값
		int money = 1;
		int account = 0;
		
		for(int day=1; day <= 30; day++) {
			System.out.println(day+"일차 : "+money+"원");
			account += money;
			money *= 2;//money = money * 2;
		}
		
		System.out.println("통장 잔액 : "+account+"원");
		
	}
}