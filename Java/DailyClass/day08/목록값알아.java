package 배열생성;

public class 목록값알아 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "코끼리", "몽구스", "개새", "송충이"};
		int[] ages = {30,30,30,30,28};
		double[] eyes = {0.8,1.5,0.2,1.2,1.5};
		char[] genders = {'f','m','m','m','m'};
		boolean[] food = {false, true,false,false,true};
		
		for (int i = 0; i < food.length; i++) {
			System.out.println(names[i]+" "+ages[i]+" "+eyes[i]+" "+genders[i]+" "+food[i]);
		}
		
		
		//foreach를 써서 반복하기
		System.out.print("\nnames: ");
		for (String x : names) {
			System.out.print(x+ " ");
		}
		System.out.print("\nages: ");
		for (int x : ages) {
			System.out.print(x+ " ");
		}
		System.out.print("\neyes: ");
		for (double x: eyes) {
			System.out.print(x+ " ");
		}
		System.out.print("\ngenders: ");
		for (char  x : genders) {
			System.out.print(x+ " ");
		}
		System.out.print("\nfood: ");
		for (boolean x : food) {
			System.out.print(x+ " ");
		}

	}

}
