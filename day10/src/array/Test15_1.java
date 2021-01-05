
package array;

public class Test15_1 {
	public static void main(String[] args) {
//		2차원 배열 생성과 동시에 초기화
		String[][] data = new String[][] {
			{"자바", "JSP", "Spring"},
			{"Python", "DJango", "Pandas"}
		};
		
		for (int k = 0; k < data.length; k++) {
			for (int i = 0; i < data[k].length; i++) {
				System.out.print(data[k][i]);
				System.out.print('\t');
			}
			System.out.println();
		}

	}
}
