package oop.method7;

public class Test01 {
public static void main(String[] args) {
	//객체 생성
	ReportCard a = new ReportCard();
	ReportCard b = new ReportCard();
	ReportCard c = new ReportCard();
	
	a.setup("피카츄", 50, 70);
	b.setup("꼬부기", 60, 59);
	c.setup("파이리", 35, 100);
	
	a.output();
	b.output();
	c.output();
	
	//피카츄 vs 파이리 평균비교
	//피카츄의 평균 = (a.getFirst() + a.getSecond()) / 2.0 = a.getTotal() / 2.0 = a.getAverage()
	//파이리의 평균 = (b.getFirst() + b.getSecond()) / 2.0 = b.getTotal() / 2.0 = b.getAverage()
	//if((a.getFirst() + a.getSecond()) / 2.0 > (b.getFirst() + b.getSecond()) / 2.0) {
	if(a.getAverage() > b.getAverage()) {
		System.out.println("피카츄가 더 잘하네요");
	}
	else if(a.getAverage() < b.getAverage()) {
		System.out.println("파이리가 더 잘하네요");
	}
	else {
		System.out.println("거기서 거기네요");
	}
	
}
}
