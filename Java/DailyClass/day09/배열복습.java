package �迭���;

public class �迭���� {

	public static void main(String[] args) {

		//���� �˰� �־��
		//���� �ٷ� �����ϸ鼭 �迭�� ������ ���ϰ� �� 
		int[] num = {100, 200, 300};
		num[1] = 500;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i : num) {
			System.out.println(i);
		}
		
		//���� ���� �����
		int[] num2 = new int[3];	//{0,0,0}���� �ڵ� �ʱ�ȭ
		num2[0]=1000;
		num2[num2.length-1] = 1000;
		for (int i : num2) {
			System.out.println(i);
		}
		
	}

}
