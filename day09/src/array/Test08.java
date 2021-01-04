package array;

public class Test08 {
	public static void main(String[] args) {
		// 배열의 데이터 스위칭/스왑
		// = 서로 위치를 바꾸는 작업
		
		// 목표 : a와 b에 들어있는 데이터를 서로 바꾸어 출력
		// = 자바에서는 맞교환이 불가능(되는 언어도 있음)
		int a = 10;
		int b = 20;
		
		a = b;//a에 b를 넣어라
		b = a;//b에 a를 넣어라
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
