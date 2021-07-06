package 배열응용;

public class 성적확인문제 {

	public static void main(String[] args) {
		
		String[] subj = {"컴퓨터","국어","수학","영어","체육"};
		int[] term1 = {77,88,99,55,70};
		int[] term2 = {99,100,97,80,77};
		int location = -1;
		
		//1)성적이 2학기에 향상된 과목의 수 카운트
		int high = 0;
		for (int i = 0; i < term2.length; i++) {
			if(term1[i]<term2[i]) {
				high++;
			}
		}
		System.out.println("향상된 과목의 수는 "+high+"개 입니다.");
		
		//2)성적이 1,2학기 동일한 과목의 수 카운트
		int j = 0;
		int[] arr = new int[term2.length];
		
		int same = 0;
		for (int i = 0; i < term2.length; i++) {
			if(term1[i]==term2[i]) {
				same++;
				location = i;
				arr[j] = i;
				j++;
			}
		}
		System.out.println("점수가 동일한 과목의 수는 "+same+"개 입니다.");
		
		//3)성적이 1,2학기 동일한 과목명 프린트_int변수
		if (location!=-1) {
			System.out.println("점수가 동일한 과목: "+subj[location]);
		} else {
			System.out.println("3-1) 점수가 동일한 과목은 없습니다");
			
		}
		
		//3)성적이 1,2학기 동일한 과목명 프린트_for+if
		

		System.out.print("3) 점수가 동일한 과목은");
		for (int i = 0; i < term2.length; i++) {
			if(term1[i]==term2[i]) {
				System.out.print(" "+subj[i]);
			}
		}
		System.out.println("입니다.");
		
		//3-1)성적이 1,2학기 동일한 과목명 프린트_배열idx 저장 활용 (line 23, 29 참고)
		//배열의 값을 더한 값(sum)이 0이면 동일한 성적과목이 없는것!
		
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		if (sum==0) {
			System.out.print("3-1) 점수가 동일한 과목은 없습니다");
		} else {
			System.out.print("3-1) 점수가 동일한 과목은");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]!=0) {
					System.out.print(" "+subj[arr[i]]);
				}
			}
			System.out.println("입니다.");
		}

	}

}
