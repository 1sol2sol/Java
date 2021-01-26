package api3.date1;

import java.util.Calendar;

public class Test03 {

	public static void main(String[] args) {
		// D-Day 계산하는 방법
		 Calendar today = Calendar.getInstance();

		 Calendar dday = Calendar.getInstance();
		 dday.set(2021, 0, 27);
		 
		 System.out.println(today.getTime());
		 System.out.println(dday.getTime());
		 
		 System.out.println(dday.getTimeInMillis());  //날짜와 시간을 밀리초 단위로 가져옴(1초를 1000으로 치고 가져옴)
		 System.out.println(today.getTimeInMillis()); //날짜와 시간을 밀리초 단위로 가져옴(1초를 1000으로 치고 가져옴)

		 long date = (dday.getTimeInMillis()/1000) - (today.getTimeInMillis()/1000); // 밀리초에서 초로 바꿈 
		 System.out.println(date); // 결과값도 초가 나옴 이제 이것을 일수로 계산해줘야함 
		 
		 date = date/60/60/24; // -> date(초단위) / 60초 / 60분 / 24시간 -> 일수로 계산 
		 
		 System.out.println(date);
	
	}

}
