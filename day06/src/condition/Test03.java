package condition;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		//그룹조건 :  동시에 실행될 수 없는 상황
		//-else는 if에 작성된 조건식(논리식)을 검사하며 true인 경우 if 내부 구문을 실행,
		//-false인 경우 else 내부 구문은 실행한다
		long money = 10000000000L;
		
		if(money >= 10000000000L) {
			System.out.println("당신은 부자입니다");
		}
		
		else{
			System.out.println("당신은 부자가 아닙니다");
		}
	}
}
