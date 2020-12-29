package condition2;
/*
 switch~case 구문
 - 조건문의 한 종류
 - 논리가 아니라 값을 기준으로 구분
 */
import java.lang.*;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		//사용자게에 입력을 받아 가위바위보를 출력
		//= if구문의 단점은 순차적으로 검사하기 때문에 아래에 있는 검사구문일수록 느려진다는것이다.
		//= 구문마다 미세하지만 속도차이가 발생하게 된다.
		//= 미세하게라도 속도차이가 나면 안되는 상황에서는 사용하기 어렵다.
		//= 가장 대표적으로 마우스, 키보드 검사가 이곳에 해당된다.
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("1.가위 / 2.바위 / 3.보 :");
		int choice = sc.nextInt();
		sc.close();
		
		//출력
		switch(choice) {
		case 1:
			System.out.println("가위");
			break;//탈출
		case 2:
			System.out.println("바위");
			break;//탈출
		//case 3:
			default:
			System.out.println("보");
			break;//탈출
		} 
		//같은 책에 책갈피로 구분만 된 형태
		//= 한번에 찾을수 있지만 끝까지 읽어야한다
		//= 책갈피는 시작지점을 의미하지 끝을 의미하는것은 아니다
	}
}
