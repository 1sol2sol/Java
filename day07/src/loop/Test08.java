package loop;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		//목표 : 1부터 10까지의 합계 구하기(or 짝수합 or 홀수합)
		
		//우리가 이해하는 방식으로 구성하면
		//int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		//System.out.println(sum);
		
		// 반복문을 사용하려면 규칙이 있어야한다. 없으면 어거지로 만들어야한다.
		// =합계를 위한 변수를 만들고 숫자를 하나씩 더한다.
		
			int sum = 0;
			
			for(int i=1; i<=10; i++) {
				sum+=i;
//				System.out.println("sum=" + sum);// 확인용코드
			}
//			sum+=1;
//			sum+=2;
//			sum+=3;
//			sum+=4;
//			sum+=5;
//			sum+=6;
//			sum+=7;
//			sum+=8;
//			sum+=9;
//			sum+=10;
			
			System.out.println("sum="+sum);
	}

}
