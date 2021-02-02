package gui1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {
	public static void main(String[] args) {
		// 컨테이너 레이아웃 설정
		// - FlowLayout
		// - 워드프로세스와 같은 방식으로 배치
		// - 3가지 정렬방식(왼쪽/가운데/오른쪽), 순서대로 배치되는 구조
		// - 생성 시 정렬 설정이 가능
		//		-> FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.CENTER
		
		JFrame mf = new JFrame("레이아웃 테스트");
		
		mf.setLocationRelativeTo(null); // 무조건 화면 가운데 오도록
		mf.setSize(300,300); // 사이즈 지정
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 활성화 
		
		// 레이아웃 설정
		//mf.setLayout(new FlowLayout()); // 기본값 : 가운데 정렬
		//mf.setLayout(new FlowLayout(FlowLayout.LEFT)); // 객체 생성 시 정렬 기준 결정
		mf.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton bt1 = new JButton("버튼1");
		JButton bt2 = new JButton("버튼2");
		JButton bt3 = new JButton("버튼3");
		JButton bt4 = new JButton("버튼4");
		JButton bt5 = new JButton("버튼5");
		
		mf.add(bt1);
		mf.add(bt2);
		mf.add(bt3);
		mf.add(bt4);
		mf.add(bt5);
		
		mf.setVisible(true);
	}
}
