package net1.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//UDP - 메세지를 보내는 프로그램(발신자)
		// - 편지 보내기 
		System.out.println("발신자(Test01)");
		// 1. 메시지를 받을 수신자의 주소 지정 (친구 집 주소 알아내기)
		// InetAddress : 자바에서 네트워크 주소를 다루기 위해 제공하는 클래스
		// -> (new 연산자로 객체를 생성할 수 없음, static 메소드로 객체 생성)
		InetAddress ip = InetAddress.getByName("127.0.0.1"); // 현재는 내 컴퓨터의 IP주소로 지정
		int port = 30000;
		
		// 2. 메세지를 보내 줄 DatagramSocket 객체 생성 (우체국)
		DatagramSocket ds = new DatagramSocket();
		
		// 3. 보내고 싶은 메시지 생성(편지지)
		String msg = "금요일~!";
		
		// 4. 메세지를 DatagramPacket 객체를 생성해서 담아 줌(편지봉투)
		// - 메세지는 네트워크상으로 보내야하기 때문에 byte[] 형태로 변환해서 보내야한다. 
		// - IP주소는 InetAddress 클래스 타입으로 지정
		// new DatagramPacket(메세지, 메세지크기, 수신자의 IP주소, 수신자의 Port주소);
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ip, port);
		
		// 5. 메세지 전송 
		// - 소켓(우체국)에 패킷(편지봉투) 전달해서 메세지를 보냄
		ds.send(dp);
		
		// 6. 소켓 닫기 
		ds.close();
		
	}
}

