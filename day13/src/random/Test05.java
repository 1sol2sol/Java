package random;
//class 안에 만들어지면 멤버변수
//method 안에 만들어지면 지역변수 

public class Test05 {
	
	//상수 : 고정되어있는데 변경도 불가능한 영구적인 값 
	//= 보편적으로 상수는 public static final을 사용하며, 이름은 대문자로 사용한다(일반벼수와 구분하기 위해서)
	public static final int SCISSORS = 0;
	public static final int ROCK = 1;
	public static final int PAPAER = 2;
	
public static void main(String[] args) { //정적메소드는 정적 변수와 사용 가능 
	
//	가위바위보 만들기
//	= 약속을 "상수"를 만들어서 해결
//	= 상수는 변하지 않는 상수
//  = 가독성을 증가시키는 효과 발생 

	int rsp = (int)(Math.random()*3);
	
	switch(rsp) {
	case SCISSORS:
		System.out.println("가위");
		break;
	case ROCK:
		System.out.println("바위");
		break;
	case PAPAER:
		System.out.println("보");
//		break
	}
}
}
