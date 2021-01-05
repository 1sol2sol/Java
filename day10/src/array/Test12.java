package array;

public class Test12 {
	public static void main(String[] args) {
		
//		1. 데이터 준비
		int[] data = new int[] { 30, 50, 20, 40, 10 };
		
//		2. +3지점과 +4지점을 비교하여 swap / pass 처리
		if(data[3] > data[4]) {
			int temp = data[3];
			data[3] = data[4];
			data[4] = temp;
		}
		
//		3. 출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}