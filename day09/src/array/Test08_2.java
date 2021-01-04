package array;

public class Test08_2 {
	public static void main(String[] args) {
		// 배열의 데이터 스위칭/스왑
		// = 서로 위치를 바꾸는 작업
		
		// 목표 : 배열의 특정 위치를 서로 교체 
		// = 맞교환이 불가능하므로 제 3의 임시 변수를 만들어 회전 형태로 구현
		
		//준비
		int[] data = new int[] {30,50,20,10,40,};
	
		// 계산 : +0 위치와 +3 위치의 데이터를 교체
		
		int temp = data[0];
		data[0]=data[3];
		data[3]=temp;
		
		//출력
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}

}
