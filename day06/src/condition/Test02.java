/*<문제>
어떤 음식점의 메뉴판이 다음과 같습니다. 소지금을 사용자가 입력하면 주문 가능한 메뉴를 출력하도록 구현하세요 (합계가 아닌 주문 가능한 금액대의 메뉴를 전부 출력해주세요)

메뉴판
- 떡볶이 2천원- 자장면 5천원- 탕수육 만원- 피자 2만원*/
package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("소지금액을 입력하세요");
		int money = sc.nextInt();
		sc.close();
		
		if(money >= 2000) {
			System.out.println("떡볶이(2천원) 주문 가능합니다");
		}
		if(money >= 5000) {
			System.out.println("자장면(5천원) 주문 가능합니다");
		}
		if(money >= 10000) {
			System.out.println("탕수육(1만원) 주문 가능합니다");
		}
		if(money >= 20000) {
			System.out.println("피자(2만원) 주문 가능하니다");
		}
		if(money < 2000) {
			System.out.println("주문할 수 있는 메뉴가 없습니다");
		}
	}
}
