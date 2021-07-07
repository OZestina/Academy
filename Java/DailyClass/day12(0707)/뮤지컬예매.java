package �׷��ȹ���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class �����ÿ��� {

	public static void main(String[] args) {
		
		//�ʿ� �迭, ����
		final int SEAT = 196;	//�� �¼� ��
		int[] booked = new int[SEAT];	//�¼� ����� �迭
		final int VIP = 15000;		//vip �¼� ����
		final int NOR = 10000;		//���� �¼� ����
		final int VIPSEAT = 73;		//vip�¼��� �������?
		
		//������ ����
		JFrame f = new JFrame("������ �¼� ����");
		f.setSize(680, 700);
		
		//������ ����
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//��Ʈ����
		Font font = new Font("�ü�",Font.BOLD,30);
		
		//���븦 Ŭ�����ϴ� ��ư���� ����
		JButton bStage = new JButton("                      ����                      ");
		bStage.setFont(font);
		bStage.setEnabled(false);
		f.add(bStage);
		
		//�¼� ��ư ����
		for (int i = 1; i <= SEAT; i++) {
					
			JButton b = new JButton(String.valueOf(i));
			if (i<=VIPSEAT) {									//vip�� ���� �÷�(pink)�� ǥ��
				b.setBackground(Color.pink);
			}
			
			//�¼� ��ư Ŭ�� �� (�޽��� ���� Ŭ�� �ȵǴ� ��ư���� ����)
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int index =Integer.parseInt(e.getActionCommand());
					booked[index-1] = 1;
					b.setEnabled(false);
					b.setBackground(Color.DARK_GRAY);
					//JOptionPane.showMessageDialog(f, index+"�� �¼� ����");
				}
			});
			
			f.add(b);
		}
		
		
		//������ư ����
		JButton bPay = new JButton(">>> �����ϱ� <<<");
		bPay.setBackground(Color.green);
		
		//���� ��ư Ŭ�� �� ���� �¼� �� �ݾ�(vip��, �Ϲݼ� ������ ����� �� �ݾ�) ǥ��
		bPay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���õ� �¼� ����_��ȣ ����� String & ���� count�� int  
				String totalSeat = "";
				int vipCount = 0;
				int count = 0;
				
				//String�� �¼� ��ȣ ����
				for (int i = 0; i < booked.length; i++) {
					
					if (i <VIPSEAT+1) {
						if (booked[i] == 1) {
							totalSeat += (i+1) + "�� ";
							vipCount++;
						} 
					}else {
						if (booked[i] == 1) {
							totalSeat += (i+1) + "�� ";
							count++;
						}
					}
				}
				
				int price = VIP*vipCount + NOR*count;
				
				JOptionPane.showMessageDialog(f, totalSeat + " ���õƽ��ϴ�.");
				JOptionPane.showMessageDialog(f, "�� �����"+price+"�� �Դϴ�.");
			}
		});
		f.add(bPay);
		
		f.setVisible(true);

	}

}
