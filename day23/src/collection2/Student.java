package collection2;

//학생 클래스
public class Student implements Comparable<Student>{
//필드부
	private String name; // 학생 이름
	private int age; // 학생 나이

//생성자부
	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

//메소드부
	@Override
	public String toString() {
		return "[이름:" + name + "/나이:" + age + "]";
	}

	@Override
		public boolean equals(Object obj) {
			// 기존 Object 객체의 equals를 오버라이딩 하려면 매개변수 타입까지 동일해야함 
			// - 비교하는 두 객체가 같으면 true, 다르면 false를 반환 
		
			// 객체 주소가 같으면 true 반환 
			if(this == obj) {
				return true;
			}
			
			// 비교할 객체가 null이면 false를 반환 
			if(obj == null) {
				return false;
			}
			
			// 비교할 객체의 클래스 이름이 다르면 false 반환 
			if(getClass() != obj.getClass()) {
				return false;
			}
			
			// 현재 객체의 데이터와 비교할 객체의 데이터를 하나씩 모두 비교해서 다르면 false 리턴
			// - 객체 내부 데이터를 비교하기 위해 비교할 객체를 현재 클래스 타입으로 다운캐스팅 해야 함 
			Student other = (Student)obj;
			// name은 문자열(String)객체 이기 때문에 null인지 먼저 비교해야 함 
			if(this.name == null && other.name != null) {
				return false;
			}
			else if(!this.name.equals(other.name)){
				return false;
			}
			if(this.age != other.age) {
				return false;
			}
			// 위 검사 조건들에서 반환되지 않았으면 최종적으로 true 반환 
			return true;
		}
	
	@Override
	public int compareTo(Student o) {
		// sort에서 반환값이 1이면 데이터를 바꾸고, 0이나 -1이면 안바꿈 
		
		// 이름(문자열) 기준 
		 return this.name.compareTo(o.name);
		
		// 나이(정수, 실수, 단일문자) 기준
		// return this.age - o.age;
	}
	
	// getter/setter 메소드
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

	
}
