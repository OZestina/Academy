package 문제풀이;

import java.util.Scanner;

public class 피라미드2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇층까지 쌓을래요?: ");
		int floor = sc.nextInt();
		
		for (int i = 0; i < floor; i++) {
			
			for (int j = 0; j < (floor*2)-1 ; j++) {
				
				if ((floor-1-i)<=j && j<floor+i) {
					System.out.print("◈");
				} else {
					System.out.print(" ");
				}
				
			}//j_for
			System.out.println();
			
		}//i_for
		
	}

}
