package api1.string2;

public class Test01 {

	public static void main(String[] args) {
		// StringBuffer 클래스 객체 생성 
		
		// 참조변수 생성 및 객체 생성
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1); // 아무것도 출력 안됨 - sb1 객체 안에 있는 문자열 출력 
		System.out.println(sb1.capacity()); // 16 - sb1 객체 버퍼의 크기 (기본 16개 문자 저장공간이 만들어짐)
		
		// 객체 생성 시 정수형태로 버퍼 크기 지정
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.capacity()); // 10 - sb2 객체 버퍼의 크기 출력(지정한 크기만큼 공간 만들어짐)
		
		// 객체 생성 시 저장할 문자열 바로 입력 
		StringBuffer sb3 = new StringBuffer("안녕하세요");
		System.out.println(sb3); //안녕하세요 - sb3 객체 안에 있는 문자열 
		System.out.println(sb3.capacity()); // 21 - sb3 객체 버퍼의 크기 출력(저장된 문자열 + 16개 문자 저장 공간이 만들어짐)
	}

}
