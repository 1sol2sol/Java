package input;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main (String[] args) {
//	<문제>
//	사용자에게 닉네임을 입력받아 사용 가능한지 판정하여 출력
//	- 사용가능한 닉네임의 기준은 문자열의 길이(legnth)가 2~10자 이내일 경우로 정합니다
//	- 사용이 가능하다면 true, 사용이 불가능하다면 false를 출력하세요.
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("닉네임을 입력하세요");
		String nickname = sc.next();
		sc.close();
		//계산
		int size = nickname.length();
		boolean pass = size >= 2 && size <= 10;
		
		//출력
		System.out.println("닉네임 :" + nickname);
		System.out.println("검사결과 :" + pass);
		
		
	}
}
