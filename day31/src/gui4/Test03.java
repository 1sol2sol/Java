package gui4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test03 {

	public static void main(String[] args) {
		JFrame mf = new JFrame("점수 관리 프로그램");
		mf.setBounds(500, 500, 500, 300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(null);

		JLabel label;

		label = new JLabel("점수 관리 프로그램");
		label.setBounds(0, 0, 500, 70);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		mf.add(label);

		Font font15 = new Font("맑은 고딕", Font.BOLD, 15);

		label = new JLabel("국어: ");
		label.setBounds(25, 50, 100, 100);
		label.setFont(font15);
		mf.add(label);

		JTextField korean = new JTextField(15);
		korean.setBounds(70, 85, 150, 30);
		korean.setFont(font15);
		mf.add(korean);

		label = new JLabel("영어: ");
		label.setBounds(250, 50, 100, 100);
		label.setFont(font15);
		mf.add(label);

		JTextField english = new JTextField(15);
		english.setBounds(300, 85, 150, 30);
		english.setFont(font15);
		mf.add(english);

		label = new JLabel("합계: ");
		label.setBounds(25, 110, 100, 100);
		label.setFont(font15);
		mf.add(label);

		JTextField sum = new JTextField(15);
		sum.setBounds(70, 145, 150, 30);
		sum.setEnabled(false);
		sum.setFont(font15);
		mf.add(sum);

		label = new JLabel("평균: ");
		label.setBounds(250, 110, 100, 100);
		label.setFont(font15);
		mf.add(label);

		JTextField avg = new JTextField(15);
		avg.setBounds(300, 145, 150, 30);
		avg.setEnabled(false);
		avg.setFont(font15);
		mf.add(avg);

		JButton cal = new JButton("계산");
		cal.setBounds(180, 200, 130, 40);
		cal.setFont(font15);
		mf.add(cal);

		mf.setVisible(true);

		//// 이벤트 처리

		// 계산 결과 버튼에 대한 이벤트 처리
		cal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력 한 두 수 합계
				int sumTemp = Integer.parseInt(korean.getText()) + Integer.parseInt(english.getText());
				sum.setText(String.valueOf(sumTemp));

				// 입력 한 두 수 평균
				double avgTemp = sumTemp / 2.0;
				avg.setText(String.valueOf(avgTemp));
			}

		});
	}

}
