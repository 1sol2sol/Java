package input;
import java.io.IOException;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) throws IOException {
// 표준 입력 : System.in 을 이용하여 키보드로부터 전달되는 글자를 읽어내는 것
//	- 출력은 정해진 글자를 결과화면에 내보내는 반면, 입력은 사용자가 언제, 몇 글자를 입력할 지 알 수 없다.
//	- ex : 키오스크(무인발권기), 자판기 등

// System.in.read() 라는 명령을 이용하면 사용자가 입력한 값 1개를 받아낼 수 있다.
// = 받아낸 결과는 ASCII code 번호로 들어온다.
// = 이 명령은 위험한 명령(프로그램이 아닌 외부의 영향을 받는 명령)
// = 위험한 경우에 대한 plan B를 요구한다 = 예외처리(아직 안배웠음)
// = 엔터든 스페이스든 뭐든지 글자로 인식하기 때문에 구분을 개발자가 직접 해야한다.
// = 숫자를 인지하지 못하기 때문에 여러자리를 개발자가 직접 합쳐야한다.
	int a = System.in.read();
	System.out.println("a=" + a);
	int b = System.in.read();
	System.out.println("b=" + b);
	
	}
}
