package poly2.abst3;

public class Gold extends Member {

	public Gold() {
	}

	public Gold(String name, String rank, int point) {
		super(name, rank, point);
	}

	@Override
	public double interest() {
		double goldInterest = 0.03;
		return getPoint() * goldInterest;
	}

}
