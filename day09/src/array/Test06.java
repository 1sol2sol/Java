package array;

public class Test06 {
	public static void main(String[] args) {
//	배열에서는 위치제어가 매우 중요한 기능 중 하나이다.
//  = 배열의 모든 데이터를 우측으로 1칸씩 이동하세요
//	= 배열의 모든 데이터를 좌측으로 1칸씩 이동하세요
//	= 배열의 모든 데이터를 거꾸로 배치하도록 이동하세요
//	= 배열의 모든 데이터를 정렬하세요(오름차순/내림차순)
// 	= 이러한 기능들을 조합하여 여러 가지 작업을 수행할 수 있다.
		
		int[] data = new int[] {30,50,20,10,40};
		
		// 반목문 없이 어떻게 코드를 작성해야 오른쪽으로 1칸 쉬프트가 가능할까?
		int temp = data[4]; // temp라는 변수를 만들어서 40을 복사해둠
		data[4]=data[3];
		data[3]=data[2];
		data[2]=data[1];
		data[1]=data[0];
		data[0]=temp;
				
		//데이터 전체 출력
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
