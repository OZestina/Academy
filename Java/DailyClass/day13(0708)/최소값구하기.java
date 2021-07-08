package 알고리즘;

public class 최소값구하기 {

	public static void main(String[] args) {

		// 많은 양의 데이터를 정렬/검색하는 경우 배열에 저장
		int[] s = { 90, 80, 20, 60, 70 };
		
		//전체 n번 순회하면서 해당 인덱스까지의 최소값을 변수에 저장하는 알고리즘
		//초기값은 배열의 첫 번째 값을 넣어둔다 
		int min = s[0];
		
		for (int i = 1; i < s.length; i++) {
			if (min>s[i]) {
				min = s[i];
			}
		}
		
		System.out.println("최소값은 "+min+"입니다.");

	}

}
