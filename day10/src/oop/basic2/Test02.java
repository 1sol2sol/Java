package oop.basic2;

/*class Player{
	String name, sports;
	int gold, silver, bronze;
}	*/ //클래스를 같은 파일안에 만들수도 있지만 public을 붙일 수 없다 자바는 클래스 이름과 같은것을 대표라고 생각함

public class Test02 {
	public static void main(String[] args) {
		//객체 생성 
		Player a = new Player();
		Player b = new Player();
		Player c = new Player();
		
		// 생성 초기화 
		a.name = "김연아";
		a.sports = "피겨스케이팅";
		a.gold = 2;
		a.silver = 0;
		a.bronze = 1;
		
		b.name = "이상화";
		b.sports = "스피드스케이팅";
		b.gold = 1;
		b.silver = 2;
		b.bronze = 1;
		
		c.name = "윤성빈";
		c.sports = "스켈레톤";
		c.gold = 1;
		c.silver = 0;
		c.bronze = 1;
		
		//출력
		System.out.print(a.name +"\t");
		System.out.print(a.sports+"\t");
		System.out.print(a.gold+"\t");
		System.out.print(a.silver+"\t");
		System.out.print(a.bronze+"\t");
		System.out.println();
		
		System.out.print(b.name +"\t");
		System.out.print(b.sports+"\t");
		System.out.print(b.gold+"\t");
		System.out.print(b.silver+"\t");
		System.out.print(b.bronze+"\t");
		System.out.println();
		
		System.out.print(c.name +"\t");
		System.out.print(c.sports+"\t");
		System.out.print(c.gold+"\t");
		System.out.print(c.silver+"\t");
		System.out.print(c.bronze+"\t");
		System.out.println();
	}
}
