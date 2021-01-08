package oop.modifier9;

public class Test01 {
/**
 * 메인 메소드 분석
 * - 접근제한 : public (public 적지 않으면 package로 자동인식으로 실행안됨)
 * - 정적 메소드(고정)
 * - 반환형 : void
 * - 이름 : main
 * - 매개변수 : String 배열
 * = JVM이 실행할 수 있도록 공개 및 객체와 상관없이 고정해두고 결과는 반환하지 않으며,
 *   실행시 문자열 여러개를 넣어서 실행할 수 있는 main이란 이름의 메소드
 */
public static void main(String[] args) {
	//static 변수도 고정되어 있으므로 객체 없이 접근하여 출력 및 변경이 가능 
	//System.out.println(IPhone.company);
	System.out.println(IPhone.getCompany());
	}
}
