/*<문제>
사용자의 정보를 이용하여 BMI를 계산하는 프로그램을 만드려고 합니다.
사용자의 키(cm)와 체중정보(kg)를 이용하여 계산을 하며, 공식은 다음과 같습니다
BMI = 체중(kg)/키(m) * 키(m)
- 키 180cm, 체중이 80kg인 사람의 BMI를 계산하여 출력(나이는 신경쓰지마세요)*/

package data;
import java.lang.*;
public class Test13 {

	public static void main(String[] args) {
		//변수선언
		int height = 180; 
		double heightM = height / 100.0;
//		double heightM = (double)height / 100; 두가지도 가능하다 
//		double heightM = height / (double)100;
		int weight = 80;  
		
		//계산
		double bmi = (weight / (heightM * heightM));
//		double bmi = wight / heightM / heightM;  이것 또한 올바른식이다 
		
		//출력
		System.out.println("BMI 지수: " + bmi);
	
	}
}
