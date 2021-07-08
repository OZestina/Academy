package 이차원배열;

import java.util.ArrayList;
import java.util.HashSet;

public class 문제풀이 {

	public static void main(String[] args) {
		
		//동계올림픽 피겨 순위
		ArrayList figure = new ArrayList();
		figure.add("김연아");
		figure.add("김영아");
		figure.add("김양아");
		figure.add("김용아");
		
		for (int i = 0; i < figure.size(); i++) {
			System.out.println((i+1)+"위: "+figure.get(i));
		}
		System.out.println();
		System.out.println("4위가 반칙해서 실격처리됨");
		
		//4위 제외 및 순위 재출력
		figure.remove(3);
		for (int i = 0; i < figure.size(); i++) {
			System.out.println((i+1)+"위: "+figure.get(i));
		}
		
		System.out.println(figure.size());
		
		System.out.println();
		//아버지가방에들어가신다
		HashSet hashset = new HashSet();
		hashset.add("휴지");
		hashset.add("휴대폰");
		hashset.add("볼펜");
		hashset.add("휴지");
		
		System.out.println("가방에 들어간 물건의 수: "+hashset.size());
		System.out.println("가방에 들어간 물건: "+hashset);
		System.out.println(hashset.size());
		
		System.out.println();
		String[] kk = {"1","b","c"};
		
		System.out.println(kk.length);
		
		String a = "asdf";
		
		System.out.println(a.length());
		System.out.println( a.substring(1, 3)); 
		System.out.println(a);
		
		
		int[] s = {11, 22, 33};
		for (int x: s){
		     System.out.println(x);
		    }
		

	}

}
