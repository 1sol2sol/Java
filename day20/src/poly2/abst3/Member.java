package poly2.abst3;

public abstract class Member {
	//필드
	private String name;
	private String rank;
	private int point;
	
	//생성자
	public Member() {}
	public Member(String name, String rank, int point) {
		this.setName(name);
		this.setRank(rank);
		this.setPoint(point);
	}
	
	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//추상화 메소드 
	public abstract double interest();
	
	@Override
	public String toString() {
		return name + "\t" + rank + "\t" + point + "\t" + interest() ;
	}
}
