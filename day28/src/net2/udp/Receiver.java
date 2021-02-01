package net2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {

	public static void main(String[] args) throws IOException {
		// UDP - 수신자 프로그램
		// - 편지 받기 (반복)

		// 1. 사용할 포트 지정
		int port = 6262;

		// 2. 소켓 생성
		DatagramSocket ds = new DatagramSocket(port);
		System.out.println("메세지를 받을 준비가 되었습니다");
		
		// 3. 데이터를 받아줄 보관함 생성
		// - 받아온 데이터를 저장하기 위해 버퍼 생성
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		while (true) {
			// 4. 메시지 받아오기
			ds.receive(dp); // 받아온 데이터를 dp에 저장

			// 5. 메시지 확인
			String msg = new String(dp.getData(), 0, dp.getLength());
			System.out.println(dp.getAddress()+" 사용자에게 받은 메시지 : " + msg);
				// dp.getAddress() -> 보낸 사람의 ip주소 
			// exit 문자열 입력받으면 종료 
			if(msg.equals("exit")) { // 받은 데이터가 exit라면
				// 받은 데이터 dp를 문자열 형태로 msg에 저장해두었기 때문에 msg에 있는 데이터가 exit라면 종료
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
		}
		// 6. 소켓 닫기
		ds.close();
	}

}
