package generic1;

public class Calc{
//	// 기존 방법으로 작성 - 제네릭 미사용
//	public double div(int num1, int num2) {
//		return (double)num1/num2;
//	}
//	
//	public double div(double num1, double num2) {
//		return num1/num2;
//	}
	
	// 제네릭 사용 
	public <T> double div(T num1, T num2) {
		double result = 0;
		try {
		double dNum1 = Double.parseDouble(num1.toString());
		double dNum2 = Double.parseDouble(num2.toString());
		return dNum1/dNum2;
		} catch(NumberFormatException e) {
			System.out.println("정수/실수만 연산 가능");
		}
		return result;
	}
}
