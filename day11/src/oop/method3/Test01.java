package oop.method3;

public class Test01 {
public static void main(String[] args) {
	//객체 생성
	ReportCard a = new ReportCard();
	ReportCard b = new ReportCard();
	ReportCard c = new ReportCard();
	
	//생성 초기화 
	a.setup("피카츄", 50, 70);
	b.setup("꼬부기", 60, 59);
	c.setup("파이리", 35, 100);
	
	//출력 
	
	a.output();
	b.output();
	c.output();
	
}
}
