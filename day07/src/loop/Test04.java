/*<문제>
1부터 99사이에 있는 5가 들어간 숫자를 출력하라
= 5, 15, 25, 35, 45, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 65, 75, 85, 95(19개)*/
package loop;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		for(int i=5; i<=99; i=i+10) {
			System.out.println(i);
		}
		for(int i=50; i<60; i=i+1) {
			if(i!=55) {
				System.out.println(i);
			}
		}
	}

}
