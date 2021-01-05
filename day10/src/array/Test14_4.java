package array;

public class Test14_4 {
	public static void main(String[] args) {
//		2차원 배열의 생성
//		= 표의 형태
//		= 줄/칸의 개념이 있다

//		1. 생성 후 초기화 하는 방법
		int[][] score = new int[5][3]; // 세칸짜리 1차원 배열을 5개 모은 형태
										// 3개짜리 5개

//		score ----> score[0]  ----> [0][62][0]
//					score[1]  ----> 75][0][0]
//					score[2]  ----> [0][50][0]	
//					score[3]  ----> [0][0][0]
//					score[4]  ----> [0][0][0]

//		2. 초기화
		score[0][1] = 62;
		score[1][0] = 75;
		score[2][1] = 50;

//		3. 전체 출력 -length 활용
		System.out.println(score.length);
		System.out.println(score[0].length); // score[0]줄의 길이
		for (int k = 0; k < score.length; k++) {
			for (int i = 0; i < score[k].length; i++) {
				System.out.print(score[k][i]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
