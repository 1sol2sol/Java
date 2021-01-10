package random;

public class Test06 {
	public static void main(String[] args) {
//		가위바위보 만들기
		int rsp = (int)(Math.random() * 3);
		
		switch(rsp) {
		case Game.SCISSORS:
			System.out.println("가위");
			break;
		case Game.ROCK:
			System.out.println("바위");
			break;
		case Game.PAPER:
			System.out.println("보");
//			break;
		}
		
	}
}