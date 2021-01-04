package array;

public class Test08_1 {
	public static void main(String[] args) {
		// 배열의 데이터 스위칭/스왑
		// = 서로 위치를 바꾸는 작업
		
		// 목표 : a와 b에 들어있는 데이터를 서로 바꾸어 출력
		// = 자바에서는 맞교환이 불가능(되는 언어도 있음)
		// = 맞교환이 불가능하므로 제 3의 임시 변수를 만들어 회전 형태로 구현
		
		int a = 10;
		int b = 20;
		
		int temp = a;
		
		a = b;//a에 b를 넣어라
		b = temp;//b에 a를 넣어라
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
