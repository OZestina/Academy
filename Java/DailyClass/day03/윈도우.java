package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 {

	public static void main(String[] args) {
		//프레임 생성
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		//버튼 생성
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		b1.setText("나는 첫 번째 버튼");
		b2.setText("나는 두 번째 버튼");
		//버튼을 프레임에 표기
		f.add(b1);
		f.add(b2);
		//버튼(구성요소)를 flow대로 레이아웃 정렬
		FlowLayout flow = new FlowLayout(); 
		f.setLayout(flow);
		
		
		f.setVisible(true);	//true visible	//visible은 맨 마지막에 나와야 한다
	}

}
