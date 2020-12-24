/* 영화관 요금표는 다음과 같습니다. 
-성인 : 10000원
-청소년 : 7500원
성인 2명과 청소년 3명이 영화를 보려고 할 때 지불해야 할 금액을 출력하시오.*/

package data;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		int adultPrice = 10000;
		int teenPrice = 7500;
		int adultCount = 2;
		int teenCount = 3;
		
		int adultTotal = adultPrice * adultCount;
		int teenTotal = teenPrice * teenCount;
		int total = adultTotal + teenTotal;
		
		System.out.println("<영수증>");
		System.out.println("총금액 : " + total + "원");
	
	}

}
