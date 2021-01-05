/*<문제>
달팽이가 나무에 올라가려고 합니다
낮에는 3cm 올라가고 밤에는 2.5cm를 내려옵니다
나무의 높이가 15cm이라고 할 때 달팽이가 나무에 올라가려면 몇일이 걸리는지 계산하여 출력하세요*/
package loop2;
import java.lang.*;
public class Test05_2 {
	public static void main(String[] args) {
		// 3. 카운트 추가 : 낮 위치가 15cm인 경우
		
		double position = 0; //달팽이의 위치
		int count = 0;
		
		while(true) {
			position +=3; // 3cm 올라가는 코드(낮)
			System.out.println("올라간 위치:"+position+"cm" );
		
			count++
			; // 낮의 개수를 카운트
			
			if(position>=15) {
				System.out.println("올라왔네요!");
				break;
			}
			
			position -=2.5;// 2.5cm 내려가는 코드(밤)
			System.out.println("내려간 위치:"+position+"cm" );
		}
		
		System.out.println("총"+count+"일 걸립니다");
	}
}
