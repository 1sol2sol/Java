package inherit.exam02;
// 검사 - 자식 클래스 
public class BladeMaster extends Character {
	public BladeMaster() {}
	public BladeMaster(String name, String job) {
		super(name, job, 1, 50, 100, 1500, 1000);
	}
	@Override
	public void attack() {
		System.out.println("검 공격~!!");
	}
}
