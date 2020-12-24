package data;
import java.lang.*;
public class Test20 {
	public static void main(String[] args) {
		//문자열(String) : char 여러개를 묶어놓은 형태
		//= 즉, 글자수를 모르기 때문에 크기를 알 수 없다
		//= 크기를 정해두고 쓰는게 아니라 "주문 제작" 방식을 취한다 (커피컵 예시)
		//= 속도를 포기하고 용량을 알맞게 만드는 방식을 채택해서 사용한다(객체의 방식)
		//= 기본적으로 제공되는 자료형은 아니다(참조형) 
		//= 기본적으로 제공되는 형태를 원시형(raw type), 복잡한 형태를 참조형(reference type)이라고 부른다.
		
		//참조형에서는 변수가 리모컨 역할을 하며, 이를 참조변수라고 한다(reference variable)
		String a = "hello";
		System.out.println(a);			
		System.out.println(a.length()); // a 리모컨에서 length 버튼을 누르세요(글자 수 구하는 기능)
		System.out.println(a.toUpperCase()); //대문자로 변환하는 기능
		System.out.println(a.toLowerCase()); //소문자로 변환하는 기능 
		
		//숫자는 아니지만 예외적으로 덧셋이 허용된다(연결연산)
		//= 무조건 문자열이 포함된 덧셈은 결과가 문자열이 나온다.
		System.out.println(a + 100);
		
		int price = 2000;
		System.out.println(price + "원");
		System.out.println("결제금액" + 2000+3000+ "원"); 
		// > 결과가 5000원이 나오는게 아니라 20003000원이 나옴
		// 앞에서부터 계산이 되어 첫벅째 ㄱ
	}
}
