package gui2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test01 {

	public static void main(String[] args) {
		// 메모 보내기 창 만들기 
		
		JFrame mf = new JFrame("메모 보내기");
		 
		mf.setLocationRelativeTo(null); // 화면 중앙에 위치 시킴
		mf.setSize(500,500); // 창의 사이즈 조정 
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창의 x버튼 활성화 
		mf.setLayout(new BorderLayout()); // 메인 컨테이너 레이아웃 설정 
		
		// 상단 패널 구성 
		JPanel top = new JPanel();
		// - 패널은 레이아웃 지정안해도 여러 컴포넌트 추가 가능
		JLabel nameLabel = new JLabel("이름 : ");
		top.add(nameLabel);
		JTextField name = new JTextField(15);
		top.add(name);
		
		JLabel passLabel = new JLabel("암호 : ");
		top.add(passLabel);
		JPasswordField pass = new JPasswordField(15);
		top.add(pass);
		
		mf.add(top,"North");
		
		// 중앙 패널 구성
		JPanel center = new JPanel();
		
		center.add(new JLabel("메모 : ")); 
		// -> 바로 만들고 없어져버려서 크기,색깔,글씨체 등 수정 불가 
		JTextArea memo = new JTextArea(20,35); // JTextArea -> 여러줄을 입력할 수 있는 칸을 만들 수 있음 
		center.add(memo);
		
		mf.add(center,"Center");
		
		// 하단 버튼 구성 
		JButton submit = new JButton("전송");
		
		mf.add(submit,"South");
		
		mf.setVisible(true);
	}

}
