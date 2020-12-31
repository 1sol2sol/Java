package array;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//목표 : 정수 세개(10, 30, 30)를 저장하고 화면에 출력
		// = 정수 형태의 변수를 세 개 준비하여 구현
		// = 정수 여러개를 저장할 수 있는 배열을 한개 준비하여 구현
		
		//배열로 구현
		// = 크기를 내가 원하는 값으로 지정할 수 있으므로 "생성"을 해야 한다. 
		int[] data = new int[3]; // => 저장공간생성
		System.out.println(data.length); // 3
		
		data[0] = 10; //=> 데이터 초기화 
		data[1] = 20; //=> 데이터 초기화 
		data[2] = 30; //=> 데이터 초기화 
		
		
		System.out.println(data); // 참조변수(리모컨) 정보 
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
				
		
		
		

	}

}
