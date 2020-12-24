package data;
import java.lang.*;
public class Test12 {
	public static void main(String[] args) {
//		정수와 실수의 크기 서열 정리 
//		- 작은 자료형에서 큰 자료형으로는 데이터 이동에 문제가 없으나
//		- 큰 자료형에서 작은 자료형으로는 데이터 이동에 문제가 발생할 수 있다(금지)
//		- 이 두가지를 교대로 사용해보면 자료형의 크기 서열을 정리할 수 있다. 
		
		//int와 long의 크기 비교 
		int a = 10;
		long b = a;//문제없음(작은자료형에서 큰자료형으로 이동)-자동형변환(묵시적 형변환)
		System.out.println(b);
		
		
//		> long이 int보다 크다는 증거 
		long c = 10L;
//		int d = c; //문제발생(큰자료형에서 작은자료형으로 이동. 넘침(overflow)발생}
		int d = (int)c; //강제형변환(명시적 형변환)
		System.out.println(d);
		
//		long과 float를 비교 
//		float > long
		
		long e = 10L;
		float f = e;//자동변환 ok
		System.out.println(f);
		
		float g = 1.234f;
//		long h = g;//자동변환 불가
		long h = (long)g; //g를 long 형태로 강제변환한 뒤 h에 대입하세요
		
		System.out.println(h);
	}
}
