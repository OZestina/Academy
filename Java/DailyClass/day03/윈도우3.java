package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		//프레임 생성_basic 3 lines
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(400, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(">>>>>>>>>>>>>오늘의 일기 작성을 시작합니다<<<<<<<<<<<<<");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(0, 181, 384, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(91, 215, 260, 21);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(91, 243, 260, 21);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(91, 274, 260, 21);
		f.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(91, 305, 260, 156);
		f.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("번호");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2.setBounds(22, 218, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("날짜");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(22, 246, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("제목");
		lblNewLabel_2_1_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(22, 277, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("내용");
		lblNewLabel_2_1_1_1.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(22, 307, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton = new JButton("일기저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "일기가 저장됐습니다.");
			}
		});
		btnNewButton.setBounds(37, 501, 97, 35);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("낙서장");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "아직 업데이트 전입니다.");
			}
		});
		btnNewButton_1.setBounds(146, 501, 97, 35);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("뭘까..?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "일기장이었습니다 (●'◡'●)");
			}
		});
		btnNewButton_1_1.setBounds(255, 501, 97, 35);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("나의 일기장");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("양재다운명조M", Font.PLAIN, 50));
		lblNewLabel.setBounds(55, 50, 292, 84);
		f.getContentPane().add(lblNewLabel);
		f.setVisible(true);
			
		}
	}

