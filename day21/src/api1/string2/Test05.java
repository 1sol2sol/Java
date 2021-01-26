package api1.string2;

import java.util.StringTokenizer;

public class Test05 {

	public static void main(String[] args) {
		// StringTokenizer 클래스 사용 2 
		// - 저장된 토큰을 배열에 저장해서 사용 
		
		String str = "홍길동 김길동 이길동 박길동";
		
		// str에 저장된 문자열을 공백을 기준으로 나누어서 저장 
		StringTokenizer st = new StringTokenizer(str, " ");
		
		// 문자열 배열 생성 - 배열의 크기는 나누어진 토큰 개수로 지정 
		String [] arr = new String[st.countTokens()];
		
		// 배열의 각 공간에 토큰값 저장
		for(int i=0; st.hasMoreTokens(); i++) {
			arr[i] = st.nextToken();
		}
		
		// 배열 내 저장된 데이터 확인
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
