package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {

		// Date 클래스 활용을 위한 선언
		Date date = new Date();

		// 나이 및 태어난 시각 입력
		String age0 = JOptionPane.showInputDialog("올해 나이 입력");
		String time0 = JOptionPane.showInputDialog("태어난 시각 입력");

		// String=>int 변환
		int age = Integer.parseInt(age0);
		int time = Integer.parseInt(time0);

		// 출생연도 계산 및 출력
		int thisYear = date.getYear() + 1900; // 올해 연도
		if(age<=0) {
			System.out.println("아직 태어나지 않았습니다");
		} else {
			System.out.println("태어난 연도는 " + (thisYear - age + 1) + "년입니다");
		}

		// 태어난 시각 계산 및 출력
		if (8 <= time && time < 12) {
			System.out.println("오전에 태어나셨군요");
		} else if (time < 0) {
			System.out.println("언제 태어나신건가요..?");
		} else if (0 <= time && time < 8) {
			System.out.println("새벽에 태어나셨군요");
		} else if (time < 20) {
			System.out.println("오후에 태어나셨군요");
		} else if (time <= 24) {
			System.out.println("밤에 태어나셨군요");
		} else {
			System.out.println("하루의 시간이 24시간이 넘는 다른 차원에서 오셨군요");
		}
	}
}
