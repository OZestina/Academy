package 문제풀이;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.TextField;

public class 정리문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(300, 400);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 33, 120, 22);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("당신의 나이는");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(22, 126, 120, 22);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("국어 점수");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(22, 219, 120, 22);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("수학 점수");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(22, 251, 120, 22);
		f.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_2 = new JLabel("고생하셨습니다 휴-먼");
		lblNewLabel_2.setFont(new Font("HY울릉도B", Font.PLAIN, 8));
		lblNewLabel_2.setBounds(192, 346, 92, 15);
		f.getContentPane().add(lblNewLabel_2);

		t1 = new JTextField();
		t1.setBackground(Color.LIGHT_GRAY);
		t1.setBounds(147, 33, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBackground(Color.LIGHT_GRAY);
		t2.setColumns(10);
		t2.setBounds(147, 126, 116, 21);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setBackground(Color.LIGHT_GRAY);
		t3.setColumns(10);
		t3.setBounds(147, 219, 116, 21);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setBackground(Color.LIGHT_GRAY);
		t4.setColumns(10);
		t4.setBounds(147, 251, 116, 21);
		f.getContentPane().add(t4);

		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 자동으로 이 함수가 실행
				// 버튼을 클릭했을 때 처리내용을 입력하면 됨
				String st1 = t1.getText();
				if (st1.equals("아메리카노") || st1.equals("주스") || st1.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페로 가세요.");
				} else {
					JOptionPane.showMessageDialog(f, "그러면 물을 마셔요.");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton.setBounds(22, 65, 240, 38);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st2 = t2.getText();
				int nt2 = Integer.parseInt(st2);
				JOptionPane.showMessageDialog(f, "당신은 내년에 " + (nt2 + 1) + "살이 됩니다.");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton_1.setBounds(22, 158, 240, 38);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st3 = t3.getText();
				String st4 = t4.getText();
				
				int nt3 = Integer.parseInt(st3);
				int nt4 = Integer.parseInt(st4);
//				int nt3 = Integer.parseInt(t3.getText());
//				int nt4 = Integer.parseInt(t4.getText());
				
				double average = (nt3 + nt4) / 2.0;
				JOptionPane.showMessageDialog(f, "평균 점수는 " + average + "입니다.");
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(22, 283, 240, 38);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true);

	}
}
