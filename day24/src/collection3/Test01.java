package collection3;

import java.util.HashSet;
import java.util.Iterator;

public class Test01 {
	public static void main(String[] args) {
		// HashSet 사용

		// HashSet 객체 생성
		HashSet<Integer> hset = new HashSet();

		// set에 데이터 추가
		hset.add(10);
		hset.add(5);
		hset.add(20);
		hset.add(15);
		System.out.println(hset); // [20, 5, 10, 15]

		// 중복요소 저장 -> 중복 저장 불가
		hset.add(10);
		System.out.println(hset); // [20, 5, 10, 15]

		// 순서가 없기 때문에 삽입도 없음

		// Set의 데이터 확인
		// - Set은 List와 달리 .get() 사용 불가능
		// -> 이유 ? 인덱스가 없어서
		// 방법 1. 확장 반복문 사용
		// 방법 2. Iterator를 이용해서 데이터 사용

		// 방법 1. 확장 반복문(향상된 for문) 사용
		for (int num : hset) {
			System.out.println("향상된 for문 출력 : " + num);
		}
//			향상된 for문 출력 : 20
//			향상된 for문 출력 : 5
//			향상된 for문 출력 : 10
//			향상된 for문 출력 : 15

		// 방법2. Iterator 이용해서 데이터 사용
		// - Iterator : 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자
		// - .hasNext() : 앞에서부터 객체가 있는지 검사 - 있으면 true, 없으면 false 반환
		// - .next() : 앞에서부터 하나씩 객체 가져오기
		Iterator<Integer> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println("Iterator 출력 : " + it.next());
		}
//			Iterator 출력 : 20
//			Iterator 출력 : 5
//			Iterator 출력 : 10
//			Iterator 출력 : 15
		
		// Set 데이터 삭제 
		hset.remove(5);
		System.out.println(hset); // [20, 10, 15]
		
		// Set 데이터 초기화 
		hset.clear();
		System.out.println(hset); // []
		
		
	}
}
