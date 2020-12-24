package data;
import java.lang.*;
public class Test19 {
	public static void main(String[] args) {
		//JAVA에서는 글자를 어떻게 다루는가?
		//-MS949 방식으로 글자를 다룬다.
		//-한 글자의 크기는 2byte로 설정되어있다.(char 크기고 2byte)
		//-외따옴표를 쓰며, 한 글자만 넣을 수 있다.
		
		char a = '밥';
		char b = 65;
		
		System.out.println(a);
		System.out.println(b);
		
		//만약에 a에 들어있는 글자에 연결된 숫자를 알고 싶다면?
		//= char도 결국에는 정수니까 다른 정수로 변경이 가능할까? 가능하다 
		//= 범위는 0부터 65535까지 
		int c = a; // int가 char보다 크다 int > char
		System.out.println(c);
		System.out.println((int)a);
		
		char start = 'ㅏ';
		char finish = 'ㅣ';
		System.out.println((int)start);
		System.out.println((int)finish);
		
		//되긴 되지만 의미가 없다(결과가 int로 나옴)
		System.out.println(start + finish);
	}
}
