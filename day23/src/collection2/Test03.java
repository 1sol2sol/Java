package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test03 {
	public static void main(String[] args) {
		// 리스트 내 객체 데이터 정렬 
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동",20));
		list.add(new Student("김길동",30));
		list.add(new Student("이길동",25));
		
		// 정렬
		// - Collections 클래스 사용
		// - 리스트에 객체를 저장할 겨웅 기본적인 방법으로는 정렬이 불가 
		// -> Collections의 sort 메소드각 정렬을 위한 기준을 찾을 수 없기 때문 
		// - 1. Comparable 인터페이스에 있는 compareTo 메소드를 오버라이딩해서 사용
		// - 2. Comparator 인터페이스에 있는 compare 메소드를 오버라이딩해서 사용
		
		// 1번째 방법
		Collections.sort(list); // 정렬 기준을 몰라서 오류 발생 - Student 클래스 내 compareTo 메소드 오버라이딩 후 정렬 가능 
		System.out.println(list); // [[이름:김길동/나이:30], [이름:이길동/나이:25], [이름:홍길동/나이:20]]
	
		Collections.reverse(list);
		System.out.println(list); // [[이름:홍길동/나이:20], [이름:이길동/나이:25], [이름:김길동/나이:30]]
	
		// 2번째 방법
		// - 여러 기준으로 정렬할 경우 
		
		// 인터페이스로는 객체를 생성할 수 없음 
		// -> 단, 객체 생성 시 추상 메소드에 대해 오버라이딩(재정의) 해줄 경우 생성 가능 
		
		// 학생 이름 기준 
		Comparator<Student> c1 = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(list, c1); // 정렬하면서 기준을 지정해 줌 
		System.out.println(list); // [[이름:김길동/나이:30], [이름:이길동/나이:25], [이름:홍길동/나이:20]]
		
		// 학생 나이 기준 	
		Comparator<Student> c2 = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge();
			}
		};

		Collections.sort(list, c2);
		System.out.println(list); // [[이름:홍길동/나이:20], [이름:이길동/나이:25], [이름:김길동/나이:30]]
		
	}
}
