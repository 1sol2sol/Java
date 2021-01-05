package array;

import java.util.Arrays;

public class Test13 {
	public static void main(String[] args) {
		
//		라이브러리를 이용한 정렬
		int[] data = new int[] { 30, 50, 20, 40, 10 };
		
		Arrays.sort(data);
		
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}