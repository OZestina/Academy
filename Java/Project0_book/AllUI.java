package project_bookstore;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import db.MemberDB;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AllUI {
	private static JTextField mt1;
	private static JTextField mt2;
	private static JTextField mt3;
	private static JTextField mt4;
	private static JTextField mt5;
	private static JTextField bt1;
	private static JTextField bt2;
	private static JTextField bt3;
	private static JTextField bt4;
	private static JTextField bt5;
	private static JTextField bt6;
	private static JTextField bt7;
	private static JTextField pt1;
	private static JTextField pt2;
	private static JTextField pt3;
	private static JTextField pt4;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원");
		lblNewLabel.setFont(new Font("궁서", Font.BOLD, 20));
		lblNewLabel.setBounds(52, 16, 143, 27);
		f.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1.setBounds(52, 53, 143, 27);
		f.getContentPane().add(lblNewLabel_1);
		
		mt1 = new JTextField();
		mt1.setBounds(207, 56, 116, 21);
		f.getContentPane().add(mt1);
		mt1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(52, 90, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1);
		
		mt2 = new JTextField();
		mt2.setColumns(10);
		mt2.setBounds(207, 93, 116, 21);
		f.getContentPane().add(mt2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이름");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(52, 127, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		mt3 = new JTextField();
		mt3.setColumns(10);
		mt3.setBounds(207, 130, 116, 21);
		f.getContentPane().add(mt3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("휴대폰");
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(52, 164, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_1);
		
		mt4 = new JTextField();
		mt4.setColumns(10);
		mt4.setBounds(207, 167, 116, 21);
		f.getContentPane().add(mt4);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("주소");
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(52, 201, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		mt5 = new JTextField();
		mt5.setColumns(10);
		mt5.setBounds(207, 204, 116, 21);
		f.getContentPane().add(mt5);
		
		JLabel lblNewLabel_2 = new JLabel("도서등록");
		lblNewLabel_2.setFont(new Font("궁서", Font.BOLD, 20));
		lblNewLabel_2.setBounds(575, 16, 143, 27);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("책ID");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(571, 53, 143, 27);
		f.getContentPane().add(lblNewLabel_1_2);
		
		bt1 = new JTextField();
		bt1.setColumns(10);
		bt1.setBounds(726, 56, 116, 21);
		f.getContentPane().add(bt1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("도서명");
		lblNewLabel_1_1_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(571, 90, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_2);
		
		bt2 = new JTextField();
		bt2.setColumns(10);
		bt2.setBounds(726, 93, 116, 21);
		f.getContentPane().add(bt2);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("작가");
		lblNewLabel_1_1_1_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_2.setBounds(571, 127, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_2);
		
		bt3 = new JTextField();
		bt3.setColumns(10);
		bt3.setBounds(726, 130, 116, 21);
		f.getContentPane().add(bt3);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("장르");
		lblNewLabel_1_1_1_1_2.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_2.setBounds(571, 164, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		bt4 = new JTextField();
		bt4.setColumns(10);
		bt4.setBounds(726, 167, 116, 21);
		f.getContentPane().add(bt4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("가격");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(571, 201, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		bt5 = new JTextField();
		bt5.setColumns(10);
		bt5.setBounds(726, 204, 116, 21);
		f.getContentPane().add(bt5);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("판매량");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(571, 238, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		bt6 = new JTextField();
		bt6.setColumns(10);
		bt6.setBounds(726, 241, 116, 21);
		f.getContentPane().add(bt6);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("이미지");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(571, 275, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		bt7 = new JTextField();
		bt7.setColumns(10);
		bt7.setBounds(726, 278, 116, 21);
		f.getContentPane().add(bt7);
		
		JLabel lblNewLabel_2_1 = new JLabel("결제");
		lblNewLabel_2_1.setFont(new Font("궁서", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(56, 403, 143, 27);
		f.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("주문번호");
		lblNewLabel_1_2_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_2_1.setBounds(52, 440, 143, 27);
		f.getContentPane().add(lblNewLabel_1_2_1);
		
		pt1 = new JTextField();
		pt1.setColumns(10);
		pt1.setBounds(207, 443, 116, 21);
		f.getContentPane().add(pt1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("사용자ID");
		lblNewLabel_1_1_2_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_2_1.setBounds(52, 477, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_2_1);
		
		pt2 = new JTextField();
		pt2.setColumns(10);
		pt2.setBounds(207, 480, 116, 21);
		f.getContentPane().add(pt2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("도서ID");
		lblNewLabel_1_1_1_2_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_2_1.setBounds(52, 514, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_2_1);
		
		pt3 = new JTextField();
		pt3.setColumns(10);
		pt3.setBounds(207, 517, 116, 21);
		f.getContentPane().add(pt3);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("구매수량");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_2_1.setBounds(52, 551, 143, 27);
		f.getContentPane().add(lblNewLabel_1_1_1_1_2_1);
		
		pt4 = new JTextField();
		pt4.setColumns(10);
		pt4.setBounds(207, 554, 116, 21);
		f.getContentPane().add(pt4);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String 입력
				String memid = mt1.getText();
				String pw = mt2.getText();
				String name = mt3.getText();
				String tel = mt4.getText();
				String addr = mt5.getText();
				
				MemberDAO db = new MemberDAO();
				try {
					int result = db.create(memid, pw, name, tel, addr);//성공시 1 반환
					if (result ==1) {
						JOptionPane.showMessageDialog(f, "가입 성공");
					}else {
						JOptionPane.showMessageDialog(f, "가입 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				mt1.setText(null);
				mt2.setText(null);
				mt3.setText(null);
				mt4.setText(null);
				mt5.setText(null);
			}
		});
		btnNewButton.setBounds(52, 292, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원정보수정");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//id 및 수정할 항목 및 수정 정보 입력
				String id = JOptionPane.showInputDialog(f, "정보를 수정할 id입력");
				String opt = JOptionPane.showInputDialog(f, "수정할 항목 선택 (pw, name, tel, addr)");
				String change = JOptionPane.showInputDialog(f, "수정할 정보 입력");
				//db 처리
				MemberDAO db = new MemberDAO();
				
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
		btnNewButton_1.setBounds(161, 292, 104, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("회원탈퇴");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//id입력받아야함
				String id = JOptionPane.showInputDialog(f, "탈퇴할 id입력");
				//db 처리
				MemberDAO db = new MemberDAO();
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
		btnNewButton_1_1.setBounds(277, 292, 97, 23);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("도서등록");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String 입력
				String bookname = bt2.getText();
				String writer = bt3.getText();
				String genre = bt4.getText();
				String price1 = bt5.getText();
				int price = Integer.parseInt(price1);
				String sold1 = bt6.getText();
				int sold = Integer.parseInt(sold1);
				String image = bt7.getText();
				
				BookDAO db = new BookDAO();
				try {
					int result = db.create(bookname,  writer,  genre, price, sold, image);//성공시 1 반환
					if (result ==1) {
						JOptionPane.showMessageDialog(f, "도서 등록 성공");
					}else {
						JOptionPane.showMessageDialog(f, "도서 등록 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				bt1.setText(null);
				bt2.setText(null);
				bt3.setText(null);
				bt4.setText(null);
				bt5.setText(null);
				bt6.setText(null);
				bt7.setText(null);
				
				
			}
		});
		btnNewButton_2.setBounds(745, 332, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("결제하긔><");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//String 입력
				String memid = pt2.getText();
				String bookid = pt3.getText();
				String qty1 = pt4.getText();
				int qty = Integer.parseInt(qty1);
				
				PayDAO db = new PayDAO();
				try {
					int result = db.create(memid, bookid, qty);//성공시 1 반환
					if (result ==1) {
						JOptionPane.showMessageDialog(f, "결제 성공");
					}else {
						JOptionPane.showMessageDialog(f, "결제 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				pt1.setText(null);
				pt2.setText(null);
				pt3.setText(null);
				pt4.setText(null);
			}
		});
		btnNewButton_3.setBounds(226, 621, 97, 23);
		f.getContentPane().add(btnNewButton_3);
		
		
		
		f.setVisible(true);
		

	}
}
