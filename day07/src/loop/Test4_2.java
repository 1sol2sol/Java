/*<문제>
1부터 99사이에 있는 5가 들어간 숫자를 출력하라
= 5, 15, 25, 35, 45, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 65, 75, 85, 95(19개)*/
package loop;
import java.lang.*;
public class Test4_2 {
	public static void main(String[] args) {
		// 05 15 25 35 45 55 65 75 85 95 = 일의 자리가 5인 경우(5부터 10씩 증가)
		// 50 51 52 53 54 55 56 57 58 59 = 10의 자리가 5인 경우(50이상 60미만)
		
		for(int i=1; i<100; i++) {//i를 1 증가
			boolean a = i/10==5;
			boolean b = i%10==5;
			if(a || b)//i가 십의자리가 5 1의 자리가 5라면
				{//or 연산 논리의 합 (서로 다른 경우를 합쳐 줌)
				System.out.println(i);
			}
		}
		}
	}


