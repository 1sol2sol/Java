package loop;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		// 목표 : Hello Java를 10번 출력하세요
		//- 10번을 컴퓨터에 뭐라고 설명해야되는가?
		//- 1부터 10 이하일 때까지 1씩 증가시키면서 무언가 실행하면 10번만 실행된다!
		
		//for(10번){
		//for(선언부 ; 조건부 ; 증감부){코드}
		for(int i=1; i <= 10; i=i+1){
		System.out.println("Hello Java1");// => 이 구문을 열번 실행시켜라 
		}
		
		for(int i=1; i<= 10; i=i+2){
			System.out.println("Hello Java2");// => 이 구문을 열번 실행시켜라 
			}
		
		for(int i=0; i<10; i=i+1){ //0부터 시작하는 방식이 많이 나오는 방식 
			System.out.println("Hello Java3");// => 이 구문을 열번 실행시켜라 
			}
		
		for(int i=0; i< 10; i=i+1){
			System.out.println(i);// => 이 구문을 열번 실행시켜라 
			}
	}

}
