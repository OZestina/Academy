package 배열생성;

public class 기본형배열 {

	public static void main(String[] args) {

		int[] s = new int[10];
		double[] s2 = new double[5];
		char[] s3 = new char[100];
		String[] s4 = new String[30];
		boolean[] s5 = new boolean[5];

		System.out.println("s: " + s);
		System.out.println("s[0]: " + s[0]);
		System.out.println("s2: " + s2);
		System.out.println("s2[0]: " + s2[0]);
		System.out.println("s3: " + s3);
		System.out.println("s3[0]: " + s3[0]);
		System.out.println("s4: " + s4);
		System.out.println("s4[0]: " + s4[0]);
		System.out.println(s4.length);

		System.out.println("s5: " + s5);
		for (int i = 0; i < s5.length; i++) {
			System.out.println("s5[" + i + "]: " + s5[i]);
		}

		System.out.println("s3: " + s3);	//텍스트와 함께라면 주소값 출력
		System.out.println(s3);	//char 배열에 저장된 모든 인자들 출력
		s3[1] = 'B';
		System.out.println(s3);
		System.out.println(" " + s3);

	}

}
