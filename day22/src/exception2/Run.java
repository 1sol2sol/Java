package exception2;

public class Run {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		try {
		System.out.println(c.div(100,20));	// 5 - 정상결과 출력 
		System.out.println(c.div(100,0));	// 예외 발생
		} catch(ArithmeticException e) {
			System.out.println("예외발생");
		}
		
		System.out.println("프로그램 종료");
	}
}
