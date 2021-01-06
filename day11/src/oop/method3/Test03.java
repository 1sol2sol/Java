package oop.method3;

public class Test03 {
public static void main(String[] args) {
	//배열로 처리 
	ReportCard[]data = new ReportCard[3];
	
	for(int i =0; i<data.length; i++) {
		data[i]=new ReportCard();
	}
	
	data[0].setup("피카츄", 50, 70);
	data[1].setup("꼬부기", 60, 59);
	data[2].setup("파이리", 35, 100);
	
	for(int i=0; i<data.length; i++) {
		data[i].output();
	}
	
}
}
