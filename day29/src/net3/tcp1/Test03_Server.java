package net3.tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03_Server {
	public static void main(String[] args) throws IOException {
		// TCP - Server 프로그램
		// - 클라이언트로부터 메세지 반복해서 받아서 출력
		// - 클라이언트가 exit 입력하면 종료

		// 1. 서버에서 사용할 포트번호 지정
		int port = 6262;

		// 2. 서버용 소켓 객체 생성(클라이언트로부터 요청을 받아줄 객체)
		ServerSocket sSocket = new ServerSocket(port);
		System.out.println("연결 요청 기다리는 중...");

		// 3. 연결 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 별도 생성
		Socket cSocket = sSocket.accept();
		System.out.println(cSocket.getRemoteSocketAddress() + " 사용자와 연결되었습니다.");

		// 4. 클라이언트와 데이터를 주고받기 위한 입력 스트림 생성
		InputStream in = cSocket.getInputStream();

		// 5. 보조 스트림 생성
		DataInputStream dis = new DataInputStream(in);
		// DataInputStream -> 문자열로 데이터를 받기 위해

		// 6. 데이터 사용(데이터 받아와서 출력)
		while (true) {
			// dis.readUTF() 가 실행될때마다 보조 InputStream을 이용하여 값을 받아오는것 
			// 읽어온 데이터를 이용하여 출력도 해야하고 그 내용이 exit인지 비교도 해야함 
			// System.out.println(dis.readUTF());
			// if(dis.readUTF().equals("exit")) { break;} 
		    // -> 와 같이 작성하게 되면 dis.readUTF() 가 두번 실행되어 두번을 입력받게 되는것이다. 
			// -> 따라서 한번 입력받은 데이터를 이용하여 출력과 비교 두가지 이상 작업을 하고 싶다면 
			// -> 한번 입력 받은것을 변수를 이용해서 저장해서 이용한다. 
			
			String msg = dis.readUTF();
			System.out.println(msg); 
			if(msg.equals("exit")) { // 사용자가 입력한 값이 exit라면 
				System.out.println("연결을 종료합니다.");
				break;
			}
		}
		// 7. 소켓 닫기
		dis.close();
		in.close();

		cSocket.close();
		sSocket.close();
	}

}
