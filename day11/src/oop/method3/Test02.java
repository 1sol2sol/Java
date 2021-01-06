package oop.method3;

public class Test02 {
public static void main(String[] args) {
	//배열로 처리 
	ReportCard[]data = new ReportCard[3];
	
	data[0]= new ReportCard();
	data[1]= new ReportCard();
	data[2]= new ReportCard();
	
	data[0].setup("피카츄", 50, 70);
	data[1].setup("꼬부기", 60, 59);
	data[2].setup("파이리", 35, 100);
	
	data[0].output();
	data[1].output();
	data[2].output();
	
}
}
