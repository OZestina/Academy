package �迭���;

import java.util.Random;
import java.util.Scanner;

public class �����Է�2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] score = new int[1000];
		int sum = 0;
		
		//���� �ѹ��� ���� �Է� (1000ȸ)
		for (int i = 0; i < score.length; i++) {
			Random r = new Random();
			score[i] = r.nextInt(101);	//0~100 ����
			
			//System.out.println(score[i]);//�����ѹ� ���� Ȯ�ο�
		}
		
		//���� ���
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		//��հ� ����Ʈ
		System.out.println("��� ������ "+(sum/score.length)+"�Դϴ�");
		
	}

}
