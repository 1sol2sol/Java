package gui1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test03 {

	public static void main(String[] args) {
		// 컨테이너 레이아웃 설정
		// - BorderLayout
		// - 모두 5개 영역(동/서/남/북/가운데)으로 나누어서 각 영역에 하나의 컴포넌트 배치
		// - 한 영역에 하나 이상의 컴포넌트를 넣고 싶으면 Panel을 이용해 여러 컴포넌트 배치 가능
		
		// 컨테이너 객체 생성
		JFrame mf = new JFrame("레이아웃 실습");
		
		mf.setBounds(500, 500, 300, 300); // 화면 크기, 위치 지정
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 활성화 
		
		//레이아웃 설정
//		BorderLayout bl = new BorderLayout();
//		mf.setLayout(bl);
		mf.setLayout(new BorderLayout());
		
		// 컴포넌트 객체 생성
		JButton bt1 = new JButton("버튼1");
		JButton bt2 = new JButton("버튼2");
		JButton bt3 = new JButton("버튼3");
		JButton bt4 = new JButton("버튼4");
		JButton bt5 = new JButton("버튼5");
		
		// 컴포넌트를 컨테이너에 배치 
		// - 각 컴포넌트를 어떤 영역에 배치할 것인지를 지정
		// - 동서남북가운데를 영어로 지정(대소문자 구분 필요)
		mf.add(bt1,"North"); // 북
		mf.add(bt2,"South"); // 남
		mf.add(bt3,"East"); // 동
		mf.add(bt4,"West"); // 서
		mf.add(bt5,"Center"); // 가운데
		
		// 하나의 영역에 여러 컴포넌트를 배치 
		// - 그냥 .add를 할 경우 덮어쓰기가 되어서 Panel을 이용해야 함
		// - Panel 컨테이너를 만들어서 추가해줌
		JPanel sf = new JPanel();
		sf.setLayout(new BorderLayout());
		
		JButton bt6 = new JButton("버튼6");
		sf.add(bt6,"North");
		
		JButton bt7 = new JButton("버튼7");
		sf.add(bt7,"South");
		
		mf.add(sf,"Center");
		mf.setVisible(true); // 화면을 창에 보여줌 
	}

}
