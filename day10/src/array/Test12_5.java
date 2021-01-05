package array;

public class Test12_5 {
	public static void main(String[] args) {
		
//		1. 데이터 준비
		int[] data = new int[] { 30, 50, 20, 40, 10 };
		
//		2. 모든 회차를 통합 반복문으로 구현
		for(int k=1; k <= 4; k++) {
			for(int i=data.length-1; i >= k; i--) {
				if(data[i-1] > data[i]) {
					int temp = data[i-1];
					data[i-1] = data[i];
					data[i] = temp;
				}
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