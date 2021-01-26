package inherit.exam02;
//마법사 - 자식 클래스
public class Wizard extends Character{
	//필드
	
	//생성자
	public Wizard() {}
	public Wizard(String name, String job) {
		super(name, job, 1, 100, 50, 1000, 1500);
	}
	
	@Override
	public void attack() {
		System.out.println("마법 공격~!!");
	}
}
