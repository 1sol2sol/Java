/*<문제>
자장면 한그릇이 5000원, 짬뽕 한그릇이 6000원일 때 사용자에게 주문수량을 숫자로 입력받아 결제금액을 계산하여 
출력하세요*/
package input;
import java.lang.*;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int blacknoodlesPrice = 5000;
		int rednoodlesPrice = 6000;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("짜장면 개수를 입력하세요(한 그릇당 5000원)");
		int blacknoodlesCount = sc.nextInt();
		System.out.println("짬뽕 개수를 입력하세요(한 그릇당 6000원)");
		int rednoodlesCount = sc.nextInt();

	
		sc.close();
		
		int blacknoodlesTotal = blacknoodlesPrice * blacknoodlesCount;
		int rednoodlesTotal = rednoodlesPrice * rednoodlesCount;
		int total = blacknoodlesTotal + rednoodlesTotal;
		
		System.out.println("짜장면 결제금액 :" + blacknoodlesTotal + "원");
		System.out.println("짬뽕 결제금액 :" + rednoodlesTotal + "원");
		System.out.println("총 금액 :" + total + "원");
	}
}
