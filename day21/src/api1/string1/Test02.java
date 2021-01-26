package api1.string1;

public class Test02 {

	public static void main(String[] args) {
		// String 객체 생성 방법 2
		
		// 1. 문자열 리터럴 사용 : String pool 영역에 객체 생성됨 
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(System.identityHashCode(str1));// str1에 저장된 객체 주소 출력 
		System.out.println(System.identityHashCode(str2));// str2에 저장된 객체 주소 출력 
		// -> 주소가 같음 : Pool에 동일한 문자열을 한개만 만들어 놓고 같은 주소를 저장해서 사용함
		
		// 2. new 연산자 사용 : 일반 Heap 영역에 객체 생성됨
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(System.identityHashCode(str3));// str3에 저장된 객체 주소 출력 
		System.out.println(System.identityHashCode(str4));// str4에 저장된 객체 주소 출력 
		// -> 주소가 다름 : Heap 영역에 각각 별도의 객체 생성됨 
		
		
	}

}
