package poly2.abst3;

public class Vip extends Member {

	public Vip() {
	}

	public Vip(String name, String rank, int point) {
		super(name, rank, point);
	}

	@Override
	public double interest() {
		double vipInterest = 0.05;
		return getPoint() * vipInterest;
	}

}
