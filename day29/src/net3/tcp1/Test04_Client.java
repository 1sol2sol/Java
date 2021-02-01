package net3.tcp1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test04_Client {
	public static void main(String[] args) throws IOException {
		// TCP - Client 프로그램
		// - 사용자로부터 입력받은 데이터를 서버로 반복해서 보내기
		// - 사용자가 exit 입력하면 종료

		Scanner sc = new Scanner(System.in);

		// 1. 연결할 서버의 IP주소와 Port주소 지정
		String serverIP = "127.0.0.1";
		int port = 6262;

		// 2. 서버와 연결할 클라이언트 소켓 객체 생성 후 연결 요청
		Socket socket = new Socket(serverIP, port);
		System.out.println(socket.getRemoteSocketAddress() + " 서버와 연결되었습니다.");

		// 3. 서버와 데이터를 주고 받을 출력 스트림 생성
		OutputStream out = socket.getOutputStream();

		// 4. 보조 스트림 생성
		DataOutputStream dos = new DataOutputStream(out);

		// 5. 데이터 사용(서버로 데이터 보내기)
		while (true) {
			System.out.println("보내고 싶은 메세지를 입력하세요.");
			String msg = sc.nextLine();
			dos.writeUTF(msg);
			if (msg.equals("exit")) {
				System.out.println("연결을 종료합니다.");
				break;
			}
		}
		// 6. 소켓 닫기
		dos.close();
		out.close();

		socket.close();

	}

}
