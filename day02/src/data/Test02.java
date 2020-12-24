package data;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//목표 : 숫자 중에서 정수에 대해 이해해보자 !
		// *정수는 순환형 구조를 가진다 
		// *정수는 끼리끼리 논다 (정수끼리의 연산은 정수가 나온다)
	
		
		 System.out.println(12345); // 아무말 없이 숫자 적었으므로 int로 판단됨
		 System.out.println(12345L); // L을 붙였으니까 long이라고 판단 
		 
		 System.out.println(12345 + 12345L); // 계산식은 계산해서 나온 결과로 인식 (큰 형태로 따라서 계산됨)
		 
		 System.out.println(1234567 * 1234567);// 원래 1조가 나와야하는데 정수는 순환형 구조이기 때문에 
		 System.out.println(1234567L * 1234567L);
		 System.out.println(100 / 200); // int 이기 때문에 결과값 0으로 도출 - 몫
		 System.out.println(100d / 200);// 실수 d를 붙여 결과값 0.5으로 도출 
		 System.out.println(100 % 200); // 100(int) 나머지 
	}
}