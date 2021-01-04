package array;

public class Test10 {
public static void main(String[] args) {
		// 최소, 최대값 찾기
		// =선택정렬(selection sort) 구현을 위한 필수 개념
	
		// 1. 데이터 준비
		int[] data = new int[] {30,50,20,10,40};
		
		// 2. 최소값 탐색
		// [1] 가장 앞의 데이터가 최소값이라고 가정
		int index = 0; //가장 작다고 예상되는 위치
		int min = data[0];//가장 작다고 예상되는 값 
		
		//[2]두번째 칸부터 마지막까지 위에서 정한 데이터와 비교 
		for(int i = 1; i<data.length; i++) {
			System.out.println("min = " + min + ", data[i] =" + data[i]);
			if(min>data[i]) {//지금 본 데이터(data[i])가 내가 기억하는 최소값(min)보다 작다면 min을 교체
				System.out.println("교체합니다");
				min=data[i];//값을 수정하고
				index=i;//위치를 수정하고 
			}
			else {
				System.out.println("교체하지 않습니다");
			}
		}
		// 3. 출력 
		System.out.println("제일 작은값 : " + min);
		System.out.println("제일 작은 값의 위치 : " + index);
}
}
