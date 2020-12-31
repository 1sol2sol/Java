/*<문제>
다이어트를 위해서 오늘부터 30일간 푸시업을 해보려고 합니다. 처음부터 많이하면 힘들기 때문에 첫날은 10개만 하고, 
둘째날부터는 전날보다 3개씩 개수를 늘려서 하려고 합니다.
1.일자별로 하게되는 푸시업 개수를 화면에 출력하세요
2.30일동안 하게되는 푸시업의 총 개수를 구하여 출력하세요*/
package loop;
import java.lang.*;
public class Test09_1 {
	public static void main(String[] args) {
//		1. 일자별 푸시업 개수 출력
//		2. 30일간의 푸시업 합계 출력

//		2개 모두 기준을 잡아서 반복
		for(int day = 1 , pushup = 10 ; day <= 30 ; day ++ , pushup += 3) {
			System.out.println(day+"일차 : "+pushup+"개");
		}
		
//		1개만 기준으로 잡아서 반복
		for(int day = 1 ; day <= 30 ; day ++) {
			System.out.println(day+"일차 : ?개");
		}
		
		for(int pushup = 10; pushup <= 97; pushup += 3) {
			System.out.println("?일차 : "+pushup+"개");
		}
	}
}