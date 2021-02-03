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

public class Test04 {

	public static void main(String[] args) {
		// 회원 가입 창 만들기
		
		JFrame mf = new JFrame("회원가입");
		
		mf.setLocationRelativeTo(null);
		mf.setSize(400,500);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(null);
		
		JLabel topLogo;
		try {
			Image logo = ImageIO.read(new File("resources\\member.png"));
			topLogo = new JLabel(new ImageIcon(logo));
		} catch (IOException e) {
			topLogo = new JLabel("로딩실패");			
		}
		topLogo.setBounds(10,10,100,100);
		mf.add(topLogo);
		
		JLabel topLabel = new JLabel("회원 가입"); 
		topLabel.setBounds(150,10,280,100);
		topLabel.setFont(new Font("맑은 고딕",Font.BOLD,35));
		mf.add(topLabel);
		
		Font font20 = new Font("맑은 고딕",Font.BOLD,20);
		
		JLabel label = new JLabel("아이디 : ");
		label.setFont(font20);
		label.setBounds(20,120,100,30);
		mf.add(label);
		
		JTextField id = new JTextField(20);
		id.setFont(font20);
		id.setBounds(150,120,150,30);
		mf.add(id);
		
		label = new JLabel("이름 : ");
		label.setFont(font20);
		label.setBounds(20,150,100,30);
		mf.add(label);
		
		JTextField name = new JTextField(20);
		name.setFont(font20);
		name.setBounds(150,150,150,30);
		mf.add(name);
		
		label = new JLabel("비밀번호 : ");
		label.setFont(font20);
		label.setBounds(20,180,100,30);
		mf.add(label);
		
		JPasswordField pass = new JPasswordField(20);
		pass.setBounds(150,180,150,30);
		mf.add(pass);
		
		label = new JLabel("전화번호 : ");
		label.setFont(font20);
		label.setBounds(20,210,100,30);
		mf.add(label);
		
		JTextField tel = new JTextField(20);
		tel.setFont(font20);
		tel.setBounds(150,210,150,30);
		mf.add(tel);
		
		label = new JLabel("지역 : ");
		label.setFont(font20);
		label.setBounds(20,240,100,30);
		mf.add(label);
		
		String [] areaList = {"서울시","경기도","경상도","전라도","강원도"};
		JComboBox<String> area = new JComboBox<>(areaList);
		area.setFont(font20);
		area.setBounds(150,240,150,30);
		mf.add(area);
		
		label = new JLabel("성별 : ");
		label.setFont(font20);
		label.setBounds(20,270,100,30);
		mf.add(label);
		
		JRadioButton gender1 = new JRadioButton("남자");
		JRadioButton gender2 = new JRadioButton("여자");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(gender1);
		genderGroup.add(gender2);
		gender1.setFont(font20);
		gender2.setFont(font20);
		gender1.setBounds(150,270,80,30);
		gender2.setBounds(240,270,80,30);
		mf.add(gender1);
		mf.add(gender2);
		
		label = new JLabel("관심분야 : ");
		label.setFont(font20);
		label.setBounds(20,300,100,30);
		mf.add(label);
		
		JCheckBox interest1 = new JCheckBox("자바");
		JCheckBox interest2 = new JCheckBox("DB");
		JCheckBox interest3 = new JCheckBox("웹");
		interest1.setFont(font20);
		interest2.setFont(font20);
		interest3.setFont(font20);
		interest1.setBounds(150,300,70,30);
		interest2.setBounds(220,300,70,30);
		interest3.setBounds(290,300,70,30);
		mf.add(interest1);
		mf.add(interest2);
		mf.add(interest3);
		
		JButton submit = new JButton("가입하기");
		submit.setFont(font20);
		submit.setBounds(100,350,200,50);
		mf.add(submit);
		
		mf.setVisible(true);		
	}

}