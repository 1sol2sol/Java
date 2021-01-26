package api1.string2;

public class Test03 {

	public static void main(String[] args) {
		// StringBuilder 클래스 사용 
		
		// 참조변수 생성 및 객체 생성
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1); // 아무값 출력 안됨
		System.out.println(sb1.capacity()); // 16
		
		//객체 생성 시 정수형태로 버퍼 크기 지정
		StringBuilder sb2 = new StringBuilder(10);
		System.out.println(sb2); // 아무값 출력 안됨
		System.out.println(sb2.capacity()); // 10
		
		//객체 생성 시 문자열 바로 입력
		StringBuilder sb3 = new StringBuilder("안녕하세요");
		System.out.println(sb3); // 안녕하세요
		System.out.println(sb3.capacity()); // 21
		
		// 1. 객체에 데이터 추가 : .append
		sb3.append(" 반갑습니다.");
		System.out.println(sb3); // 안녕하세요 반갑습니다.
		
		// 2. 객체에 데이터 삽입 : .insert
		sb3.insert(0, "여러분 ");
		System.out.println(sb3); // 여러분 안녕하세요 반갑습니다.
		
		// 3. 객체의 데이터 삭제 : .delete
		sb3.delete(4, 10);
		System.out.println(sb3); // 여러분 반갑습니다.
		
	}

}
