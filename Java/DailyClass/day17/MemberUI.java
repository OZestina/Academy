package db;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setBounds(40, 42, 98, 32);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(152, 42, 116, 28);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(152, 84, 116, 28);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(40, 84, 98, 32);
		f.getContentPane().add(lblNewLabel_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(152, 128, 116, 28);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(40, 128, 98, 32);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(152, 170, 116, 28);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(40, 170, 98, 32);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1~t4에 입력된 값을 가지고 오긔
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//member table에 저장하려고 함
				//=> 해당 기능의 메소드를 사용할 수 있도록 클래스를 찾아 램에 가져다 놓아야함
				MemberDB db = new MemberDB();
				try {
					int result = db.create(id, pw, name, tel);//성공시 1 반환
					if (result ==1) {
						JOptionPane.showMessageDialog(f, "가입 성공");
					}else {
						JOptionPane.showMessageDialog(f, "가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				
			}
		});
		btnNewButton.setFont(new Font("궁서", Font.BOLD, 25));
		btnNewButton.setBounds(41, 247, 97, 81);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("수정");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id 및 수정할 항목 및 수정 정보 입력
				String id = JOptionPane.showInputDialog(f, "정보를 수정할 id입력");
				String opt = JOptionPane.showInputDialog(f, "수정할 항목 선택 (pw, name, tel)");
				String change = JOptionPane.showInputDialog(f, "수정할 정보 입력");
				//db 처리
				MemberDB db = new MemberDB();
				
				int result;
				try {
					result = db.update(id, opt, change);
					if (result ==1) {
						JOptionPane.showMessageDialog(f, "수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "수정 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("궁서", Font.BOLD, 25));
		btnNewButton_1.setBounds(151, 247, 97, 81);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("탈퇴");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//id입력받아야함
				String id = JOptionPane.showInputDialog(f, "탈퇴할 id입력");
				//db 처리
				MemberDB db = new MemberDB();
				try {
					int result = db.delete(id);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴 성공");
					}else {
						JOptionPane.showMessageDialog(f, "없는 id입니다");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1_1.setFont(new Font("궁서", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(260, 247, 97, 81);
		f.getContentPane().add(btnNewButton_1_1);
		
		f.setVisible(true);

	}
}
