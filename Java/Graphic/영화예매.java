package �׷��ȹ���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ��ȭ���� {

	static boolean flag = false; // 36. ��ư Ȱ��/��Ȱ�� Ʈ���ŷ� boolean flag ���� (�ʱⰪ�� false��)
	
	public static void main(String[] args) {
		
		final int BUTTON = 200; 
		int[] seat = new int[BUTTON];
		////////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList list = new ArrayList();
		
		JFrame f = new JFrame("��ȭ���ű׷��� ����");
		f.setSize(570, 800);
		
		//flow ����
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//for������ ��ư ������ ����� (+������ �� ������ ����)
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
						seat[index] = 0;		//���ȭ�� int�� ������
						JOptionPane.showMessageDialog(f, index+"�� ���� ��ҵ�");
						b.setBackground(null);
						count--;
						
						flag = false;
						
					} else {
						
						seat[index] = 1;		//���ȭ�� int�� ������
						JOptionPane.showMessageDialog(f, index+"�� �����");
						b.setBackground(Color.yellow);
						count++;
						
						flag = true;

					}
					
				}
			});
			f.add(b);
		}
		
		//������ư
		JButton b2 = new JButton(">>>>>> �����ϱ� <<<<<<");
		b2.setBackground(Color.pink);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int sum = 0;	//�� �¼� �� count
				final int COST = 10000;
				String k = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i]==1) {
						sum++;
						k += i +"�� ";
					}
				}
				JOptionPane.showMessageDialog(f, k+". �� "+sum+"�ڸ� ����. ");
				JOptionPane.showMessageDialog(f, (sum*COST)+"���Դϴ�.");
				
				//////////////////////////////////////////////////////////////////////////////////////
				for (Object x : list) {
					
					JButton b = (JButton)x;
					//��ư ��Ȱ��ȭ
					b.setEnabled(false);
					b.setBackground(Color.DARK_GRAY);
					
				}
				
			}
			
		});
		
		
		
		f.add(b2);
		
		
		
		f.setVisible(true);

	}

}
