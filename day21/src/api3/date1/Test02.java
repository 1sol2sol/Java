package api3.date1;

import java.util.Calendar;

public class Test02 {

	public static void main(String[] args) {
		// Calendar 클래스 사용
		
		// 캘린더 객체 생성
		Calendar today = Calendar.getInstance();
		
		// 현재 저장된 시간 출력 
		System.out.println(today.getTime());
		
		// .get() 메소드로 원하는 값만 가져올 수 있음 
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH)+1+"월");
		System.out.println(today.get(Calendar.DATE)+"일");
		
		// .set() 메소드로 원하는 값으로 설정 가능 
		today.set(2000,5,20);
		System.out.println(today.getTime()); // Tue Jun 20 15:12:00 KST 2000
		
	}

}
