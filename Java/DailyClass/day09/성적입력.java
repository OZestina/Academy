package �迭���;

import java.util.Scanner;

public class �����Է� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[1000];
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			System.out.print("������ �Է��ϼ���>> ");
			score[i] = sc.nextInt();
		}
		
		//���� ���
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		//��հ� ����Ʈ
		System.out.println("��� ������ "+(sum/score.length)+"�Դϴ�");
		
	}

}
