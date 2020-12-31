package array;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		// 목표 : 배열에 반복문을 적용
		// = 배열은 위치가 숫자로 관리되기 때문에 for를 이용해서 접근하기가 용이하다
		// = 배열의 마지막 위치를 알아내기 위해서 반드시 배열의 칸수를 알아야한다(length 버튼)
		int[] data = new int[] {10,20,30,40,50,60,70,80,90,100};
		System.out.println(data.length);
		
		for(int i=0; i<=data.length-1; i++) {
			System.out.println(data[i]);
		}
	}

}
