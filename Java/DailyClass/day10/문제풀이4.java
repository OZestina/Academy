package 문제풀이;

public class 문제풀이4 {

	public static void main(String[] args) {

		int[] n1 = {100,200,300};
		int[] n2 = n1;
		
		System.out.println("n1의 주소값: "+n1);
		System.out.println("n2의 주소값: "+n2);
		for (int i = 0; i < n1.length; i++) {
			System.out.print(n1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n2.length; i++) {
			System.out.print(n2[i]+" ");
		}
		System.out.println();
		System.out.println("============================");
		n1[0] = 500;
		for (int i = 0; i < n1.length; i++) {
			System.out.print(n1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n2.length; i++) {
			System.out.print(n2[i]+" ");
		}
		System.out.println();
		System.out.println("============================");
		int[] n3 = n1.clone();	//깊은 복사
		
		System.out.println("n1의 주소값: "+n1);
		System.out.println("n3의 주소값: "+n3);
		
		for (int i = 0; i < n1.length; i++) {
			System.out.print(n1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n3.length; i++) {
			System.out.print(n3[i]+" ");
		}
		System.out.println();
		System.out.println("============================");
		n1[0] = 700;
		for (int i = 0; i < n1.length; i++) {
			System.out.print(n1[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < n3.length; i++) {
			System.out.print(n3[i]+" ");
		}
		System.out.println();
		
	}

}
