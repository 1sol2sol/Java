/*<문제>
편의점에서 삼각김밥 1+1 행사로 판매중입니다.
삼각김밥이 한개에 900원일때, 5개 구매시 결제금액 출력하세요
답 : 2700 => 3개만 결제하고 2개는 무료 */

package data;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		// 변수 선언
		int price = 900;
		int count = 5;
		
		//계산 : 개수/2 => 무료개수
		int freeCount = count/2;
		int payCount = count - freeCount;
		int total = payCount * price;
		
		//출력
		System.out.println("1+1행사상품입니다");
		System.out.println(total);
		 
	}

}
