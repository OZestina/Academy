package �迭���;

import java.util.Scanner;

public class �α���ǥ101 {

	public static void main(String[] args) {
		// console �Է��� ���� Scanner ����
		Scanner sc = new Scanner(System.in);

		// ��ǥ �ɼ� ����Ʈ ����
		String[] name = { "������", "���缮", "BTS" };
		// ��ǥ ���� ����� �迭 ����
		int[] votes = new int[3];
		// �� ��ǥ �� ���� ����
		int total = 0;

		// ��ǥ ���
		while (true) {
			System.out.println("�α���ǥ 1)������ 2)���缮 3)BTS ... 4)����");
			System.out.print("���ù�ȣ>> ");
			int v = sc.nextInt();

			if (v == 1) {
				votes[v - 1]++;
				total++;
				System.out.println(name[v - 1] + "��/�� �� ǥ ȹ��");
				System.out.println();
			} else if (v == 2) {
				votes[v - 1]++;
				total++;
				System.out.println(name[v - 1] + "��/�� �� ǥ ȹ��");
				System.out.println();
			} else if (v == 3) {
				votes[v - 1]++;
				total++;
				System.out.println(name[v - 1] + "��/�� �� ǥ ȹ��");
				System.out.println();
			} else if (v == 4) {
				System.out.println("��ǥ�� �����մϴ�.");
				System.out.println();
				break;
			} else {
				System.out.println("1~4�� ������ �Է����ּ���.");
				System.out.println();
			}
		}
		
		// ��ǥ ���� �� ��� ��� 
		System.out.println("[��ǥ���]");
		for (int i = 0; i < votes.length; i++) {
			System.out.println(name[i] + ": " + votes[i] + "ǥ");
		}
		System.out.println("��ü ��ǥ ��: " + total + "ȸ");

	}//main

}
