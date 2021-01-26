package collection1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 문제 : 사용자에게 할일 목록을 입력받아서 저장
		// 입력을 모두 받았으면 개수와 목록을 출력

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		while (true) {
			System.out.print("할일 목록을 입력하세요(종료는 9) : ");
			String str = sc.nextLine();
			if (str.equals("9")) {
				break;
			}
			list.add(str);
		}
		System.out.println("[할일 개수] -> 총 " + list.size());
//		System.out.println("[할일 목록] -> " + list); // [할일 목록] -> [책읽기, 티비보기, 잠자기]
//		
//		// 리스트 내 데이터 확인 : .get(index)
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		System.out.println("[할일 목록]");
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(i+1 + " : " + list.get(i));
//		}
		
		// 향상된 for문
		// for(데이터타입 임시변수명 : 배열){}
		// 배열 내 데이터를 위에서부터 하나씩 빼서 변수에 저장 -> 모든 데이터를 사용하고 나면 반복문 종료 
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}
