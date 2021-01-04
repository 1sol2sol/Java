/*<문제>
1.30,50,20,10,40 이라는 데이터를 배열에 보관하세요 
2.배열의 데이터들을 거꾸로 배치되도록 교체하세요
 - 40,10,20,50,30 형태로 데이터의 위치가 수정되어야 합니다
 - 출력할 때 수정하는 것은 안됩니다
3.배열에 들어있는 데이터들을 출력하세요*/
package array;
public class Test09_2 {
	public static void main(String[] args) {

//		1. 배열 준비
		int[] data = new int[] { 30, 50, 20, 10, 40 };

//		2. 2번의 교체를 반복문 없이 진행
//		= 처음과 마지막만 배열의 길이와 관계없이 교체되도록 구현해본다
//		= 처음 : +0 지점
//		= 마지막 : +(data.length-1) 지점
		
//		data[0] <----> data[data.length-1]
		int temp = data[0];
		data[0] = data[data.length-1];
		data[data.length-1] = temp;
		
//		data[1] <----> data[data.length-2]
		temp = data[1];
		data[1] = data[data.length-2];
		data[data.length-2] = temp;
		
//		3. 출력
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();

	}
}