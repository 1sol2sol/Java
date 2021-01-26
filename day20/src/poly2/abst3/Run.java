package poly2.abst3;

public class Run {
	public static void main(String[] args) {
		Member[] m = new Member[6];

		m[0] = new Silver("홍길동", "실버", 1000);
		m[1] = new Silver("김말똥", "실버", 2000);
		m[2] = new Silver("똥똥이", "실버", 3000);
		m[3] = new Gold("김부장", "골드", 1000);
		m[4] = new Gold("박부장", "골드", 2000);
		m[5] = new Vip("홍사장", "Vip", 1000);

		System.out.println("이름\t등급\t포인트\t이자포인트");
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}

	}

}
