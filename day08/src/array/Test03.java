/*<문제>
다음 데이터를 보관할 수 있는 배열을 만들고 저장 후 출력
-"자바", "파이썬", "안드로이드", "루비", "자바스크립트"
-10, 12, 13.5, 17, 20*/
package array;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		
	//	배열은 형태별로 기본값이 존재한다.
	//	= new 로 만든 데이터들은 초기값으로 자동 설정된다
	//	= 동적 할당된 데이터들은 초기값이 설정된다
	// 	= int는 초기값이 0이다
	//	= double은 초기값이 0.0이다
	//	= boolean은 초기값이 false이다
	//	= String과 같은 참조형들은 초기값이 null이다(null은 리모컨만 있고 대상이 없다는 뜻)
		
	//	String name [] = new String[5];
		String [] name = new String[5];
		name[0]="자바";
		name[1]="파이썬";
		name[2]="안드로이드";
		name[3]="루비";
		name[4]="자바스크립트";
		
		System.out.println(name[0]); //name의 시작점부터 +0 위치의 데이터
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
		
		double [] number = new double[5];
		number[0]=10;
		number[1]=12;
		number[2]=13.5;
		number[3]=17;
		number[4]=20;
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		
		
	}

}
