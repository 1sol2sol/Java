/*<문제>
다음 내용을 구현하세요
1. 30,50,20,10,40 이라는 데이터를 배열에 보관하세요
2. 배열을 왼쪽으로 한 칸 이동하도록 구현하세요
3. 가능하다면 배열을 원하는 만큼 왼쪽으로 입력하도록 구현하세요*/
package array;
public class Test07_1 {

	public static void main(String[] args) {
		// 1.데이터를 배열에 보관
		int[] data = new int[] {30,50,20,10,40};
		
		// 2.데이터 회전(1칸,반목문없이)> 50,20,10,40,30
		int temp = data[0]; // 가장 좌측에 있는 데이터를 임시 변수에 저장
		
		data[0]=data[1];
		data[1]=data[2];
		data[2]=data[3];
		data[3]=data[4];
		
		data[4]=temp;//마지막 자리에 임시 변수에 저장해둔 데이터를 대입
		
		
	
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}

}
