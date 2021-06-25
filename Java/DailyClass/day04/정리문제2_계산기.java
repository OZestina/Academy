package 문제풀이;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 정리문제2_계산기 {
	private static JTextField t1;
	private static JTextField t2;
	
	public static void main (String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(300, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("계 산 기");
		lblNewLabel.setFont(new Font("HY궁서", Font.BOLD, 55));
		lblNewLabel.setBounds(36, 21, 225, 89);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setFont(new Font("HY궁서", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(38, 127, 57, 26);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setFont(new Font("HY궁서", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(38, 165, 79, 26);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(105, 126, 139, 26);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(105, 164, 139, 26);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(f, "더한 값은 "+(n1+n2)+"입니다.");
			}
		});
		btnNewButton.setFont(new Font("문체부 훈민정음체", Font.PLAIN, 18));
		btnNewButton.setBounds(36, 222, 95, 44);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼  기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(f, "뺀 값은 "+(n1-n2)+"입니다.");
			}
		});
		btnNewButton_1.setFont(new Font("문체부 훈민정음체", Font.PLAIN, 18));
		btnNewButton_1.setBounds(149, 222, 95, 44);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("나누기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(f, "나눈 값은 "+(n1/n2)+"이고, 나머지는 "+(n1%n2)+"입니다.");
			}
		});
		btnNewButton_1_1.setFont(new Font("문체부 훈민정음체", Font.PLAIN, 18));
		btnNewButton_1_1.setBounds(149, 281, 95, 44);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("곱하기");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				JOptionPane.showMessageDialog(f, "곱한 값은 "+(n1*n2)+"입니다.");
			}
		});
		btnNewButton_2.setFont(new Font("문체부 훈민정음체", Font.PLAIN, 18));
		btnNewButton_2.setBounds(36, 281, 95, 44);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
		
		
	}

}
