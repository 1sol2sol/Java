/*어떤 학생의 점수가 다음과 같습니다
국어 60 / 영어 70 / 수학 66
이 학생의 총점과 평균을 출력하세요 */
package data;
import java.lang.*;
public class Test11 {
	public static void main(String[] args) {
		//변수선언
		int korean = 60;
		int english = 70;
		int math = 66;
		//계산
		int total = korean + english + math;
		double average = total / 3.0; 
		// 3.0으로 나누는 이유는 3으로 나눌경우 앞/뒤가 전부 정수이기때문에 실수로 결과값이 나와야 해서 
		
		//출력
		System.out.println(total);
		System.out.println(average);
	}
}
