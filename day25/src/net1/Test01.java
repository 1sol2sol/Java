package net1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 클라이언트용 프로그램 
		
		int port = 6262; // 서버의 포트번호 
		String serverIP; // 서버의 아이피 주소 
		
		serverIP = InetAddress.getByName("100.100.100.100").getHostAddress();
		// serverIP = InetAddress.getLocalHost().getHostAddress();
		// -> getLocalHost는 나 자신을 나타내는 IP 주소로 상대방 주소를 입력해야 하기 때문에 사용 불가 
		
		Socket socket = new Socket(serverIP,port);
		
	}
}
