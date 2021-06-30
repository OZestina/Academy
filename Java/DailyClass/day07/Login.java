package 그래픽;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame("Log in");
		f.setSize(300, 400);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("ID");
		l1.setBounds(36, 52, 57, 15);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("PW");
		l2.setBounds(36, 111, 57, 15);
		f.getContentPane().add(l2);

		t1 = new JTextField();
		t1.setBounds(131, 49, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(131, 108, 116, 21);
		f.getContentPane().add(t2);

		JLabel ll = new JLabel("");
		ll.setBounds(36, 307, 211, 15);
		f.getContentPane().add(ll);

		JButton b1 = new JButton("Log in");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ID & PW 입력
				String id = t1.getText();
				String pw = t2.getText();
				// ID & PW 확인
				if (id.equals("root") && pw.equals("1111")) {
					ll.setText("로그인 완료");
					
				} else {
					
					ll.setText("로그인 실패");
				}
			}
		});
		b1.setBounds(36, 228, 97, 23);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("delete");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText(null);
			}
		});
		b2.setBounds(150, 228, 97, 23);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
