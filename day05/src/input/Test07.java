package input;
import java.lang.*;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
// 목표 : 띄어쓰기가 있는 경우에도 입력을 받고 싶다면?
// - 문자열만 가능 
// - .next 계열 명령들은 "개행"이나 "공백"등을 구분기호(delimiter)로 인식한다(엔터나 스페이스를 동일하게 취급)
// - 이런 구분이 싫으면 "개행(enter)"만 구분기호로 인식하는 명령을 사용하면 된다(.nextLine)
// - .nextLine과 다른 .next 명령을 섞어서 사용하면 입력이 정상적으로 이뤄지지 않는다(해결은 가능하지만 비추천)		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장 하나를 입력하세요");
		String text = sc.nextLine();
		sc.close();
		
		System.out.println(text);
	}
}
