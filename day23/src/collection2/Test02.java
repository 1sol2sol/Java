package collection2;

import java.util.LinkedList;

public class Test02 {

	public static void main(String[] args) {
		// 리스트 내 특정 객체 삭제 
		
		// LinkedList 객체 생성
		LinkedList <Student> list = new LinkedList<>();
		
		list.add(new Student("홍길동",20));
		list.add(new Student("김길동",30));
		list.add(new Student("이길동",25));
		
		System.out.println(list); // [[이름:홍길동/나이:20], [이름:김길동/나이:30], [이름:이길동/나이:25]]
		
		// 리스트 내 데이터로 찾아서 삭제
		// - 이름이 홍길동인 객체 삭제 : 동일한 이름의 객체가 있는 인덱스를 찾은 후 삭제 
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals("홍길동")) { // 리스트안에 name이 홍길동일때
				list.remove(i);
				break;
			}
		}
		System.out.println(list); // [[이름:김길동/나이:30], [이름:이길동/나이:25]]
		
		// 리스트 내 특정 객체 삭제 : .remove(객체)
		// - 객체 내부 데이터는 동일하지만 new로 생성되었기 때문에 전혀 다른 객체로 인식함 
		// - 같은 객체인지를 데이터로 구분할 수 있도록 Student 클래스 내에서 equals 메소드를 오버라이딩 해 줘야 함.
		Student s = new Student("김길동",30);
		list.remove(s);
		System.out.println(list); // [[이름:이길동/나이:25]]
	}

}
