package condition;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
// 다중 그룹 조건
// 상황 : 출근까지 남아있는 시간에 따라 교통편을 선택하는 예제
// - 선택지1 : 버스(한번에 가고 앉을 수 있지만 1시간 30분 소요)
// - 선택지2 : 지하철(환승을 해야 하지만 1시간 소요)
// - 선택지3 : 택시(돈은 비싸지만 30분 소요)
// - 일어나서 출근까지 남은 시간을 계산하여 "가장 편하고 저렴한 방법"을 선택한다고 가정
		
// 준비
	int time = 20;/*분*/
	
// 출력
	if(time >= 90) {
		System.out.println("버스 타고 출근");
	}
	else{
		if(time >= 60) {
			System.out.println("지하철 타고 출근");
		}
		else {
			if(time >= 30) {
				System.out.println("택시 타고 출근");
			}
			else {
			System.out.println("반차 또는 연차 사용");
		}
	}
}
}
}