package gui1;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Test01 {

	public static void main(String[] args) {
		// GUI 컨테이너 만들기 
		// - 1. 컨테이너 객체를 직접 생성하는 방법
		// - JFrame 클래스 사용
		
		// JFrame 객체 생성
		JFrame mainFrame = new JFrame("컨테이너 만들기");
		
		// 컨테이너에 대한 기본 설정 
		//mainFrame.setSize(300,500);			// 컨테이너 크기 지정(기본값 : 0)
		//mainFrame.setLocation(100, 100);		// 컨테이너의 시작 위치를 지정(기본값 : 0)
		//mainFrame.setLocationRelativeTo(null);	// 컨테이너의 시작 위치를 화면 중앙으로 지정
		mainFrame.setBounds(300, 300, 500, 500);	// 컨테이너의 시작 위치와 크기를 동시에 지정
		mainFrame.setTitle("창을 만들어보아요~!");		// 컨테이너의 제목 설정
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 컨테이너의 닫기 버튼 활성화(닫기 버튼 눌렀을때 프로그램 종료)
		mainFrame.setResizable(false);			// 컨테이너의 크기 조정 가능 여부(기본값 : true)
		
		
		// 컨테이너 아이콘 이미지 설정
		// - 이미지 파일을 읽어와서 이미지 객체로 만든 후 아이콘으로 설정
		try {
			mainFrame.setIconImage(ImageIO.read(new File("resources\\images.png")));
		} catch (IOException e) {
		}
		
		// 컨테이너를 화면에 보이도록 설정 
		mainFrame.setVisible(true);
	}

}
