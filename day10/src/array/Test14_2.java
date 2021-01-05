package array;

public class Test14_2 {
	public static void main(String[] args) {
//		2차원 배열의 생성
//		= 표의 형태
//		= 줄/칸의 개념이 있다

//		1. 생성 후 초기화 하는 방법
		int[][] score = new int[5][3]; // 세칸짜리 1차원 배열을 5개 모은 형태
										// 3개짜리 5개

//		score ----> score[0]  ----> [0][0][0]
//					score[1]  ----> [0][0][0]
//					score[2]  ----> [0][0][0]	
//					score[3]  ----> [0][0][0]
//					score[4]  ----> [0][0][0]

//		2. 초기화

//		3. 전체 출력
		for (int k = 0; k < 5; k++) {
			for (int i = 0; i < 3; i++) {
				System.out.print(score[k][i]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
