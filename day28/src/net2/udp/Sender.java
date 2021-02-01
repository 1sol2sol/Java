package net2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sender {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// UDP - 발신자 프로그램
		// - 메세지 보내기(반복)
		// - 사용자에게 입력받아서 메세지를 반복해서 보내기
		// - 사용자가 exit 를 입력하면 메세지 그만 보내기

		// 1. 메세지를 받을 수신자의 주소 지정
		// InetAddress : 자바에서 네트워크 주소를 다루기 위해 제공하는 클래스
		// -> (new 연산자로 객체를 생성할 수 없음, static 메소드로 객체 생성)
		InetAddress ip = InetAddress.getByName("112.221.47.69");
		int port = 6262; // 수신자와 발신자의 포트주소는 반드시 같아야함!

		// 2. 메세지를 보내 줄 DatagramSocket 객체 생성 (우체국)
		DatagramSocket ds = new DatagramSocket();

		Scanner sc = new Scanner(System.in);

		while (true) {
			// 3. 보내고 싶은 메세지 생성
			System.out.print("보내고 싶은 메세지를 입력하세요 : ");
			String msg = sc.nextLine();

			// 4. 메세지를 DatagramPacket 객체를 생성해서 담아 줌(편지봉투)
			DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ip, port);

			// 5. 메세지 전송
			ds.send(dp);

			if (msg.equals("exit")) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		// 6. 소켓 닫기
		ds.close();
	}

}
