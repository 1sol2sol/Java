package array;

public class Test12_2 {
	public static void main(String[] args) {
		
//		1. 데이터 준비
		int[] data = new int[] { 30, 50, 20, 40, 10 };
		
//		2. 1회차 정렬을 반복문으로 구현(범위 : 4부터 1까지 1씩 감소)
		for(int i=4; i >= 1; i--) {
			if(data[i-1] > data[i]) {
				int temp = data[i-1];
				data[i-1] = data[i];
				data[i] = temp;
			}
		}
		
//		3. 출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}