package com.kh.practice.student.model.vo;

public class Student {
	//필드
	private String name; //이름
	private String subject; //과목
	private int score; //점수
	
	//생성자
	public Student() {} //디폴트 생성자 
	public Student(String name, String subject, int score) {
		this.setName(name);
		this.setSubject(subject);
		this.setScore(score);
	}
	//메소드
	
	//setter(외부에서 객체안에 있는 각각 필드의 값을 저장 할 수있는 메소드)
	public void setName(String name) {
		this.name = name; // 객체안의 name에 매개변수로 받은 name을 넣어주세요 
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//getter (외부에서 객체안에 있는 각각 필드의 값을 꺼내쓸수있는 메소드)
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	//일반메소드
	public String inform() {
		return "이름 : " + name + "/ 과목 : " + subject + "/ 점수 : " + score ;
	}
	
	
	
	
}
