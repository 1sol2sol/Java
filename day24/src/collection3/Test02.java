package collection3;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
		// HashMap
		
		// HashMap 객체 생성 
		HashMap <String,String>map = new HashMap<>();
		
		// Map에 데이터 추가 : .put(키,값)
		map.put("홍길동", "010-1111-1111");
		map.put("김길동", "010-2222-2222");
		map.put("이길동", "010-4444-4444");
		map.put("박길동", "010-3333-3333");
		System.out.println(map);
		// {박길동=010-3333-3333, 김길동=010-2222-2222, 홍길동=010-1111-1111, 이길동=010-4444-4444}
		
		// 중복된 키의 데이터를 추가 : 중복되는 키 사용 불가능(추가되는게 아니라 해당 키의 값이 변경됨)
		map.put("이길동", "010-5555-5555");
		System.out.println(map);
		// {박길동=010-3333-3333, 김길동=010-2222-2222, 홍길동=010-1111-1111, 이길동=010-5555-5555}
		
		// 중복된 값의 데이터를 추가 : 중복된 값 추가 가능 
		map.put("최길동", "010-1111-1111");
		System.out.println(map); 
		// {박길동=010-3333-3333, 김길동=010-2222-2222, 홍길동=010-1111-1111, 최길동=010-1111-1111, 이길동=010-5555-5555}
		
		// Map에 있는 데이터 사용 (키를 이용해서 데이터 사용) : .get(키)
		System.out.println(map.get("김길동")); // 010-2222-2222
		System.out.println(map.get("박길동")); // 010-3333-3333
		
		// 향상된 for문 사용 
		for(Map.Entry<String, String> e: map.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
//				박길동 : 010-3333-3333
//				김길동 : 010-2222-2222
//				홍길동 : 010-1111-1111
//				최길동 : 010-1111-1111
//				이길동 : 010-5555-5555
		
		// 전체 키를 Set 형태로 반환 : .keySet()
		System.out.println(map.keySet()); // [박길동, 김길동, 홍길동, 최길동, 이길동]
		
		// 전체 값을 Collection 형태로 반환 : .values()
		System.out.println(map.values()); // [010-3333-3333, 010-2222-2222, 010-1111-1111, 010-1111-1111, 010-5555-5555]

		// Map 데이터 삭제 : .remove(키)
		map.remove("최길동");
		System.out.println(map); // {박길동=010-3333-3333, 김길동=010-2222-2222, 홍길동=010-1111-1111, 이길동=010-5555-5555}
		
		// Map 전체 데이터 초기화 : .clear()
		map.clear();
		System.out.println(map); // {}
	}
}
