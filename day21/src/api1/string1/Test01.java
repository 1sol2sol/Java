package api1.string1;

public class Test01 {

	public static void main(String[] args) {
		//String 클래스 기본 문자열 사용 
		
		//String 클래스에 문자열 리터럴 값 
		//리터럴 : 정수상수(3), 실수상수(3.3), 문자상수('a'), 문자열상수("Hello")
		//"Hello" <- String 객체로 생성됨
		String str = "Hello";
		System.out.println(str); //문자열 출력
		System.out.println(System.identityHashCode(str)); // str에 저장된 객체 주소 출력 
		
		//문자열 값 변경 
		str = "안녕하세요";
		System.out.println(str); //문자열 출력
		System.out.println(System.identityHashCode(str)); // str에 저장된 객체 주소 출력 
		
		//문자열 이어쓰기 
		str = str + " 반갑습니다.";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); // str에 저장된 객체 주소 출력 
		
		// -> str 객체의 값이 변경되거나 추가되는게 아니라 새로운 객체를 만들어서 주소만 바꿔서 사용 
		
	}

}
