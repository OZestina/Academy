package 그래픽문제;

public class 이차원배열 {

	public static void main(String[] args) {
		
		int[][] s = new int[3][5];
		
		s[1][1] = 1;
		s[1][2] = 1;
		s[1][3] = 1;
		s[2][4] = 1;
		
//		System.out.println(s.length);
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[0].length; j++) {
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
