package random;

public class Test02 {
	public static void main(String[] args) {
//	Random 값 생성
//	= Math.random() 공식으로 만들기
		
//	정수 추출 공식
//	= (int)(Math.random() * 개수) + 시작수

//	랜덤으로 주사위를 1회 던진 결과를 출력 (1부터 6개)
	int d = (int)(Math.random() * 6)+1;					
	System.out.println("d = " + d);
	}
}
