/*<문제>
우리반 학생들의 사전평가 점수는 다음과 같습니다.
[ 38점, 45점, 62점, 70점, 55점, 85점, 92점, 40점, 30점, 55점 ]
1.학생들의 점수를 배열을 만들고 저장한 뒤 모두 출력
2.재평가자의 점수만 출력(재평가는 40점 미만인 경우에 해당)
3.통과자의 점수만 출력
4.모든 학생의 점수 평균을 구하여 출력
5.통과한 학생의 인원수를 세어 출력
6.45점인 학생의 등수를 구하여 출력*/
package array;
import java.lang.*;
public class Test05 {

	public static void main(String[] args) {
		//생성과 동시에 초기화
		int[] score = new int[] { 38, 45, 62, 70, 55, 85, 92, 40, 30, 55 };

		int total = 0;
		int count = 0;

		// 1번
		System.out.println("<우리반 학생들의 사전평가 점수를 모두 출력하시오>");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + "점");
		}

		// 2번
		//재평가자 출력은 전체 출력에 재평가 조건을 설정하여 필터링한다
		System.out.println("-------------------------------------------------");
		System.out.println("<재평가자의 점수만 출력하시오(40점 미만은 재평가자 입니다)>");
		for (int i = 0; i < score.length; i++) {
			if (score[i] < 40) {
				System.out.println(score[i] + "점");
			}
		}

		// 3번
		// 통과 : ???이 ???일때 (점수가 40 이상일때)
		System.out.println("-------------------------------------------------");
		System.out.println("<합격자의 점수만 출력하시오(40점 이상)");
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 40) {
				System.out.println(score[i] + "점");
			}
		}

		// 4번
		System.out.println("-------------------------------------------------");
		System.out.println("<모든 학생의 점수 평균을 구하여 출력하시오>");
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
		System.out.println("모든 학생의 평균점수는 " + (double)total / score.length + "입니다");

		// 5번
		System.out.println("-------------------------------------------------");
		System.out.println("<통과한 학생의 인원수를 세어 출력하시오>");
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= 40) {
				count++;
			}
		}
		System.out.println("통과한 학생은 " + count + "명입니다");

		// 6번
		// 등수 = 전체에서 나의 순서
		//     = 나보다 우수한 학생 수 + 1 (카운트의 변형 문제)
		//       => 나보다 우수한 사람이 없으면 내가 일등이기 때문에 +1
		System.out.println("-------------------------------------------------");
		System.out.println("<45점인 학생의 등수를 구하여 출력하시오>");

		for (int i = 0; i < score.length; i++) {
			if (score[i] > 45) {
			}
		}
		
		int rank = count + 1;

		System.out.println("점수가 45점인 학생은 " + rank + "등 입니다.");
	}
}
