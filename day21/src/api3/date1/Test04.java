package api3.date1;

import java.util.Calendar;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// Calendar 클래스를 이용해서 D-DAY 계산기 만들기

		Scanner sc = new Scanner(System.in);

		System.out.println("### D-DAY 계산기 ###");
		System.out.print("D-Day [년도]입력 : ");
		int year = sc.nextInt();
		System.out.print("D-Day [월]입력 : ");
		int month = sc.nextInt();
		System.out.print("D-Day [일]입력 : ");
		int date = sc.nextInt();

		Calendar today = Calendar.getInstance();
		Calendar dday = Calendar.getInstance();
		dday.set(year, month - 1, date);

		System.out.println("오늘 날짜 : " + today.get(Calendar.YEAR) + "년 " + (today.get(Calendar.MONTH) + 1) + "월 "
				+ today.get(Calendar.DATE) + "일");

		System.out.println("D-day 날짜 : " + dday.get(Calendar.YEAR) + "년 " + (dday.get(Calendar.MONTH) + 1) + "월 "
				+ dday.get(Calendar.DATE) + "일");

		long day = (dday.getTimeInMillis() / 1000) - (today.getTimeInMillis() / 1000);
		day = day / 60 / 60 / 24;

		if (day > 0) {
			System.out.println(Math.abs(day) + "일 남았습니다."); // Math.abs -> 절대값으로 나타내주는 기능
		} else if (day < 0) {
			System.out.println(Math.abs(day) + "일 지났습니다."); // Math.abs -> 절대값으로 나타내주는 기능
		} else {
			System.out.println("D-day 입니다.");
		}

	}

}
