package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practice11 {
	private static JTextField tN1;
	private static JTextField tN2;

	static int count = 0; //시행횟수 카운팅용
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC790 \uD06C\uAE30 \uD310\uBCC4\uAE30");
		lblNewLabel.setFont(new Font("궁서체", Font.PLAIN, 30));
		lblNewLabel.setBounds(77, 23, 262, 41);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC2E4\uD589\uD69F\uC218");
		lblNewLabel_1.setBounds(216, 74, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uCCAB \uBC88\uC9F8 \uC218");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(53, 123, 109, 24);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uB450 \uBC88\uC9F8 \uC218");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(53, 171, 109, 24);
		f.getContentPane().add(lblNewLabel_2_1);
		
		tN1 = new JTextField();
		tN1.setBounds(184, 117, 156, 31);
		f.getContentPane().add(tN1);
		tN1.setColumns(10);
		
		tN2 = new JTextField();
		tN2.setColumns(10);
		tN2.setBounds(184, 166, 156, 31);
		f.getContentPane().add(tN2);
		
		JLabel lblNewLabel_3 = new JLabel("============================================");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel_3.setBounds(5, 273, 373, 15);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel tResult = new JLabel("");
		tResult.setBackground(Color.PINK);
		tResult.setForeground(Color.BLACK);
		tResult.setFont(new Font("굴림", Font.BOLD, 20));
		tResult.setBounds(26, 298, 327, 41);
		f.getContentPane().add(tResult);
		
		JLabel tCount = new JLabel("");
		tCount.setBounds(283, 73, 57, 15);
		f.getContentPane().add(tCount);
		
		//버튼!
		JButton btnNewButton = new JButton("\uACB0\uACFC \uAD6C\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String num1 = tN1.getText();
				String num2 = tN2.getText();
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				
				if (n1>n2) {
					tResult.setText("첫 번째 숫자가 더 큽니다");
				} else if (n1<n2) {
					tResult.setText("두 번째 숫자가 더 큽니다");
				} else {
					tResult.setText("두 수가 같습니다");
				}
				
				//시행횟수add 및 출력 
				count++;
				String c = String.valueOf(count);
				tCount.setText(c);
				
				
				
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBounds(124, 224, 120, 39);
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);

	}
}
