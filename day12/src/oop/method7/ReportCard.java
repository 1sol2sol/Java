package oop.method7;

public class ReportCard {
	//멤버변수 : 잠금처리(private)
	private String name;
	private int subject1, subject2;
	
	/*
	 * private int total = subject1 + subject2; private double average =
	 * (subject1+subject2)/2.0;
	 */
	
	//멤버 메소드
	//setter 메소드
	void setName(String name) {
		this.name = name;
	}
	
	void setSubject1(int subject1) {
		if(subject1>=0 && subject1<=100){
			this.subject1 = subject1;
		}
//		  if(subject1<0 || subject1 >100) {
//			  return; 
//			  } 
//		  this.subject1 = subject1;
	}
	
	void setSubject2(int subject2) {
		if(subject2>=0 && subject2<=100) {
			this.subject2 = subject2;
		}
	}
	
	
	//getter 메소드
	String getName() {
		return this.name;
	}
	int getSubject1() {
		return this.subject1;
	}
	int getSubject2() {
		return this.subject2;
	}
	
	//가상의 변수를 가정하고 getter 메소드를 설정하여 총점과 평균을 반환하도록 구현
	int getTotal() {
		return this.subject1 + this.subject2;
	}
	double getAverage() {
		return this.getTotal() / 2.0;
	}
	
	//setup
	void setup(String name, int subject1, int subject2) {
		this.setName(name);
		this.setSubject1(subject1);
		this.setSubject2(subject2);
	}
	
	//output
	void output() {
		System.out.println("이름: " + this.getName());
		System.out.println("1과목: " + this.getSubject1());
		System.out.println("2과목: " + this.getSubject2());
		
		//System.out.println(this.getName());
		//System.out.println(this.average());
	}
	
	
}
