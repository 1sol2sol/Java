package oop.method6;

public class Test01 {
	public static void main(String[] args) {
		Student a = new Student();

		// 지금은 변수에 초기화를 해도 되고, 세터 메소드를 이용해도 된다
		// = 무엇을 이용할지를 선택할 수 있다.
		// = 변수를 잠금(private)처리하고 메소도를 이용하도록 강제
		// = 설정은 setter 메소도를 사용
		// = 확인/반환은 getter 메소드를 사용 
		
		//	a.name = "뽀로로";
		//	a.score = 77;
		//a.setName("뽀로로");
		//a.setScore(77);
		a.setup("뽀로로",77);
		

		//System.out.println(a.name);
		//System.out.println(a.score);
		//System.out.println(a.getName());
		//System.out.println(a.getScore());
		
		a.output();
	}
}
