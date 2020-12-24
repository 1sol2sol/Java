/*<문제> : 5천원짜리 자장면 3그릇, 6천원짜리 짬뽕 2그릇의 가격을 구하여 출력
=> 영수증 출력(자장면 금액, 짬뽕 금액, 총 금액)*/
package data;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		//숫자값(리터럴, literal) 값을 직접 사용하여 계산하는 방식 
		System.out.println(5000 * 3); // int 
		System.out.println(6000 * 2);
		System.out.println((5000 * 3) + (6000 * 2));
		
		//변수(variable)를 사용하여 계산하는 방식
		// 1. 데이터의 형태를 파악해야한다. 
		// 2. 형태에 맞게 변수를 만들어 데이터 또는 식의 결과를 저장
		// 3. 원하는 곳에서 이름을 불러 사용 
		// - 밑의 식에서 아쉬운 점 : 가격이 변하거나 주문수량이 달라지면 어디를 고쳐야 할지 파악이 어렵다. 
		
		int a = 5000 * 3;// int 형태를 저장할 수 있는 a라는 변수(저장소)를 만들고 5000*3을 계산해서 넣어라 
		// 위의 = 는 같다라는 뜻이 아니라 대입하는 대입 연산자이다. 
		int b = 6000* 2;// int 형태를 저장할 수 있는 라는 b라는 변수(저장소)를 만들고 5000*3을 계산해서 넣어라
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		// 변수를 더 사용해서 각각의 정보들을 따로 관리 > 관리가 더 용이하며 권장하는 방식 
		int noodles = 5000; //짜장면 금액 설정
		int champon = 6000; // 짬뽕 금액 설정 
		int noodlesCount = 3; // 짜장면 수량 설정
		// (대소문자 구분하는 언어일경우 뒤에 단어 첫번째글자 대문자, 아니면 뒤에 언더바 noodles_count)
		int champonCount = 2; // 짬뽕 수량 설정 
		
		int noodlesTotal = noodles * noodlesCount; // 짜장면 금액 합계
		int champonTotal = champon * champonCount; // 짬뽕 금액 합계
		int total = noodlesTotal + champonTotal;

		System.out.println(noodlesTotal);
		System.out.println(champonTotal);
		System.out.println(total);
		
	}
}
