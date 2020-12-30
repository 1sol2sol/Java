/*<문제>
1부터 100까지 사이에 있는 홀수를 출력해보세요*/
package loop;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
	// 목표 : 1부터 100사이의 홀수 출력
	//= 1,3,5,7,9 ~ 95,97,99
	//=	1부터 99까지 2씩 증가
	//= 1부터 100까지 2씩 증가
	//= 반복 횟수 50번 = 속도가 빠르다 = 단순한 규칙만 가능
		for(int i = 1; i <= 100; i = i+2) {
			System.out.println(i);
		}
		
		
	// = 1부터 100까지 범위 설정 후 조건을 추가
	// = 반복횟수 100번 + 조건 = 속도가 느리다 = 조건이 복잡해도 가능
		for(int i = 1; i <= 100; i = i + 1) {
		  //if(1%2 != 0){ 
			if(i%2==1) { //if(i가 홀수라면)
				System.out.println(i);
			}
		}
	}

}
