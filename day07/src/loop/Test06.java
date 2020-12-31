package loop;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
// 		목표: 1부터 100 사이의 짝수 개수 세기
		
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println("짝수 " + i);
				count++;
			}
		}
		
		System.out.println(count);
	}

}
