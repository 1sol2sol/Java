package api1.string2;

import java.util.StringTokenizer;

public class Test04 {

	public static void main(String[] args) {
		// StringTokenizer 클래스 기본 사용 
		
		String str ="AA,BB,CC,DD,EE,FF,GG";
		
		// str에 저장된 문자열을 콤마(,) 기호를 기준으로 나누어서 저장
		StringTokenizer st = new StringTokenizer(str, ",");
		
		// 저장된 토큰 개수 확인 
		System.out.println(st.countTokens()); // 7
		
		// 저장된 값 확인 1
//		int count = st.countTokens();
//		for(int i=0; i< count; i++) {
//			System.out.println(st.nextToken()); 
//		}
		
		// 저장된 값 확인 2
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken()); 
			System.out.println(st.countTokens());
		}
		
		// -> 저장된 값은 한번 사용하고 나면 다시 사용 불가능 
	}

}
