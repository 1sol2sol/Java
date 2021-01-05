package array;

public class Test12_1 {
	public static void main(String[] args) {
		
//		1. 데이터 준비
		int[] data = new int[] { 30, 50, 20, 40, 10 };
		
//		2. 1회차 정렬을 반복문 없이 구현
//		2-1. +3지점과 +4지점을 비교하여 swap / pass 처리
		if(data[3] > data[4]) {
			int temp = data[3];
			data[3] = data[4];
			data[4] = temp;
		}
		
//		2-2. +2지점과 +3지점을 비교하여 swap / pass 처리
		if(data[2] > data[3]) {
			int temp = data[2];
			data[2] = data[3];
			data[3] = temp;
		}
		
//		2-3. +1지점과 +2지점을 비교하여 swap / pass 처리
		if(data[1] > data[2]) {
			int temp = data[1];
			data[1] = data[2];
			data[2] = temp;
		}
		
//		2-4. +0지점과 +1지점 비교하여 swap / pass 처리
		if(data[0] > data[1]) {
			int temp = data[0];
			data[0] = data[1];
			data[1] = temp;
		}
		
//		3. 출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}