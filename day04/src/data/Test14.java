package data;
import java.lang.*;
public class Test14 {
	public static void main(String[] args) {
//		숫자가 아닌 데이터들 : 논리
//		=프로그램으로 하여금"판정"을 내릴 수 있게 한다. 
//		=프로그램에서 논리들을 조합하여 거대한 흐름을 처리할 수 있다. 
//		내가 가진 돈과 피자 금액을 이용하여 어떤 계산을 하고싶다. 
//		= 피자를 먹을 수 있는지 없는지 알고싶다(논리형연산)
//		= 연산 결과가 그렇다/아니다 두 가지 중 하나로 나와야한다.
//		boolean 이라는 형태의 변수를 만들고 true/false 형태로 계산하여 추가 
		int money = 25000;
		int pizza = 30000;
		 
//		boolean buy = true; , boolean buy = false;
//		boolean buy = 내가 가진 돈이 피자금액보다 많은가요?;
		boolean buy = money >= pizza;
		System.out.println(buy); // 결과는 true or false로 나온다. 
		
	}
}
