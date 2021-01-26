package collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		// ArrayList 객체 데이터 사용

		List<Student> list = new ArrayList<>();

		// 리스트에 객체 추가 : .add(객체)
		list.add(new Student("홍길동", 20));
		list.add(new Student("몽룡이", 30));
		list.add(new Student("춘향이", 25));

		// 리스트 내 데이터 개수 확인 : .size()
		System.out.println(list.size());

		// 리스트 내 전체 데이터 출력
		System.out.println(list); // [[이름:홍길동/나이:20], [이름:몽룡이/나이:30], [이름:춘향이/나이:25]]

		// 리스트 내 객체 사용 : .get(index)
		System.out.println(list.get(0)); // [이름:홍길동/나이:20]
		System.out.println(list.get(1)); // [이름:몽룡이/나이:30]

		// 리스트 내 객체의 멤버 사용 : .get(index).멤버
		System.out.println(list.get(0).getName()); // 홍길동
		System.out.println(list.get(0).getAge()); // 20

		// 반복문 사용
		for (int i = 0; i < list.size(); i++) {
			System.out.println("이름은 " + list.get(i).getName() + "이고, 나이는 " + list.get(i).getAge() + "살 입니다.");
		}

		// 리스트 객체 삽입 : .add(인덱스,객체)
		list.add(2,new Student("향단이", 23));
		System.out.println(list);
		// [[이름:홍길동/나이:20], [이름:몽룡이/나이:30], [이름:향단이/나이:23], [이름:춘향이/나이:25]]
		
		// 리스트 내 객체의 데이터 수정
		list.get(1).setAge(28);
		System.out.println(list);
		// 리스트 객체 수정 : .set(인덱스,객체)
		// - 리스트 내 객체 자체가 변경됨
		list.set(1, new Student("사또",30));
		System.out.println(list);
		// [[이름:홍길동/나이:20], [이름:사또/나이:30], [이름:향단이/나이:23], [이름:춘향이/나이:25]]
		
		// 리스트 객체 삭제 : .remove(인덱스), .remove(객체)
		list.remove(2);
		System.out.println(list); // [[이름:홍길동/나이:20], [이름:사또/나이:30], [이름:춘향이/나이:25]]
		
		// - remove(객체)로 삭제 : 그냥은 삭제가 안됨 
		// --> 삭제할 데이터를 리스트에서 찾을 때 객체의 식별값을 이용해서 비교함
		// --> new 연산자로 객체를 새소 생성하기 때문에 객체의 식별값이 같을 수 없음
		list.remove(new Student("사또", 30));
		System.out.println(list); // [[이름:홍길동/나이:20], [이름:사또/나이:30], [이름:춘향이/나이:25]]
		
		// 모든 데이터 삭제 : .clear()
		list.clear();
		System.out.println(list); // []

	}

}


