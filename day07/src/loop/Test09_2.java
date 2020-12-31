/*<문제>
다이어트를 위해서 오늘부터 30일간 푸시업을 해보려고 합니다. 처음부터 많이하면 힘들기 때문에 첫날은 10개만 하고, 
둘째날부터는 전날보다 3개씩 개수를 늘려서 하려고 합니다.
1.일자별로 하게되는 푸시업 개수를 화면에 출력하세요
2.30일동안 하게되는 푸시업의 총 개수를 구하여 출력하세요*/
package loop;
import java.lang.*;
import java.util.Scanner;
public class Test09_2 {
	public static void main(String[] args) {
		//사용자가 입력했으면 하는 항목은?
		//- 시작할 푸시업개수, 매일마다 늘어날 푸시업개수, 기간
		
		Scanner sc = new Scanner(System.in);
		System.out.println("기간을 일단위로 입력하세요");
		int period = sc.nextInt();
		System.out.println("첫날 푸시업 개수를 입력하세요");
		int pushup = sc.nextInt();
		System.out.println("매일마다 늘어날 푸시업 개수를 입력하세요");
		int plusCount = sc.nextInt();
		sc.close();

		int total = 0;//합계를 0으로 초기화
		for(int day = 1 ; day <= period ; day ++) {
			System.out.println(day+"일차 : "+pushup+"개");
			total += pushup;
			pushup += plusCount;
		}
		
		System.out.println("총 푸시업 개수 : "+total+"개");
	}
}