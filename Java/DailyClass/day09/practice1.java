package practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c1 = 0, c2 = 0, c3 = 0;
		int[] num = new int[2];

		while (true) {

			// ���� �Է�
			System.out.println("���� ũ�� �Ǻ�");
			System.out.println("---------------");
			System.out.print("ù ��° ���� �Է�>> ");
			num[0] = sc.nextInt();
			System.out.print("�� ��° ���� �Է�>> ");
			num[1] = sc.nextInt();
			// ���� ũ�� �Ǻ�
			if (num[0] > num[1]) {
				System.out.println("�ǰ��� �ռ��ڰ� ũ��");
				c1++;
			} else if (num[0] < num[1]) {
				System.out.println("�ǰ��� �޼��ڰ� ũ��");
				c2++;
			} else {
				System.out.println("�ǰ��� �� ���ڰ� ����");
				c3++;
			}

			System.out.print("��� �Ͻðڽ��ϱ�(���:o, ����:x)>> ");
			while (true) {
				// ���� �ݺ� Ȯ��
				String con = sc.next();
				if (con.equals("o")) {
					System.out.println();
					break;
				} else if (con.equals("x")) {
					System.out.println("���α׷��� �����մϴ�.\n");
					// ���� ��� ���
					System.out.println("[���]");
					System.out.println("�� �õ� Ƚ��: " + (c1 + c2 + c3));
					System.out.println("�� ���ڰ� ū Ƚ��: " + c1);
					System.out.println("�� ���ڰ� ū Ƚ��: " + c2);
					System.out.println("���ڰ� ���� Ƚ��: " + c3);
					System.exit(0);
				}
				System.out.print("o�� x�θ� �Է��ϼ���(���:o, ����:x)>> ");
			}

		}

	}

}
