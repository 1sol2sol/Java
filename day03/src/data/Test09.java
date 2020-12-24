package data;
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		//int를 제외한 다른 유형의 정수들(byte, short, long)
		
		//byte : 1byte (-128~127까지 256개의 범위)
		//용도 : 물리적인 파일을 다룰 때 또는 통신에 사용(숫자 연산에는 사용하지 않음)
		byte a = 127;
		System.out.println(a);
		
		//short : 2byte(-32768 ~32767까지 65536개의 범위를 가진다. 256*256)
		//용도 : 구버전 자바 프로그램과의 호환을 위한 자료형(16bit 시대와의 연결고리)
		short b = 30000;
		System.out.println(b);
		
		//int 기본형 : 4byte 기본형 정수 자료형
		
		//long : 8byte 확장형 정수 자료형
		long c = 100; // int--->long : 자동형태변환->자동형변환->묵시적 형변환(권장하지 않음)
		System.out.println(c);
		
		long d = 100L;
		System.out.println(d);
		
		//주의사항 : byte, short는 일반 계산용이 아니다. 
		//int보다 작은 형태들은 계산결과가 int로 나온다(기본형태로 나옴) long 빼고는 계산하면 전부 int로 인식
		byte a1 = 10;
		byte a2 = 20;
		//byte a3 = a1 + a2; error가 난다 ! 
		
		
	}

}
