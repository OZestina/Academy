package 그래픽문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 뮤지컬예매 {

	public static void main(String[] args) {
		
		//필요 배열, 변수
		final int SEAT = 196;	//총 좌석 수
		int[] booked = new int[SEAT];	//좌석 예약용 배열
		final int VIP = 15000;		//vip 좌석 가격
		final int NOR = 10000;		//보통 좌석 가격
		final int VIPSEAT = 73;		//vip좌석은 몇번까지?
		
		//프레임 생성
		JFrame f = new JFrame("뮤지컬 좌석 예매");
		f.setSize(680, 700);
		
		//프레임 설정
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//폰트설정
		Font font = new Font("궁서",Font.BOLD,30);
		
		//무대를 클릭못하는 버튼으로 생성
		JButton bStage = new JButton("                      무대                      ");
		bStage.setFont(font);
		bStage.setEnabled(false);
		f.add(bStage);
		
		//좌석 버튼 생성
		for (int i = 1; i <= SEAT; i++) {
					
			JButton b = new JButton(String.valueOf(i));
			if (i<=VIPSEAT) {									//vip석 별도 컬러(pink)로 표시
				b.setBackground(Color.pink);
			}
			
			//좌석 버튼 클릭 시 (메시지 없이 클릭 안되는 버튼으로 변경)
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int index =Integer.parseInt(e.getActionCommand());
					booked[index-1] = 1;
					b.setEnabled(false);
					b.setBackground(Color.DARK_GRAY);
					//JOptionPane.showMessageDialog(f, index+"번 좌석 선택");
				}
			});
			
			f.add(b);
		}
		
		
		//결제버튼 생성
		JButton bPay = new JButton(">>> 결제하기 <<<");
		bPay.setBackground(Color.green);
		
		//결제 버튼 클릭 시 선택 좌석 및 금액(vip석, 일반석 나누어 계산한 총 금액) 표시
		bPay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//선택된 좌석 변수_번호 저장용 String & 숫자 count용 int  
				String totalSeat = "";
				int vipCount = 0;
				int count = 0;
				
				//String에 좌석 번호 저장
				for (int i = 0; i < booked.length; i++) {
					
					if (i <VIPSEAT+1) {
						if (booked[i] == 1) {
							totalSeat += (i+1) + "번 ";
							vipCount++;
						} 
					}else {
						if (booked[i] == 1) {
							totalSeat += (i+1) + "번 ";
							count++;
						}
					}
				}
				
				int price = VIP*vipCount + NOR*count;
				
				JOptionPane.showMessageDialog(f, totalSeat + " 선택됐습니다.");
				JOptionPane.showMessageDialog(f, "총 비용은"+price+"원 입니다.");
			}
		});
		f.add(bPay);
		
		f.setVisible(true);

	}

}
