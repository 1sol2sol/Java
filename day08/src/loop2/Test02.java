package loop2;

import java.util.Scanner;

//import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		//while문의 주 용도는 "특정 시점까지의 반복"이다.
		
		//목표 : 사용자가 0을 입력할때까지 숫자를 입력받는 프로그램
		
		Scanner sc = new Scanner(System.in);
		while(true) {//조건이 ture이므로 "영원히 실행"되는 반복문
			System.out.println("숫자를 입력하세요(0을 입력하시면 종료)");
			int user = sc.nextInt();
			if(user==0) {
				break;
			}
			
			System.out.println("입력한 숫자는 " + user + "입니다");
		}
		
			sc.close();
			
			System.out.println("종료되었습니다");
		
	}

}
