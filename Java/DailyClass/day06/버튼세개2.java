package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class 버튼세개2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("My 3 Buttons");	//괄호 안에 String 넣으면 프로그램 상단바에 제목 들어감
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 500);
		
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("자동차");
		b.setFont(new Font("굴림", Font.BOLD, 50));
		b.setBounds(12, 10, 460, 221);	//x,y좌표 및 크기(가로세로)
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("");
		m.setBounds(12, 241, 460, 210);
		f.getContentPane().add(m);
		
		ImageIcon img1 = new ImageIcon("flower.jpg");
		ImageIcon img2 = new ImageIcon("flower3.jpg");
		
		b.setIcon(img1);
		m.setIcon(img2);
	
		
		f.setVisible(true);
		

	}
}
