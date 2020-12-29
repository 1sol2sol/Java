package condition;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		//목표 : 똑같은 지하철 요금을 계산하여 "변수"에 저장시킨다
		//준비
		int age = 20;
		//계산
		//int fare= 0 or 450 or 720 or 1250;
		int fare;//값을 주는게 아니라 변수 선언만 해줌 
		if(age>= 65||age< 8) {//어른신+유아
			fare = 0;
		}
		else if(age>=20) {//성인
			fare = 1250;
		}
		else if(age>=14) {//청소년
			fare = 720;
		}
		else {//어린이
			fare = 450;
		}
		//출력
		System.out.println("지하철 요금 : " +fare+"원");
		
		//추가 계산을 하고 싶을 경우 fare에 들어있는 데이터를 이용하면 된다!(확장성이 좋다)
		//=확장성은 상황에 맞게 고려해야 한다.
		//=가급적이면 출력은 간편하게 하는 것이 좋다.
		
		//추가계산
		int card = 500;
		int distance = 300;
		int total;
		if(age>= 65||age< 8) {
			total=card;
		}
		else {
			total = fare+card+distance;
		}
		System.out.println("총 요금 :" + total + "원");
	}
}
