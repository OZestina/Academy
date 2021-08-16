//Thread 사용하는 순
//1. 스레드 상속을 받은 클래스를 만든다
//2. 상속을 받은 클래스에서 run() 메서드를 오버라이드 한다
//   (동시에 처리하고 싶은 내용을 구현)
//	 run() 메서드는 객체.start()시 자동 실행
//3. 상속받아 만들어 놓은 스레드 클래스의 객체를 생성한다
//4. main에서 CPU에 등록을 한다 (객체.start(); 로 등록)

public class 동시1 extends Thread {
	
	//run 메서드를 오버라이드해서 구현해주면,
	//run메서드 내의 구현 부분이 동시에 처리가 된다
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("동시1>> "+i);
      try {
				Thread.sleep(200);                //밀리세컨즈 단위
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class 동시Main {

	public static void main(String[] args) {
  
		//thread 객체 생성
		동시1 thread1 = new 동시1();

		//CPU에 스레드를 동록
		thread1.start();
	}
}

