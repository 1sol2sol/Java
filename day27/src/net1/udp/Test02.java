package net1.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// UDP - 메세지를 받는 프로그램(수신자)
		// - 편지받기
		System.out.println("수신자(Test02)");
		// 1. 메세지를 받을 포트 지정 
		int port = 30000;
		
		// 2. 메세지를 받아 줄 DatagramSocket 객체 생성(우체국)
		// - 메세지를 받아 줄 포트번호를 지정해 줘야 함 
		DatagramSocket ds = new DatagramSocket(port);
		
		// 3. 메세지를 받아서 저장할 DatagramPacket 객체 생성(편지 보관함)
		// -  얼만큼의 메세지를 받아서 어디에 저장해 줄 것 인지 미리 지정해야 함
		byte [] buffer = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
		// 4. 메세지 받기
		// - 소켓(우체국)으로 메세지를 전송받아서 패킷(편지보관함)에 저장 
		ds.receive(dp);
		
		
		// 5. 메세지 확인 
		// - byte[]로 전달받은 데이터를 문자열로 변환해서 확인 
		// -> 데이터 전체를 저장하면 byte[] 크기만큼 뒤에 비어 있는 부분도 저장됨
		// - new String(데이터,시작위치,개수);
		String msg = new String(dp.getData(),0,dp.getLength());
		System.out.println(msg);
		
		// 6. 소켓 닫기 
		ds.close();
	}
}
