package poly2.abst3;

public class Silver extends Member{
	
	public Silver() {}
	public Silver(String name, String rank, int point) {
		super(name, rank, point);
	}
	
	
	@Override
	public double interest() {
		double silverInterest = 0.02;
		return getPoint() * silverInterest;
	}

	
	

}
