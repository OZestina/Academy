package 자바기본;

import java.util.Scanner;

public class 입출력 {

	public static void main(String[] args) {
		
		//콘솔과 자바 프로그램 간 입력 스트림(입력용 연결통로)을 만든다
		Scanner sc = new Scanner(System.in);
    
    //입력을 받는 통로를 지정해주지 않으면 에러가 발생한다
    Scanner sc = new Scanner(); //에러발생!
    //에러의 원인) Scanner 클래스가 기본 생성자를 만들어두지 않았기 대문에 호출할 수 없다
		//기본 생성자는 *다른 파라미터 있는 생성자가 없는 경우에만* 자동으로 생성됨
    //Scanner의 경우 다른 생성자가 이미 생성돼있고, 기본 생성자를 지정하지 않았기 때문에 사용할 수 없는 것
       
		//입력 스트림을 닫는다 - 사용하지 않는 메모리는 그때그때 정리하자
		sc.close();
		
	}

}
