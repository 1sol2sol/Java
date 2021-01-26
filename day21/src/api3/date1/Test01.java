package api3.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		// Date 객체 사용 
		
		// 객체를 생성하면서 시스템으로부터 현재 날짜와 시간정보를 가져와서 저장 
		Date d1 = new Date();
		System.out.println(d1); // Wed Jan 20 14:49:52 KST 2021
		
		// 원하는 포멧으로 변환해서 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(d1)); // 2021년 01월 20일 14시 53분 08초
		
		// 객체를 생성하면서 날짜를 지정해서 저장 
		// - long형 정수 값을 가지고 날짜와 시간을 계산해서 저장해 줌 
		// - 1970년 1월 1일 0시 0분 0초 부터 밀리초(1/1000) 단위로 경과한 날짜와 시간
		// - 1000 * 60초 * 60분 * 24시간 * 365일  = 31536000000
		Date d2 = new Date(31536000000L); 
		System.out.println(d2); // Fri Jan 01 09:00:00 KST 1971
		
	}

}
