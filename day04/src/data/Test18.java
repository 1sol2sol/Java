package data;
import java.lang.*;
public class Test18 {
	public static void main(String[] args) {
		//논리 OR 연산
		//목표 : 지하철 무임승차 대상자 판정
		//-65세 이상
		//-6세 미만
		
		//준비
		int age = 69;
		
		//계산
		//boolean free = 나이 65세 이상 또는 나이 6세 미만;
		boolean free = age >= 65 || age < 6;
		
		//출력
		System.out.println(free);
		
		
		
	}
}
