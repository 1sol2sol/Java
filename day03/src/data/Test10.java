package data;
import java.lang.*;
public class Test10 {
	public static void main(String[] args) {
		//실수 : 소수점이 있는 숫자 (float, double)
		//-정밀도가 떨어진다 
		//-실수가 포함되면 연산 결과가 실수로 나온다 
		
		//float : 4byte 실수
		//float a = 1.234; 
		// a라는 변수에 1.234를 넣으라는것인데 1.234가 double로 인식되어 저장소 float a에 들어갈수없다
		float a = 1.234f;
		System.out.println(a);
				
		//double : 8byte 실수
		double b = 1.234;
		System.out.println(b);
		
		float c = 2.2f;
		System.out.println(c);
		
		System.out.println(10/3); //3(정수끼리의 연산)
		System.out.println(10/3.0);//3.33333(실수 포함 연산)
		System.out.println(10.0/3);//3.33333(실수 포함 연산)
		System.out.println(10.0/3.0);//3.33333(실수 포함 연산)
	}

}
