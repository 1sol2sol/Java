package random;

//상수를 보관하기 위한 클래스
public class Game {
	public static final int SCISSORS = 0;
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	
	//"가위", "바위", "보" 중에서 하나를 생성하기 위한 메소드 - 이용할 때 편리하도록 관련코드를 내부에 감춤(캡슐화)
	public static String generate() {
		int choice = (int)(Math.random() * 3);
		switch(choice) {
		case SCISSORS : return "가위";
		case ROCK : return "바위";
		case PAPER : return "보";
		default : return null;
		}
	}
}
