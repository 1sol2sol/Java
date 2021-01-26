package api1.string2;

public class Test02 {

	public static void main(String[] args) {
		// StringBuffer 클래스 메소드 사용 
		
		StringBuffer sb = new StringBuffer("안녕하세요"); // 객체 생성시 문자열 바로 입력
		
		// 1. 객체에 데이터 추가 - .append()
		// - 기존 객체 정보
		System.out.println(sb); //안녕하세요
		System.out.println("sb객체 주소 : " + sb.hashCode()); // 653305407
		System.out.println("sb객체 크기 : " + sb.capacity()); // 21
		System.out.println("sb글자 개수 : " + sb.length()); // 5
		
		// - 문자열 추가 
		sb.append(" 반갑습니다.");
		System.out.println(sb); // 안녕하세요 반갑습니다.
		System.out.println("sb객체 주소 : " + sb.hashCode()); // 653305407
		System.out.println("sb객체 크기 : " + sb.capacity()); // 21
		System.out.println("sb글자 개수 : " + sb.length()); // 12
		
		// - 문자열 추가 - 현재 버퍼의  남는 공간 크기 초과했을때
		sb.append(" 모두모두 열공하세요~!!");
		System.out.println(sb); // 안녕하세요 반갑습니다. 모두모두 열공하세요~!!
		System.out.println("sb객체 주소 : " + sb.hashCode()); // 653305407
		System.out.println("sb객체 크기 : " + sb.capacity()); // 44 -> 글자 개수에 따라 자동으로 버퍼의 크기 증가 
		System.out.println("sb글자 개수 : " + sb.length()); // 26
		
		// 2. 객체에 데이터 삽입 : .insert()
		sb.insert(0, "여러분 "); // 0번 인덱스에 "여러분 " 문자열 삽입
		System.out.println(sb); // 여러분 안녕하세요 반갑습니다. 모두모두 열공하세요~!!
		
		// 3. 객체의 데이터 삭제 : .delete()
		sb.delete(4, 10);	// 4번 인덱스부터 9번 인덱스까지 삭제 
		System.out.println(sb); // 여러분 반갑습니다. 모두모두 열공하세요~!!
	}

}
