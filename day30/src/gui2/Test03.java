package gui2;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test03 {
	public static void main(String[] args) {
		
		JFrame mf = new JFrame("회원가입");
		
		mf.setLocationRelativeTo(null);
		mf.setSize(400,500);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(null);
		
		// 이미지 넣기 
		JLabel imageLabel;
		try {
			Image logo = ImageIO.read(new File("resources\\member.png"));
			imageLabel = new JLabel(new ImageIcon(logo));
		} catch (IOException e) {
			imageLabel = new JLabel("이미지 로딩 실패");
		}
		
		imageLabel.setBounds(20,30,94,98);
		mf.add(imageLabel);
		
		JLabel label = new JLabel("회원 가입");
		label.setBounds(130,0,200,150);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		mf.add(label);
		
		// 아이디  
		JLabel idLabel = new JLabel("아이디: ");
		idLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		JTextField idf = new JTextField(15);
		
		idLabel.setBounds(25,115,100,100);
		idf.setBounds(140,155,180,25);
		
		mf.add(idLabel);
		mf.add(idf);
		
		// 이름
		JLabel nameLabel = new JLabel("이름: ");
		nameLabel.setBounds(25,145,100,100);
		nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		JTextField nameField = new JTextField(15);
		nameField.setBounds(140,185,180,25);
		
		mf.add(nameLabel);
		mf.add(nameField);
		
		// 비밀번호
		JLabel passLabel = new JLabel("비밀번호: ");
		passLabel.setBounds(25,175,100,100);
		passLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		JPasswordField pass = new JPasswordField(15);
		pass.setBounds(140,215,180,25);
		
		mf.add(pass);
		mf.add(passLabel);
		
		// 전화번호
		JLabel telLabel = new JLabel("전화번호: ");
		telLabel.setBounds(25,205,100,100);
		telLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		JTextField telField = new JTextField(15);
		telField.setBounds(140,245,180,25);
		
		mf.add(telField);
		mf.add(telLabel);
		
		// 지역
		JLabel areaLabel = new JLabel("지역: ");
		areaLabel.setBounds(25,235,100,100);
		areaLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		mf.add(areaLabel);
		// 지역 콤보박스
		String []list = {"서울시","경기도","인천시","부산시"};
		JComboBox<String> combo = new JComboBox<>(list);
		combo.setBounds(140,275,180,25);
		mf.add(combo);
		
		// 성별
		JLabel sexLabel = new JLabel("성별: ");
		sexLabel.setBounds(25,265,100,100);
		sexLabel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		mf.add(sexLabel);
		
		JRadioButton rbt1 = new JRadioButton("남자");
		JRadioButton rbt2 = new JRadioButton("여자");
		
		ButtonGroup btGroup = new ButtonGroup(); 
		btGroup.add(rbt1);
		btGroup.add(rbt2);
		
		rbt1.setBounds(140,300,100,30);
		rbt2.setBounds(270,300,100,30);
		mf.add(rbt1);
		mf.add(rbt2);
		
		// 관심분야
		JLabel interestL = new JLabel("관심분야: ");
		interestL.setBounds(25,295,100,100);
		interestL.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		mf.add(interestL);
		
		// 관심분야 체크박스
		JCheckBox cb1 = new JCheckBox("자바");
		JCheckBox cb2 = new JCheckBox("디비");
		JCheckBox cb3 = new JCheckBox("웹");
		
		cb1.setBounds(140,330,50,30);
		cb2.setBounds(210,330,50,30);
		cb3.setBounds(280,330,50,30);
		
		mf.add(cb1);
		mf.add(cb2);
		mf.add(cb3);
		
		JButton apply = new JButton("가입하기");
		apply.setBounds(100,380,200,50);
		mf.add(apply);
		
		mf.setVisible(true);
	
	}
}
