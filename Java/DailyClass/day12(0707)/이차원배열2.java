package 그래픽문제;

public class 이차원배열2 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		int[] arr3 = new int[4];
		
		//삐뚤게 만들 수도 있다!
//		int[][] arrList = new int[3][];
//		arrList[0] = arr1;
//		arrList[1] = arr2;
//		arrList[2] = arr3;
		
		int[][] arrList = { {1,2,3}, {1,2,3,4,5}, {1,2,3,4}};
		
		
		System.out.println(arrList.length);
		System.out.println(arrList[0].length);
		System.out.println(arrList[1].length);
		System.out.println(arrList[2].length);
		System.out.println("======================");
		
		arrList[1][1] = 1;
		arrList[1][3] = 1;
		arrList[2][3] = 1;
		
		for (int i = 0; i < arrList.length; i++) {
			for (int j = 0; j < arrList[i].length; j++) {
				System.out.print(arrList[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
