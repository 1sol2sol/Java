/*<문제>
자바점수가 65점, 데이터베이터 점수가 72점인 학생이 있을 때 이 학생이 성적부진자인지 판정하여 출력
(성적부진자는 평균점수가 40점 이상 70점 미만인 학생을 말합니다)*/

package data;
import java.lang.*;
public class Test17 {
	public static void main(String[] args) {
		//준비
		int javaScore = 65;
		int databaseScore = 72;
		
		//계산
		double average = (javaScore + databaseScore) / 2.0;
		// or double average = (double)(javaScore + databaseScore) / 2;
		boolean fail = 40 <= average && average < 70;// 논리연산 : 논리를 위한 계산. 안봐도 되는 상황을 pass
		// boolean fail = 40 <= average & average < 70; //비트연산 : 숫자를 위한 계산. 안봐도 되는 상황도 check
		
		//출력
		System.out.println(fail);
	}
}
