package 그래픽;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlusMinus {
	static int result = 0;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200, 200);
		f.getContentPane().setLayout(null);
		
		JLabel l = new JLabel("0");
		l.setFont(new Font("HY궁서", Font.PLAIN, 40));
		l.setBounds(74, 47, 81, 55);
		f.getContentPane().add(l);
		
		JButton b1 = new JButton("Minus");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result--;
				l.setText(String.valueOf(result));
			}
		});
		b1.setBounds(42, 14, 97, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("Plus");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result++;
				l.setText(String.valueOf(result));
			}
		});
		b2.setBounds(42, 112, 97, 23);
		f.getContentPane().add(b2);
		
		f.setVisible(true);

	}
}
