package inherit.exam02;
//부모클래스
public class Character {
	//필드
	private String name; //이름
	private int level; //레벨
	private String job; //직업
	private int str; //공격력
	private int def;//방어력
	private int hp;//체력
	private int mp;//마나
	
	//생성자
	public Character() {}
	public Character(String name, String job, int level, int str, int def, int hp, int mp) {
		this.name = name;
		this.job = job;
		this.level = level;
		this.str = str;
		this.def = def;
		this.hp = hp;
		this.mp = mp;
	}
	//메소드
	public void attack() {
		System.out.println("공격합니다!");
	}
	public void defense() {
		System.out.println("방어합니다!");
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 직업:" + job + " , 레벨: " + level + ", 공격력: " + str + 
				", 방어력:" + def + ", 체력:" + hp + ", 마나:" + mp ;
	}
}