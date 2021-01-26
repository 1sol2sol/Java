package collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test01 {

	public static void main(String[] args) {
		// 컬렉션 
		// - 어떤 데이터를 어떻게 사용할지에 따라 다양한 컬렉션을 선택해서 사용 가능 
		
		// - 식당 예약 목록
		// List : 순서를 유지하고 저장, 중복 저장 가능  
		// List 종류 : ArrayList, Vector, LinkedList
		
		// 리스트 객체 생성 
		ArrayList<String> list = new ArrayList<String>(); // new ArrayList<>();
		// 참조변수 생성 시 제네릭 타입 지정해줬으면 객체 생성시에는 생략 가능 
		// -> 리스트에서 어떤 데이터를 사용할지, 제네릭을 이용해서 지정 
		// -> 리스트의 크기를 어느정도로 만들지, 컬렌션은 초기 크기가 의미가 없음 
		
		// 데이터 추가 : 참조변수.add(데이터)
		list.add("최우식");
		list.add("수지");
		list.add("박소담");
		list.add("제니");
		list.add("최우식");
		list.add("공유");
		
		// 데이터 개수 확인 : 참조변수.size()
		System.out.println(list.size());
		// 전체 데이터 출력 
		System.out.println(list);
		
		// 나라 이름 목록
		// Set : 순서를 유지하지 않고 저장, 중복 저장 불가능
		// Set 종류 : HashSet, TreeSet, LinkedHashSet
		
		HashSet<String> set = new HashSet<>(); // new HashSet<String>(); 생략가능 
		// 참조변수 생성 시 제네릭 타입 지정해줬으면 객체 생성시에는 생략 가능 
		
		set.add("한국");
		set.add("미국");
		set.add("영국");
		set.add("한국");
		set.add("러시아");
		
		// 데이터 개수 확인 : .size()
		System.out.println(set.size());
		
		// 전체 데이터 출력 
		System.out.println(set);
		
		// 도서 목록 
		// Map : key(도서번호)와 value(도서명)의 쌍으로 저장, key는 중복 불가능, key는 Set 방식/Value는 List 방식으로 저장됨
		// Map 종류 : HashMap, Hashtable, TreeMap, Properties
		
		HashMap<Integer,String> map = new HashMap<>();
		// Map<k,v> : K는 key에 대한 타입, V는 value에 대한 타입
		// 제네릭은 객체타입만 가능 -> 기본 자료형을 사용할 경우 Wrapper 클래스를 사용해야 함 
		
		// 데이터 추가 : /.put(key, value)
		map.put(1000, "자바의 정석");
		map.put(1001, "오라클 일주일 정복기");
		map.put(3001, "그 사람이 사는 법");
		map.put(2001, "참 쉬운 HTML");
		map.put(1002, "자바의 정석"); // key는 다르고 value는 중복되는 데이터 : O
		map.put(2001, "참 쉬운 CSS"); // key는 중복되고 value는 다른 데이터  : X
		
		// 데이터 개수 : .size()
		System.out.println(map.size());
		
		// 전체 데이터 출력 
		System.out.println(map);
	}

}
