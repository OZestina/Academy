package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼세개 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("My 3 Buttons");	//괄호 안에 String 넣으면 프로그램 상단바에 제목 들어감
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);//null: 레이아웃 지정 노노 (absolute)
		
		JButton btnNewButton = new JButton("별 10개");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i<10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(100, 100, 300, 60);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("커피*5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피");
					System.out.print("*");
					//System.out.print("커피*");
				}
				System.out.println();
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_1.setBounds(100, 170, 300, 60);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("커피*우유3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					//System.out.println("커피*우유");
					System.out.print("커피");
					System.out.print("*");
					System.out.println("우유");
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_1_1.setBounds(100, 240, 300, 60);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("n:짱!");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i+1)+" : 짱!");
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_1_1_1.setBounds(100, 310, 300, 60);
		f.getContentPane().add(btnNewButton_1_1_1);
		
		
		
		f.setVisible(true);
		

	}
}
