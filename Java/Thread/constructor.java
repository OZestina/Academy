package 쓰레드0812;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Graphic1 extends JFrame{
	
	//static이라고 붙으면 객체를 생성하지 않아도 CPU가 바로 호출해서 사용할 수 있다
	//멤버변수가 있으면 static메서드에서 바로 사용 불가능
	//전역변수에도 static을 붙여주면 객체를 생성하지 않아도 static 메서드 안에서 접근 가능하다
	//static은 RAM에 상주한다. 언제든지 cpu가 접근해서 사용 가능하다
	
  //Inner class에서 사용할 수 있도록 객체 선언
	JLabel count, image, timer; 
	
  //class 객체가 생성되자 마자 바로 프로그램이 실행되도록
  //생성자 안에 코드 작성
	public Graphic1() {
		setSize(1200, 350);
		setTitle("나의 스레드 프로그램");
		
		count = new JLabel("카운트 들어가는 부분");
		image = new JLabel();
		timer = new JLabel("타이머 들어가는 부분");
		add(count, BorderLayout.WEST);
		add(image);
		add(timer, BorderLayout.SOUTH);
		
		Font font = new Font("궁서",Font.BOLD,40);
		Font font2 = new Font("궁서",Font.BOLD,30);
		count.setFont(font);
		timer.setFont(font2);

		Count thread1 = new Count();	//카운트
		Image thread2 = new Image();	//이미지
		Timer thread3 = new Timer();	//현재시간
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		setVisible(true);
	}
	
	//클래스 간 변수를 공유할 목적으로 클래스 내에 클래스를 끼워 넣을 수 있음
	//내부 클래스 (inner class)
	//내부로 끼워진 클래스는 독립적으로 다른 곳에서 사용될 수 없다...
	public class Count extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i -= 5) {
				count.setText("count>> "+i);
				try {
					Thread.sleep(200);//밀리세컨즈 단위
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class Image extends Thread {
		@Override
		public void run() {
			String[] list = {"1.jpg","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.jpg","9.jpg","10.jpg"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(1000);//밀리세컨즈 단위
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public class Timer extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				Date date = new Date();
				timer.setText(date+""); //String으로 만들어주려고 일부러 +"" 함
				try {
					Thread.sleep(200);//밀리세컨즈 단위
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Graphic1 s = new Graphic1();
	}
  
}//end of class
