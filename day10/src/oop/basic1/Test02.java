package oop.basic1;

public class Test02 {
	public static void main(String[] args) {
		//메세지 생성
		Message a = new Message();
		Message b = new Message();
		
		//레퍼런스 : 참조변수, 객체를 제어하기 위한 리모컨
		//인스턴스 : 프로그램상에서 만들어진 객체
		//객체 : 여러 개의 데이터가 뭉쳐져서 만들어진 하나의 정보 덩어리(복합데이터)
		//a ------> {sender : null, content : null, time : null}
		//b ------> {sender : null, content : null, time : null}
	
		//초기화
		a.sender = "호기심천국"; //a라는 객체의 sender에 값을 설정(다른 객체에 영향 없음)
		a.content = "지난번 올리신 카메라 팔렸나요?";
		a.time = "오후 1:35";
			
		b.sender = "호기심천국"; 
		b.content = "왜요?";
		b.time = "오후 1:35";
		
		//a.content = 
		
		
		//출력
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.time);
		
		System.out.println(b.sender);
		System.out.println(b.content);
		System.out.println(b.time);
	}
}
