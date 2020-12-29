package condition;
//import java.lang.*;
import java.util.Scanner;
public class Test09 {
	public static void main (String[] args) {
/*
<문제> 사용자에게 여행가고 싶은 달을 1~12 사이에서 입력하도록 하고, "계절별 할인율"을 구하여 출력하려고 합니다.
-봄(3,4,5월) : 모든 상품에 30% 할인을 적용합니다. -여름(6,7,8월): 모든 상품에 할인이 적용되지 않습니다.
-가을(9,10,11월): 모든 상품에 10% 할인을 적용합니다. -겨울(12,1,2월): 모든 상품에 20% 할인을 적용합니다.
 추가적으로 여행 기간과 인원수를 입력받아서 여행 예상 경비를 계산하여 출력
-1인당 하루 경비는 10만원으로 지정 -ex : 3월에 2명이 2일 여행을 가면 = (2명*10만원*2일) * 70% = 28만원*/
		 
		//준비 : 사용자가 입력한 월, 계절별 할인율, 1인당 여행경비
		Scanner sc = new Scanner(System.in);
		System.out.println("여행갈 월을 1~12 사이로 입력하세요");
		int month = sc.nextInt(); // 여행갈 월
		System.out.println("여행갈 인원수를 입력하세요");
		int people = sc.nextInt(); // 인원수
		System.out.println("여행 기간을 일단위로 입력하세요");
		int day = sc.nextInt(); //기간(일)
		sc.close();
		
		int spring = 30;
		int summer = 0;
		int autumn = 10;
		int winter = 20;
		
		int pricePerPerson = 100000;
		
		//계산 : 할인율
		//int discountRate= 30 or 0 or 10 or 20;
		//int discountRate = spirng or summer or autumn or winter
		
		int discountRate;
		//if(month>=3 && month<=5) month가 3에서 5사이라면
		//if(month == 3 || month == 4 || month == 5)month가 3 또는 4 또는 5라면
		if(month/3 == 1) {//3개씩 묶어서 생각
			discountRate = spring;
		}
		else if(month/3 == 2) {
			discountRate = summer;
		}
		else if(month/3 == 3) {
			discountRate = autumn;
		}
		else {
			discountRate = winter;
		}
		
		//금액 계산
		int totalPrice = people * day * pricePerPerson;
		
		//할인 적용
		//int discountPrice = (int)(totalPrice*discountRate/100.0); =>totalPrice*0.1의 결과는 double-->int로 casting이 필요
		int discountPrcie = totalPrice * discountRate / 100;
		int resultPrice = totalPrice - discountPrcie;
		//출력
		System.out.println("총 금액:" + totalPrice + "원");
		System.out.println("할인율 :" + discountRate + "%");
		System.out.println("할인금액 :"+ discountPrcie + "원");
		System.out.println("최종금액 :"+ resultPrice + "원");
		
	}
}
