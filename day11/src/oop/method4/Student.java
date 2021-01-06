package oop.method4;

public class Student {
	String name;
	int age;
	
	void setup(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	void output() {
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
	}
	
	//메소드의 다양성을 추구한다
	//= 하나의 데이터만 설정할수있도록 하면 어떨까?
	//= 변수마다 한 개씩 생성
	//= Setter 메소드라고 부른다 (차단기 역할을 수행할 수 있다)
	//= set + 변수명으로 작명한다
	void setName(String name) {
		this.name=name;
	}
	
	void setAge(int age) {
		if(age>0) {
			this.age=age;
		}
	}
}
