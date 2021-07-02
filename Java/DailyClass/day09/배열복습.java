package 배열사용;

public class 배열복습 {

	public static void main(String[] args) {

		//값을 알고 있어요
		//값을 바로 대입하면서 배열의 순서도 정하게 됨 
		int[] num = {100, 200, 300};
		num[1] = 500;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i : num) {
			System.out.println(i);
		}
		
		//값을 아직 몰라요
		int[] num2 = new int[3];	//{0,0,0}으로 자동 초기화
		num2[0]=1000;
		num2[num2.length-1] = 1000;
		for (int i : num2) {
			System.out.println(i);
		}
		
	}

}
