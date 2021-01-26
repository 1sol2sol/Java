package file2;

import java.io.Serializable;

// 직렬화를 위해서 Serializable 인터페이스를 구현해야함(안하면 직렬화시 오류 발생)
public class Student implements Serializable{

	// 필드
		// 직렬화시에 사용되는 객체의 고유번호(직렬화 인터페이스 구현 시 안쓰면 경고 발생)
		// -> 선언 안해도 JVM이 임의의 번호를 붙여서 생성해주지만 직접 선언하는것을 권장 
	private static final long serialVersionUID = -8537976814854110730L;
	private String name;
	private int age;
		// 직렬화에서 제외하고 싶은 필드의 경우 transient 키워드를 붙여줌
	private transient String tel;
	
// 생성자
	public Student() {}
	public Student(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}
// 메소드
	
	// getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 전화번호 : " + tel ;
	}
	
	
}
