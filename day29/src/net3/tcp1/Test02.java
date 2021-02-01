package net3.tcp1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		// TCP - 연결 요청을 보내는 프로그램(Client)
		
		// 1. 연결할 서버의 IP주소와 Port주소 지정 
		String serverIP = "127.0.0.1";
		int port = 6262;
		
		// 2. 서버와 연결할 클라이언트 소켓 객체 생성 후 연결 요청
		Socket socket = new Socket(serverIP,port);
		// - 객체 생성 시 서버와 자동으로 연결 요청함 
		// - 연결이 실패하면 null을 리턴 
		// - 연결을 끊고나서 다시 연결을 하고 싶은 경우 .connect() 메소드 사용
		System.out.println(socket.getRemoteSocketAddress()+" 서버와 연결되었습니다.");
						// getRemoteSocketAddress() -> 연결된 상대의 IP와 Port주소를 한번에 알려주는 메소드
		// 3. 서버와 데이터를 주고 받을 입출력 스트림 생성
		OutputStream out = socket.getOutputStream(); // 소켓을 이용한 OutputStream
		
		// 4. 기반 스트림을 도와줄 보조 스트림 생성
		DataOutputStream dos = new DataOutputStream(out);
		
		// 5. 데이터 사용(서버로 데이터 보내기)
		dos.writeUTF("안녕하세요~!");
		
		// 6. 소켓 닫기
		dos.close();
		out.close();
		
		socket.close();
	}
}
