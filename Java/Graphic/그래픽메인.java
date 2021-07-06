package 그래픽;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽메인 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(700, 500);
		
		//버튼 생성
		JButton b1 = new JButton("나는 왼쪽");
		JButton b2 = new JButton("나는 오른쪽");
		JButton b3 = new JButton("나는 가운데");
		JButton b4 = new JButton("나는 아래쪽");
		JButton b5 = new JButton("나는 위쪽");
		
		//버튼 눌렀을 때 반응을 보여조!
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Left left = new Left();
				left.left();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Right right = new Right();
				right.right();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Center center = new Center();
				center.center();
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Down down = new Down();
				down.down();
			}
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// b1을 눌렀을 때 처리하는 내용을 쓴다.
				Up up = new Up();
				up.up();
			}
		});
		
		//버튼 위치 지정
		f.add(b1, BorderLayout.WEST);
		f.add(b2, BorderLayout.EAST);
		f.add(b3, BorderLayout.CENTER);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.NORTH);
		
		//버튼 백그라운드 컬러
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.green);
		b4.setBackground(Color.gray);
		b5.setBackground(Color.red);
		
		//버튼 폰트 생성 (글꼴, 필체, 크기) & 적용
		Font font = new Font("궁서", Font.BOLD, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		
		f.setVisible(true);
		

	}

}
