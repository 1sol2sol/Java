/*<문제>
달팽이가 나무에 올라가려고 합니다
낮에는 3cm 올라가고 밤에는 2.5cm를 내려옵니다
나무의 높이가 15cm이라고 할 때 달팽이가 나무에 올라가려면 몇일이 걸리는지 계산하여 출력하세요*/
package loop2;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		// 1. 낮에는 3cm 올라가고, 밤에는 2.5cm 내려오도록 무한반복을 구현
		
		double position = 0; //달팽이의 위치
		
		while(true) {
			position +=3; // 3cm 올라가는 코드
			System.out.println("올라간 위치:"+position+"cm" );
			
			position +=2.5;// 2.5cm 내려가는 코드
			System.out.println("내려간 위치:"+position+"cm" );
		}
	}
}
