/*<문제>
사용자에게 국어,영어,수학 점수를 입력받아 총점과 평균을 계산한 뒤 출력*/
package input;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int koreanScore = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int englishScore = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int mathScore = sc.nextInt();
		
		sc.close();
		
		int total = koreanScore + englishScore + mathScore;
		double average = (double)total / 3;
		
		System.out.println("총점 :" + total);
		System.out.println("평균 :" +average);
	}
}
