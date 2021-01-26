package collection1;

import java.util.ArrayList;

public class Test03 {
	public static void main(String[] args) {
		// List 사용 - 식당 예약 목록 관리 
		
		// ArrayList 객체 생성 
		ArrayList<String> list = new ArrayList<>();
		
		// 예약이 들어옴
		// -> 리스트에 데이터 추가 : .add(데이터)
		// -> 리스트의 가장 마지막 위치에 추가 
		list.add("최우식");
		list.add("수지");
		list.add("박소담");
	
		// 예약된 인원 확인 
		System.out.println("현재 예약 인원 수: " + list.size()); 
		
		// 예약된 사람의 목록 확인 1
		System.out.println("예약 고객 목록 1 : " + list); // 예약 고객 목록 1 : [최우식, 수지, 박소담]
		
		// 예약된 사람의 목록 확인 2
		System.out.println("예약 고객 목록 2 : ");
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 향샹된 for문
		for(String str : list) {
			System.out.println(str);
		}
//		예약 고객 목록 2 : 
//			최우식
//			수지
//			박소담
		
		// 최우식과 수지 사이에 제니가 긴급으로 예약 요청함 
		// -> 리스트에 데이터 삽입 : .add(index, 데이터)
		list.add(1, "제니");
		System.out.println(list); // [최우식, 제니, 수지, 박소담]
		
		// 수지가 예약자명을 공유로 변경
		// -> 리스트 내 데이터 수정 : .set(index,데이터)
		list.set(2, "공유");
		System.out.println(list); // [최우식, 제니, 공유, 박소담]
		
		// 고객에 예약이 잘 되어있는지 확인해달라고 함
		// -> 리스트 내 특정 데이터의 존재 여부 검사 : .contians(데이터)
		// -> 데이터가 있으면 true, 없으면 false 반환 
		System.out.println(list.contains("공유")); // true
		System.out.println(list.contains("소다")); // false
		
		// 고객이 몇번째로 예약되어 있는지 확인해달라고 함 
		// -> 리스트 내 특정 데이터에 대한 인덱스 값 확인 : .indexOf(데이터)
		// -> 데이터가 있으면 인덱스 값 반환, 데이터가 없으면 -1 반환 
		System.out.println(list.indexOf("공유")); // 2
		System.out.println(list.indexOf("소다")); // -1
		
		// 제니가 예약을 취소 
		// 리스트 내 특정 데이터를 삭제 : .remove(인덱스), .remove(데이터)
		// 제니가 1번 인덱스에 있음
		list.remove(1);
		System.out.println(list); // [최우식, 공유, 박소담]
		
		// 최우식이 예약 취소함 
		// -> 중복 데이터가 있을 경우 앞에 있는 데이터 하나만 삭제됨 
		list.remove("최우식");
		System.out.println(list); // [공유, 박소담]
		
		// 재고 부족으로 모든 예약 취소 함 
		// -> 리스트 내 모든 데이터 삭제 : .clear()
		list.clear();
		System.out.println(list); // []
		
		
		
		
		
	}
}
