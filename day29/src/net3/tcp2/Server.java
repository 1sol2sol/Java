package net3.tcp2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// 채팅 프로그램 만들기
		// - 서버와 클라이언트가 한번씩 메세지를 보내고 받도록 구현
		// - 서버 프로그램

		Scanner sc = new Scanner(System.in);

		// 1. 서버에서 사용할 포트번호 지정
		int port = 6262;
		
		// 소켓 참조변수
		ServerSocket sSocket = null;
		Socket cSocket = null;
		// 스트림 참조변수
		InputStream in = null;
		OutputStream out = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			// 2. 서버용 소켓 객체 생성(클라이언트로부터 요청을 받아줄 객체)
			sSocket = new ServerSocket(port);
			System.out.println("연결 요청 기다리는 중...");

			// 3. 연결 요청 수락 후 해당 클라이언트에 대한 소켓 객체 별도 생성
			cSocket = sSocket.accept();
			System.out.println(cSocket.getRemoteSocketAddress() + " 사용자와 연결되었습니다.");

			// 4. 클라이언트와 데이터를 주고받기 위한 입력과 출력 스트림 생성
			in = cSocket.getInputStream();
			out = cSocket.getOutputStream();

			// 5. 보조 스트림 생성
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);

			// 6. 데이터 사용
			while (true) {
				// 메세지 받기
				String msg = dis.readUTF();
				System.out.println("클라이언트한테 받은 메세지 : " + msg);
				if (msg.equals("exit")) { // 사용자가 입력한 값이 exit라면
					System.out.println("연결을 종료합니다.");
					break;
				}
				// 메세지 보내기
				System.out.print("클라이언트에 보내고 싶은 메세지를 입력하세요 : ");
				msg = sc.nextLine();
				dos.writeUTF(msg);
			}
		} catch (IOException e) {
			System.out.println("오류 발생~!");
		} finally {
			// 7. 소켓 닫기
			try {
			sc.close();
			dis.close();
			dos.close();
			in.close();
			out.close();

			cSocket.close();
			sSocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
