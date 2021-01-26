package collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 문제 : 싱어게인 투표 프로그램(Map으로 구현)
		// - 사용자에게 투표할 가수 입력받기
		// - 처음 투표하는 가수는 Map에 추가하고 카운트 1
		// - 기존에 투표되어 있는 가수는 기존 카운트 +1
		// - exit를 입력받으면 전체 투표득수를 출력하고 프로그램 종료

		// 가수(key), 카운트(value)

		Map<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("[싱어게인 투표하기]");

		while (true) {
			System.out.print("투표할 가수 번호를 입력하세요(종료 exit) : ");
			String name = sc.next();
			if (name.equals("exit")) {
				System.out.println("종료합니다");
				break;
			}
			if (!map.containsKey(name)) {// Map에 가수 이름이 없을 때
				map.put(name, 1);
			} else { // Map에 가수 이름이 있을 때
				// map.get(name) : 이름에 해당하는 카운트를 가져옴 
				// +1 : 기존 카운트에 1을 더해줌
				map.put(name, map.get(name) + 1);
			}

			System.out.println("## 현재 득표 수 ##");

			for (Map.Entry<String, Integer> e : map.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}

		}

	}

}
