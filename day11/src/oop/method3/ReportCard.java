package oop.method3;

//성적표 = 이름+1과목+2과목
public class ReportCard {
	//멤버변수(인스턴스변수,멤버필드) 생성
	//=데이터 저장 
	String name;
	int subject1, subject2;
	
	//멤버 메소드
	//= 코드 저장
	
	//초기화 변수 생성
	void setup(String name, int subject1, int subject2) {
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
	}
	
	//출력 변수 생성
	void output() {
		System.out.print(this.name+"\t");
		System.out.print(this.subject1+"점"+"\t");
		System.out.print(this.subject2+"점"+"\t");
		System.out.println();
		
		int total = this.subject1 + this.subject2;
		double average = (double)(this.subject1+this.subject2)/2;
		boolean pass = this.subject1>=40&&this.subject2>=40&&average>=60;
		System.out.println("총점"+total+"점");
		System.out.println("평균"+average+"점");
		if (pass) {
			System.out.println("통과입니다!");
		}
		else {
			System.out.println("재시험 대상입니다!");
		}
		
	}
	
}
