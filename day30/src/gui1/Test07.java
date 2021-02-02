package gui1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test07 {
	public static void main(String[] args) {
		// 컨테이너 레이아웃 설정
		// - 레이아웃 설정을 null로 하고, 각 컴포넌트의 위치와 크기를 이용해서 배치할 수도 있음
		
		JFrame mf = new JFrame("레이아웃 테스트");
		
		mf.setBounds(300,300,500,500);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 설정 
		mf.setLayout(null);
		
		JButton bt1 = new JButton("버튼1");
		bt1.setBounds(0, 0, 100, 100); // 컴포넌트마다 위치와 크기를 지정
		mf.add(bt1);
		
		JButton bt2 = new JButton("버튼2");
		bt2.setBounds(300, 200, 100, 50); // 컴포넌트마다 위치와 크기를 지정
		mf.add(bt2);
		
		// 컨테이너 내 다른 컨테이너 추가 
		// -> 메인 컨테이너 레이아웃 값이 null이더라도 새로운 컨테이너 추가이기때문에 layout 맘대로 설정 가능 
		// -> 메인 컨테이너에 포함이 되는 컨테이너이기 때문에 메인 컨테이너내에 위치와 크기 설정 해야함
		JPanel sf = new JPanel();
		
		// 서브 컨테이너도 메인 컨테이너에 추가되기 위해서 위치와 크기를 지정해야 함 
		sf.setBounds(100,300,150,150);
		
		// 메인 컨테이너의 레이아웃과 상관없이 별도의 레이아웃을 구성할 수 있음 
		sf.setLayout(new GridLayout(2,2));
		
		JButton bt3 = new JButton("버튼3");
		JButton bt4 = new JButton("버튼4");
		JButton bt5 = new JButton("버튼5");
		JButton bt6 = new JButton("버튼6");
		
		sf.add(bt3);
		sf.add(bt4);
		sf.add(bt5);
		sf.add(bt6);
		
		mf.add(sf);
		
		mf.setVisible(true);
	}
}
