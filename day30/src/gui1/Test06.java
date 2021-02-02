package gui1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test06 {
	public static void main(String[] args) {
		// 컨테이너 레이아웃 설정
		// - GridBagLayout
		// - 엑셀처럼 셀을 병합해서 사용자가 원하는 스타일로 지정 가능
		// - 설정이 복잡
		
		JFrame mf = new JFrame("레이아웃 테스트");
		
		mf.setBounds(300,300,300,300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 지정
		mf.setLayout(new GridBagLayout());
		
		// GridBagLayout의 배치를 도와줄 클래스 
		GridBagConstraints c = new GridBagConstraints();
		
		
		// 배치 설정
		c.fill = GridBagConstraints.BOTH; // 컴포넌트를 영역의 크기만큼 알아서 조정 
		c.weightx = 1.0; // 화면에 꽉 채우고 싶을때 weightx:weighty 의 비율로 크기 조정 
		c.weighty = 1.0;
		
		
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth  = 1;
		c.gridheight = 1;
		JButton bt1 = new JButton("버튼1");
		mf.add(bt1,c); // 추가 시 배치 Constraints를 인자값으로 값이 등록 
		
		c.gridy = 1;
		JButton bt2 = new JButton("버튼2");
		mf.add(bt2,c);
		
		c.gridx = 1;
		c.gridy = 0;
		c.gridheight = 2;
		JButton bt3 = new JButton("버튼3");
		mf.add(bt3,c);
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth  = 2;
		c.gridheight = 1;
		JButton bt4 = new JButton("버튼4");
		mf.add(bt4,c);
		
		c.gridy = 3;
		JButton bt5 = new JButton("버튼5");
		mf.add(bt5,c);
		
		mf.setVisible(true);
	}
}
