package 조모임;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Button5 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("MiniGame");
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String many = JOptionPane.showInputDialog("몇 번 울릴래요? (숫자입력)");
				int time = Integer.parseInt(many);
								
				for(int i = 0; i<time; i++) {
					JOptionPane.showMessageDialog(f, "빵!");
				}
			}
		});
		b1.setBounds(34, 84, 100, 100);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				int num = r.nextInt(5);
				switch (num) {
				case 1:
					JOptionPane.showMessageDialog(f, "짜장면을 드시오.");
					break;
				case 2:
					JOptionPane.showMessageDialog(f, "우동을 드시오.");
					break;
				case 3:
					JOptionPane.showMessageDialog(f, "파스타를 드시오.");
					break;
				case 4:
					JOptionPane.showMessageDialog(f, "김밥을 드시오.");
					break;
				default:
					JOptionPane.showMessageDialog(f, "비빔밥을 드시오.");
					break;
				}
				
			}
		});
		b2.setBounds(145, 84, 100, 100);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String year = JOptionPane.showInputDialog(f, "언제 태어나셨나요? (예:1990)");
				int animal = Integer.parseInt(year)%12;
				
				switch (animal) {
				case 0:
					JOptionPane.showMessageDialog(f, "원숭이띠에요");
					break;
				case 1:
					JOptionPane.showMessageDialog(f, "닭띠에요");
					break;
				case 2:
					JOptionPane.showMessageDialog(f, "개띠에요");
					break;
				case 3:
					JOptionPane.showMessageDialog(f, "돼지띠에요");
					break;
				case 4:
					JOptionPane.showMessageDialog(f, "쥐띠에요");
					break;
				case 5:
					JOptionPane.showMessageDialog(f, "소띠에요");
					break;
				case 6:
					JOptionPane.showMessageDialog(f, "호랑이띠에요");
					break;
				case 7:
					JOptionPane.showMessageDialog(f, "토끼띠에요");
					break;
				case 8:
					JOptionPane.showMessageDialog(f, "용띠에요");
					break;
				case 9:
					JOptionPane.showMessageDialog(f, "뱀띠에요");
					break;
				case 10:
					JOptionPane.showMessageDialog(f, "말띠에요");
					break;
				default:
					JOptionPane.showMessageDialog(f, "양띠에요");
					break;
				}
			}
		});
		b3.setBounds(257, 84, 100, 100);
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = JOptionPane.showInputDialog(f, "몇 번째 한글 자음이 궁금한가요? (1~14)");
				int a1 = Integer.parseInt(a);
				
				String korean = "가나다라마바사아자차카타파하";
				
				if(a1<1) {
					JOptionPane.showMessageDialog(f, "1이상 14이하의 수를 입력하세요.");
				}else if(a1>14) {
					JOptionPane.showMessageDialog(f, "매국노! 한글 자음은 14개라구요!");
				}else {
					JOptionPane.showMessageDialog(f, korean.charAt(a1-1)+"입니다!");
				}
			}
		});
		b4.setBounds(94, 213, 100, 100);
		f.getContentPane().add(b4);
		
		JButton b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b5.setBounds(206, 213, 100, 100);
		f.getContentPane().add(b5);
		
		
		ImageIcon img1 = new ImageIcon("car.png");
		ImageIcon img2 = new ImageIcon("question.png");
		ImageIcon img3 = new ImageIcon("animal.jpg");
		ImageIcon img4 = new ImageIcon("king.png");
		
		b1.setIcon(img1);
		b2.setIcon(img2);
		b3.setIcon(img3);
		b4.setIcon(img4);
		
		JLabel lblNewLabel = new JLabel("간지작살");
		lblNewLabel.setBounds(267, 59, 78, 15);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("내일 메뉴는");
		lblNewLabel_1.setBounds(157, 59, 78, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("왜이렇게 막혀?");
		lblNewLabel_1_1.setBounds(34, 59, 91, 15);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("조선의 궁궐");
		lblNewLabel_2.setBounds(102, 194, 77, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		
		f.setVisible(true);

	}

}
