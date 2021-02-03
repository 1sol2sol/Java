package gui3;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// JFrame 클래스를 상속받아서 별도의 프레임 클래스를 만들어서 사용
public class MainFrame extends JFrame{
	// - GUI 최상위 클래스인 Component가 Serializable을 구현하고 있어서 serialVersionUID를 선언하라고 경고 발생함
	private static final long serialVersionUID = -1730869195445042544L;
	
	// 필드
	JLabel label;
	JTextField id;
	JPasswordField pass;
	JButton submit;
	
	Font font15 = new Font("맑은 고딕", Font.BOLD, 15);
	Font font30 = new Font("맑은 고딕", Font.BOLD, 30);
	
	// 생성자
	public MainFrame() { 
		// - JFrame 클래스의 매개변수 생성자를 이용해 타이틀 지정 
		super("로그인");
		
		// - 컨테이너 설정 메소드 사용
		// - JFrame을 상속받고 있기때문에 JFrame에 있는 메소드를 가져다 쓸 수 있다. 
		// - super.() 또는 그냥 메소드 이름으로 적어도 자동으로 상속받고 있는 메소드에서 찾아쓴다.
		setLocationRelativeTo(null);
		setSize(300,400);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		label = new JLabel("로그인");
		label.setFont(font30);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0,0,300,100);
		add(label);
		
		label = new JLabel("아이디: ");
		label.setFont(font15);
		label.setBounds(20,100,80,30);
		add(label);
		
		id = new JTextField(20);
		id.setBounds(100,100,180,30);
		add(id);
		
		label = new JLabel("암호: ");
		label.setFont(font15);
		label.setBounds(20,150,80,30);
		add(label);
		
		pass = new JPasswordField(20);
		pass.setBounds(100,150,180,30);
		add(pass);
		
		submit = new JButton("로그인");
		submit.setFont(font15);
		submit.setBounds(100,200,100,50);
		add(submit);
		
		setVisible(true);
		
	}
}
