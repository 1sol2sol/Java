package generic1;

public class Test01 {

	public static void main(String[] args) {
		// Generic 
		
		Calc c = new Calc();
		
		System.out.println(c.<Integer>div(100, 20)); // 제네릭 사용법
		
		System.out.println(c.div(10, 20));	// 인자값을 보고 데이터 타입을 알 수 있는 경우 생략 가능 
		System.out.println(c.div(1.5, 2.5));
		System.out.println(c.div('e', 'a'));
		System.out.println(c.div("Hello", "He"));
		
	}

}
