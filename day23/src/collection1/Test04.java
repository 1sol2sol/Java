package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		// 문제 : 로또 번호 생성기
		// 1~45 사이의 랜덤한 번호 6개를 추출해서 List에 저장 - Random 클래스
		// 중복되는 값은 저장되면 안됨

		List<Integer> lotto = new ArrayList<>();

		// 방법 1
//		for (int i = 0; i < 6; i++) {
//			// 랜덤 값 추출
//			// -> int number = (int)(Math.random() * 45) + 1;
//			// -> int num = new Random().nextInt(45) + 1;
//			int num = new Random().nextInt(45) + 1;
//			if (!lotto.contains(num)) {
//				// 추출한 랜덤값을 리스트에 저장
//				lotto.add(num);
//			} else {
//				i--;
//			}
//		}
		
		// 방법 2
		while(lotto.size()<6) {
			int num = new Random().nextInt(45)+1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		
		System.out.println(lotto.size());
		System.out.println(lotto);
		
		// 리스트 내 데이터 정렬 
		// - Collections 클래스 : 컬렉션의 사용을 도와주기 위한 클래스 중 하나, static 메소드들로 구성되어 있어 객체 생성없이 바로 사용가능
		Collections.sort(lotto); // 기본 오름차순 정렬
		System.out.println(lotto);
		
		Collections.reverse(lotto); // 내림차순 정렬
		System.out.println(lotto);
		
		Collections.shuffle(lotto); // 무작위 섞기 
		System.out.println(lotto);
	}

}
