package data;
import java.lang.*;
public class Test16 {
	public static void main(String[] args) {
		// 목표 : 나이가 주어졌을때 이 나이가 "청소년"에 해당하는지 검사 
		//-중학교 1학년(14살)부터 고등학교 3학년(19살) 사이면 청소년이라고 보겠다 
		
		//준비
		int age = 25;
		
		//계산
		//boolean teen = age가 14이상 19이하 , 14이상 20미만;
		//boolean teen = 14 <= age <= 19; 는 불가하다 //계산기호가 2개라서 나눠서 계산해야한다 
		boolean upper = 14 <= age;
		boolean lower = age <= 19;
		
		//AND 연산 청소년 = upper && lower
		boolean teen = upper && lower;
		
		// 위의 식 또는 변수를 설정하지 않고 boolean teen = 14 <= age&&age <= 19;
		
		//결과 
		System.out.println(upper);
		System.out.println(lower);
	}
}
