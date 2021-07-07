package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매 {

	static boolean flag = false; // 36. 버튼 활성/비활성 트리거로 boolean flag 선언 (초기값은 false로)
	
	public static void main(String[] args) {
		
		final int BUTTON = 200; 
		int[] seat = new int[BUTTON];
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList list = new ArrayList();
		
		JFrame f = new JFrame("영화예매그래픽 버전");
		f.setSize(570, 800);
		
		//flow 변경
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//for문으로 버튼 여러개 만들기 (+눌렀을 때 반응도 포함)
		for (int i = 0; i < BUTTON; i++) {
			JButton b = new JButton(String.valueOf(i)); //i+""
			
			b.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int count = 0;
					
					String s = e.getActionCommand();
//					System.out.println(e.getSource());
					list.add(e.getSource());
					int index = Integer.parseInt(s);
					
					if (flag) {
						seat[index] = 0;		//상수화된 int가 들어가야함
						JOptionPane.showMessageDialog(f, index+"번 예약 취소됨");
						b.setBackground(null);
						count--;
						
						flag = false;
						
					} else {
						
						seat[index] = 1;		//상수화된 int가 들어가야함
						JOptionPane.showMessageDialog(f, index+"번 예약됨");
						b.setBackground(Color.yellow);
						count++;
						
						flag = true;

					}
					
				}
			});
			f.add(b);
		}
		
		//결제버튼
		JButton b2 = new JButton(">>>>>> 결제하기 <<<<<<");
		b2.setBackground(Color.pink);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int sum = 0;	//총 좌석 수 count
				final int COST = 10000;
				String k = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1) {
						sum++;
						k += i +"번 ";
					}
				}
				JOptionPane.showMessageDialog(f, k+". 총 "+sum+"자리 선택. ");
				JOptionPane.showMessageDialog(f, (sum*COST)+"원입니다.");
				
				//////////////////////////////////////////////////////////////////////////////////////
				for (Object x : list) {
					
					JButton b = (JButton)x;
					//버튼 비활성화
					b.setEnabled(false);
					b.setBackground(Color.DARK_GRAY);
					
				}
				
			}
			
		});
		
		
		
		f.add(b2);
		
		
		
		f.setVisible(true);

	}

}
