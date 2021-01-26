package poly2.abst2;

public class Genesis extends Car{
	@Override
	public void engineStart() {
		System.out.println("휴대폰 앱으로 시동을 걸었습니다~ 부릉부릉~");
	}
	@Override
	public void gearChange() {
		System.out.println("제어판을 터치해서 기어를 변경했습니다~!");
	}
	@Override
	public void windowControl() {
		System.out.println("제어판을 터치해서 창문을 내립니다~ 끼익~ 끼이익~");
	}
}
