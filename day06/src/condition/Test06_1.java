package condition;

public class Test06_1 {
	public static void main(String[] args) {
		//준비
		int time = 20;
		
		//출력
		if(time >= 90) {
			System.out.println("버스 타고 출근");
		}
		else if(time >= 60){
			System.out.println("지하철 타고 출근");
		}
		else if(time >= 30){
			System.out.println("택시 타고 출근");
		}
		else {
			System.out.println("반차 또는 연차 사용");
		}
}
}