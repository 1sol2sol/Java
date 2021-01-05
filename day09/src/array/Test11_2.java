/*<문제>
다음 내용을 구현하세요.

배열을 준비하고 다음 데이터를 저장하세요
[ 38점, 45점, 62점, 70점, 55점, 85점, 92점, 40점, 30점, 55점 ]
이 중에서 가장 높은 점수를 찾아서 위치까지 출력
배포한 이미지 파일을 참조하여 점수를 낮은 것부터 왼쪽에 정렬되도록 "오름차순" 처리
1단계 : 배열의 첫 번째 위치에 가장 작은 값을 찾아서 스위칭합니다.
2단계 : 배열의 두 번째 위치에 첫 번째를 제외한 나머지 중에서 가장 작은 값을 찾아서 스위칭합니다.
3단계 : 배열의 세 번째 위치에 위에서 스위칭한 첫번째와 두번째를 제외한 나머지 중 가장 작은 값을 스위칭합니다.
4단계 : 계속해서 정리되지 않은 자리 중 가장 작은 값을 찾아서 해당 순서의 위치와 스위칭합니다.
일단 데이터가 10개라고 가정하고 푸시고, 범용성을 키우도록 확장*/
package array;
//import java.lang.*;
public class Test11_2 {
	public static void main(String[] args) {
		
//		1. 배열을 준비
//		int[] score = new int[10];
//		int score[] = new int[10];
		int[] score = new int[] {38, 45, 62, 70, 55, 85, 92, 40, 30, 55};
		
//		2. 배열의 가장 작은 수를 맨 앞에 배치시키도록 구현
//		= 가장 작은 수의 위치를 알아내야 한다(index)
//		= 맨 앞은 위치가 +0이다
//		= 스왑 코드가 나와야 함
//		= 1회차 정렬
		
		int index = 0;
		for(int i=1; i < score.length; i++) {
			if(score[index] > score[i]) {
				index = i;
			}
		}
		
		int temp = score[0];
		score[0] = score[index];
		score[index] = temp;
		
//		3. 출력
		for(int i=0; i < score.length; i++) {
			System.out.print(score[i]);
			System.out.print('\t');
		}
		System.out.println();
	}
}