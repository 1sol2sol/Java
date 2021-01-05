package array;

public class Test12_4 {
	public static void main(String[] args) {
		
//		1. 데이터 준비
		int[] data = new int[] { 30, 50, 20, 40, 10 };
		
//		2. 모든 회차를 각각 구현
//		2-1. 1회차 정렬을 반복문으로 구현
		for(int i=data.length-1; i >= 1; i--) {
			if(data[i-1] > data[i]) {
				int temp = data[i-1];
				data[i-1] = data[i];
				data[i] = temp;
			}
		}
		
//		2-2. 2회차 정렬을 반복문으로 구현
		for(int i=data.length-1; i >= 2; i--) {
			if(data[i-1] > data[i]) {
				int temp = data[i-1];
				data[i-1] = data[i];
				data[i] = temp;
			}
		}
		
//		2-3. 3회차 정렬을 반복문으로 구현
		for(int i=data.length-1; i >= 3; i--) {
			if(data[i-1] > data[i]) {
				int temp = data[i-1];
				data[i-1] = data[i];
				data[i] = temp;
			}
		}
		
//		2-4. 4회차 정렬을 반복문으로 구현(1번이라고 해서 반복을 하지 않으면 규칙이 생기지 않는다)
		for(int i=data.length-1; i >= 4; i--) {
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