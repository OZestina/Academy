package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		//프레임 생성
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저를 누르셨군요");
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 18));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(101, 346, 132, 40);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("버튼2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("저도 누르셨군요");
			}
		});
		btnNewButton_1.setForeground(Color.LIGHT_GRAY);
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 18));
		btnNewButton_1.setBounds(264, 346, 132, 40);
		f.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(232, 71, 116, 27);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(118, 71, 57, 29);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(118, 108, 98, 29);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		textField_1.setBounds(232, 108, 116, 27);
		f.getContentPane().add(textField_1);
		f.setVisible(true);	//true visible	//visible은 맨 마지막에 나와야 한다
		
		//WindowBuilder는 위의 세 줄을 작성하고 실행 (프레임 선언, 크기 설정, visible)
		//builder 실행 전 프레임이 잘 뜨는지 확인하자 
		
	}
}
