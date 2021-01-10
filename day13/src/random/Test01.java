package random;

public class Test01 {
	public static void main(String[] args) {
//	Random 값 생성
//	= 범위 내에서 선택될 값을 예측할 수 없는 데이터 
//	= 주사위, 로또 등
//	= 현실세계에서는 범위를 N부터 M까지라고 표현한다.
//	= 프로그래밍에서는 범위는 N부터 M개라고 표현한다. 
//	= Math.random() 명령 사용 또는 Random 이라는 도구를 이용하는 방법이 있다. 
		
//	랜덤으로 주사위를 1회 던진 결과를 출력 (1부터 6개)
	double a = Math.random();		//0이상 1미만의 실수(0.xxxxx)
	double b = a * 6; 				//0이상 6미만의 실수(0.xxx~5.xxx)
	int c = (int)b;					//0이상 6미만의 정수(0,1,2,3,4,5)
	int d = c+1;					//1이상 7미만의 정수(1,2,3,4,5,6)
	
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	System.out.println("c = " + c);
	System.out.println("d = " + d);
	}
}
