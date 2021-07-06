package 배열응용;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		
		String s1 = "    감자    ";
		System.out.println(s1.length());

		//trim
		String s2 = s1.trim();
		System.out.println(s2.length());
		
		//replace
		String s3 = s1.replace("    ", "");
		System.out.println(s3.length());
		
		String data = "감자, 고구마, 양파, 감자, 고구마, 양파, 양파  ";
		System.out.println(data.length());
		String data2 = data.trim();
		System.out.println(data2.length());
		String data3 = data.replace(" ", "");
		System.out.println(data3);
		
		
		
		int[] num = {1,2,5,10,4,20};
		Arrays.sort(num);
		
		
		for (int i : num) {
			System.out.print(i+" ");
		}
				
	}

}
