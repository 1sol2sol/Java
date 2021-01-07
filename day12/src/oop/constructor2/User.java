package oop.constructor2;

public class User {
	private String id ,job;
	private int level, money;
	
	//생성자
	public User(String id, String job){
		this.setId(id);
		this.setJob(job);
		this.setLevel(1);
		this.setMoney(0);
	}
	
	public User(String id, String job, int level, int money){
		this.setId(id);
		this.setJob(job);
		this.setLevel(level);
		this.setMoney(money);
	}
	
	//setter
	public void setId(String id) {
		this.id = id;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setLevel(int level) {
		if(level<1) {
			return;
		}
		this.level = level;
	}
	public void setMoney(int money) {
		if(money<0) {
			return;
		}
		this.money = money;
	}
	
	//getter
	public String getId() {
		return this.id;
	}
	public String getJob() {
		return this.job;
	}
	public int getLevel() {
		return this.level;
	}
	public int getMoney() {
		return this.money;
	}
	
	public void output() {
		System.out.println("아이디: " + this.getId());
		System.out.println("직업: " + this.getJob());
		System.out.println("레벨: " + this.getLevel());
		System.out.println("소지금: " + this.getMoney());
	}
}
