package array;

public class Test06_1 {
	public static void main(String[] args) {
//	배열에서는 위치제어가 매우 중요한 기능 중 하나이다.
//  = 배열의 모든 데이터를 우측으로 1칸씩 이동하세요
//	= 배열의 모든 데이터를 좌측으로 1칸씩 이동하세요
//	= 배열의 모든 데이터를 거꾸로 배치하도록 이동하세요
//	= 배열의 모든 데이터를 정렬하세요(오름차순/내림차순)
// 	= 이러한 기능들을 조합하여 여러 가지 작업을 수행할 수 있다.
		
		int[] data = new int[] {30,50,20,10,40};
		
		// 반목문 없이 어떻게 코드를 작성해야 오른쪽으로 1칸 쉬프트가 가능할까?
		// = 일반화를 시켜보자(데이터가 변화하더라도 제대로 수행되는 코드)
		// = 배열의 데이터 개수를 모른다고 가정하면 가장 오른쪽 끝 데이터를 잠시 temp라는 변수에 빼두고
		//   끝에서부터 데이터를 좌에서 우로 한 칸씩 복사(반복문으로 처리 가능)
		//   temp에 빼둔 데이터를 맨 앞에 대입 
		
		int temp = data[data.length - 1]; // temp라는 변수를 만들어서 40을 복사해둠
		
		for(int i=data.length-1; i>0; i--) {
			data[i] = data[i-1];
		}
		
		data[0]=temp;
				
		//데이터 전체 출력
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
	}
}
