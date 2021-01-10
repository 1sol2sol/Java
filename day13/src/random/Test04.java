package random;

public class Test04 {
public static void main(String[] args) {
	
//	가위바위보 만들기
//	= 가위,바위,보 라는 문자열을 추첨할 수는 없고 정수를 추첨해서 바꾸는 형태로 구현
//	= 약속이 필요(0=가위, 1=바위, 2=보)
	
	int rsp = (int)(Math.random()*3);
	
	switch(rsp) {
	case 0:
		System.out.println("가위");
		break;
	case 1:
		System.out.println("바위");
		break;
	case 2:
		System.out.println("보");
//		break
	}
}
}
