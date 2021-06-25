package 문제풀이;

import java.util.Scanner;

import javax.swing.JOptionPane;
//import java.lang.*;

public class 순차문5 {
	
	public static void main(String[] args) {
		
		//메뉴 입력
		String meMenu = JOptionPane.showInputDialog("내가 먹고 싶은 음식은?");
		String friMenu = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");
		
		java.lang.
		
//		meMenu.equals(friMenu)
		System.out.println(meMenu.equals(meMenu));
		
		
		//메뉴가 같은지 비교
		if (meMenu.equals(friMenu)) {
			System.out.println("아하! 나랑 친구랑 같아요!");
		} else {
			System.out.println("ㅠㅠ 나랑 친구랑 달라요");
		}
	
		
	}

}
