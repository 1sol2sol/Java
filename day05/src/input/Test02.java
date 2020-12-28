package input;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
// 입력을 보조할 수 있는 도구를 활용하여 쉽게 입력받아서 처리를 수행
// = java.util.Sacanner
// = 기본 제공되지 않기 때문에 도구를 생성해야 한다.
		
// 도구생성
// = 표준 입력 통로(System.in)의 정보를 설정한 Scanner라는 도구를 만들어서 sc라는 리모컨으로 제어하겠습니다.		
// String str = "hello";(참조형)
//	int a = 100; //(원시형)
	Scanner sc = new Scanner(System.in); //(참조형)
	
// 	[1] sc.next() 라는 명령을 사용하면 "공백 전까지"를 문자열 형태로 입력받는다(글자수 무관)	
	String a = sc.next();
	System.out.println("a = " + a);
	
//	[2] sc.nextInt() 라는 명령을 사용하면 "공백 전까지"를 int 형태로 입력받는다(자리수 무관)
	int b = sc.nextInt();
	System.out.println("b = " + b );
	
// 	Scanner를 만들었으면 마지막에는 "정리"를 해야한다.
// 	= 자원 누수를 막아 효과적인 관리를 할 수 있게 해줍니다. 	
	sc.close();
	
	
	
	
	}
}
