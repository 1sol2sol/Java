/*<369 게임 시뮬레이션>
1부터 99사이에서 369게임을 시뮬레이션한 결과를 출력
-369게임은 숫자중에 3이나 6이나 9가 포함되어 있으면 숫자 대신 박수를 치는 게임
-박수를 치지 않는 숫자는 그냥 출력
-1, 2, 짝, 4, 5, 짝, 7, 8, 짝, 10 , 11, 12 ~27,28,짝, 짝, 짝,짝, 짝짝,*/
package loop;
//import java.lang.*;
public class Test5_1 {
	public static void main(String[] args) {
		for(int i=1; i < 100; i++) {
			boolean isTen = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			boolean isOne = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			if(isTen && isOne) {//십의자리와 일의자리 모두 3,6,9중 하나라면
				System.out.println("짝짝");
			}
			else if(isTen || isOne) {//십의자리와 일의자리 중 하나 이상 3,6,9라면
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}
		}
	}
}