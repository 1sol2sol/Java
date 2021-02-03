package gui4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test02 {

	public static void main(String[] args) {
		// 무명 클래스(익명객체)로 리스너 객체화

		JFrame mf = new JFrame("이벤트 테스트2");

		mf.setBounds(500, 500, 300, 300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(new GridLayout(5, 2));

		JLabel label = new JLabel("숫자 1: ");
		mf.add(label);
		JTextField num1 = new JTextField(5);
		mf.add(num1);

		mf.add(new JLabel("숫자 2: ")); // 한번쓰고 내용을 변경 수정 할 일이 없으면 바로 객체화 시킴
		JTextField num2 = new JTextField(5);
		mf.add(num2);

		mf.add(new JLabel("합계 : "));
		JTextField sum = new JTextField(5);
		sum.setEnabled(false); // 입력 비 활성화 
		mf.add(sum);

		mf.add(new JLabel("평균 : "));
		JTextField avg = new JTextField(5);
		avg.setEnabled(false);
		mf.add(avg);

		JButton result = new JButton("결과");
		mf.add(result);

		JButton reset = new JButton("다시");
		mf.add(reset);

		mf.setVisible(true);

		//// 이벤트 처리

		// 결과 버튼에 대한 이벤트 처리
		result.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력 받은 두 수의 합계 구하기
				// - 입력데이터가 문자열이라서 정수형으로 변환 후 연산
				int sumTemp = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
				sum.setText(String.valueOf(sumTemp));

				double avgTemp = sumTemp / 2.0;
				avg.setText(String.valueOf(avgTemp));
			}
		});

		// 다시 버튼에 대한 이벤트 처리
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 모든 텍스트 필드에 입력된 값 초기화 시키기
				num1.setText(""); // num1.setText(null); 도 가능
				num2.setText("");
				sum.setText("");
				avg.setText("");
			}

		});
	}

}
