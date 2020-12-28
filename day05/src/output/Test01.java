package output;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
// 출력 : System.out을 이용하여 값을 결과하면에 내보내는 행위
// Q : System.out.println 말고 다른 명령은 없을까?
// A : Systme.out.print도 있다. 차이는 줄바꿈을 하느냐 안하느냐의 차이 
		
	System.out.println("Hello!");	
	System.out.print("print");
	System.out.print("test");
	System.out.print(10 * 20);
	
// 문제되는 상황 및 해결책
	System.out.println(); // 엔터
	
// [1] 간격을 맞춰야 하는 경우	
// - 탭 키를 문자열 안에 직접 입력해도 되지만 띄어쓰기와 구분이 안되고 몇 번 사용되었는지 파악하기 어려움 
// - \t 를 이용해서 탭키를 직접 삽입(escape sequence)
	System.out.println("이름\t나이");
	System.out.println("뽀로로\t10");
	System.out.println("크롱\t11");
	
// [2] 개행을 해야 하는 경우
// - \n 을 이용해서 개행을 직접 삽입(escape sequence)
	System.out.println("테스트1");
	System.out.println("테스트2");
	System.out.println("테스트3\n테스트4");
	
// [3] \로 인해 문제가 발생하는 상황이 있다 
//	- \는 단독으로 사용할 수 없으며, 반드시 뒤에 있는 글자와 합쳐지도록 되어있다.
//	- \를 화면에 출력하고 싶은 경우에는 \뒤에 \를 다시 사용해야 한다.
	System.out.println("C:\\Windows");
	
// [4] \를 이용하여 글자와 기호를 구분할 수도 있다.
//	- ex : 화면에 나는 지금 "피자"가 먹고싶다 를 출력한다면?
	System.out.println("나는 지금 \"피자\"가 먹고싶다");
	
// System.out.printf는 수업에서 다루지 않습니다(C언어 계열에서 넘어온 명령)
	
	}
}
