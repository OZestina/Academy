package 메서드반환값;

import java.util.Random;

public class 다양한리턴2 {
	
	public int get(int n) {
		return n*2;
	}
	public double get() {
		return 11.11;
	}
	public int[] get2() {
		int[] arr = {10,20,30,40,50};
		return arr; 
	}
	public Random get3() {
		Random r = new Random();
		return r;
	}

}
