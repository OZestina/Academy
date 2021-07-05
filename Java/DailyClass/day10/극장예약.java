package 배열응용;

import java.util.Scanner;

public class 극장예약 {

	public static void main(String[] args) {

		int[] seat = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };	//좌석 넘버 배열
		int[] book = new int[10];						//좌석 예매 확인용 배열
		int choice;										//선택지 입력용
		int total = 0;									//총 예매된 자리 count용
		final int MONEY = 10000;						//final이 붙으면 상수화!

		Scanner sc = new Scanner(System.in);

		while (true) {
			//좌석 넘버 배열 출력
			System.out.println("------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			
			//좌석 예매여부 배열 출력
			System.out.println("------------------------------");
			for (int i = 0; i < book.length; i++) {
				System.out.print(book[i] + "  ");
			}
			System.out.println();
			
			//좌석 예매
			System.out.print("예약하고 싶은 좌석번호를 입력하세요(종료는 -1)>> ");
			choice = sc.nextInt();
			//	-1 입력시 반복문 탈출
			if (choice == -1) {
				System.out.println();
				break;
			//	예약되지 않은 좌석 선택 시 예매 완료
			} else if (book[choice - 1] == 0) {
				book[choice - 1] = 1;
				System.out.println("예약되었습니다.");
				total++;
				System.out.println("총 "+total+"자리 예약되었습니다.");
				System.out.println();
			// 기 예약된 좌석 선택 시 워닝 메시지 출력 
			} else if (book[choice - 1] == 1) {
				System.out.println("이미 예약된 좌석입니다.");
				System.out.println("지금까지 총 "+total+"자리 예약되었습니다.");
				System.out.println();
			} 
		}//while 
		
		//선택 좌석 하나 하나 출력 시
		System.out.print("선택하신 좌석은");
		for (int i = 0; i < book.length; i++) {
			if (book[i]==1) {
				System.out.print(" " +(i+1));
				//total++;
			}
		}
		System.out.println("입니다.");
		
		//선택 좌석 String으로 더해서 출력 시
		String sum = "";
		for (int i = 0; i < book.length; i++) {
			if (book[i]==1) {
				sum = sum + (i+1) + "번 ";
			}
		}
		System.out.println("예약된 자리 목록는 "+sum+"입니다.");
		
		//총 지불 금액 계산
		System.out.println("지불하실 총 금액은 "+(total*MONEY)+"원입니다.");

		sc.close();
	}

}
