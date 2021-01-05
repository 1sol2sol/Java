
package array;

public class Test15 {
	public static void main(String[] args) {
		String[][] data = new String[2][3];
		
		data[0][0] = "[자바]";
		data[0][1] = "[JSP]";
		data[0][2] = "[Spring]";
		data[1][0] = "[Python]";
		data[1][1] = "[DJango]";
		data[1][2] = "[Pandas]";
		

		for (int k = 0; k < data.length; k++) {
			for (int i = 0; i < data[k].length; i++) {
				System.out.print(data[k][i]);
				System.out.print('\t');
			}
			System.out.println();
		}

	}
}
