/*<문제>
1.30,50,20,10,40 이라는 데이터를 배열에 보관하세요 
2.배열의 데이터들을 거꾸로 배치되도록 교체하세요
 - 40,10,20,50,30 형태로 데이터의 위치가 수정되어야 합니다
 - 출력할 때 수정하는 것은 안됩니다
3.배열에 들어있는 데이터들을 출력하세요*/
package array;
public class Test09_4 {
	public static void main(String[] args) {

//		1. 배열 준비
		int[] data = new int[] { 30, 50, 20, 10, 40, 60 };

//		2. 반복문으로 진행
//		= 왼쪽위치와 오른쪽위치를 변수로 구해놓고 시작
		
		int left = 0;//왼쪽은 0부터 시작
		int right = data.length-1;//오른쪽은 마지막부터 시작
		
//		for(int i=0; i < 2; i++) {
		for(int i=0; i < data.length / 2; i++) {
			int temp = data[left];
			data[left] = data[right];
			data[right] = temp;
			left++;//왼쪽 위치를 +1
			right--;//오른쪽 위치를 -1
		}
		
//		3. 출력
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();

	}
}