package net3.tcp2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// 채팅 프로그램 만들기
		// - 서버와 클라이언트가 한번씩 메세지를 보내고 받도록 구현
		// - 클라이언트가 exit를 입력하면 종료
		// - 클라이언트 프로그램

		Scanner sc = new Scanner(System.in);

		// 1. 연결할 서버의 IP주소와 Port주소 지정
		String serverIP = "127.0.0.1";
		int port = 6262;

		// 소켓 참조변수 생성
		Socket socket = null;
		// 데이터 입출력 참조변수 생성
		OutputStream out = null;
		InputStream in = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;

		try {
			// 2. 서버와 연결할 클라이언트 소켓 객체 생성 후 연결 요청
			socket = new Socket(serverIP, port);
			System.out.println(socket.getRemoteSocketAddress() + " 서버와 연결되었습니다.");

			// 3. 서버와 데이터를 주고 받은 입력,출력 스트림 생성
			out = socket.getOutputStream();
			in = socket.getInputStream();

			// 4. 보조 스트림 생성
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);

			// 5. 데이터 주고 받기
			String msg = null;
			while (true) {
				// 메세지 보내기
				System.out.print("서버에 보내고 싶은 메세지를 입력하세요 : ");
				msg = sc.nextLine();
				dos.writeUTF(msg);
				if (msg.equals("exit")) {
					System.out.println("연결을 종료합니다.");
					break;
				}
				// 메세지 받기
				msg = dis.readUTF();
				System.out.println("상대방한테 받은 메세지 : " + msg);
			}
		} catch (IOException e) {
			System.out.println("오류발생~!");
		} finally {
			// 6. 스트림 및 소켓 닫기
			try {
				sc.close();
				dos.close();
				dis.close();
				out.close();
				in.close();

				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
