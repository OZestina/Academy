package 그래픽;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Up2 {

	public void up2() {
		
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		
		JButton b = new JButton("참 좋은 일이지요?");
		f.add(b);
		
		b.setBackground(Color.pink);
		
		f.setVisible(true);

	}

}
