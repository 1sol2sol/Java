package data;
import java.lang.*;
public class Test_weekend {
	public static void main(String[] args) {
		//변수설정
		int priceAmericano = 1500;
		int priceLatte = 2500;
		int countAmericano = 20;
		int countLatte = 11;
		
		//계산
		int countFreeAmericano = countAmericano / 6;
		int countPayAmericano = countAmericano - countFreeAmericano;
		int countFreeLatte = countLatte / 4;
		int countPayLatte = countLatte - countFreeLatte;
		int countFreeTotal = countFreeAmericano + countFreeLatte;
		int countPayTotal = countPayAmericano + countPayLatte;
		int totalPrice = (countPayAmericano * priceAmericano) + (countPayLatte * priceLatte);
		
		//출력
		System.out.println("---------------\n영수증\n---------------");
		System.out.println("아메리카노 :" + countPayAmericano + "잔");
		System.out.println("카페라떼 :" + countPayLatte + "잔");
		System.out.println("주문수량 :" + countPayTotal + "잔");
		System.out.println("---------------\n<서비스>");
		System.out.println("아메리카노 :" + countFreeAmericano + "잔");
		System.out.println("카페라떼 :" + countFreeLatte + "잔");
		System.out.println("서비스합계 :" + countFreeTotal + "잔");
		System.out.println("---------------\n결제금액 :" + totalPrice + "원\n---------------" );
		
		
	}
}
