package 문제풀이;

public class 깊은복사언제써 {

	public static void main(String[] args) {
		
		String[] subj = {"국어","영어","수학","컴퓨터","회화"};
		int[] term1 = {44,66,22,99,100};
		
	//배열의 깊은 복사 및 달라진 점수 변경
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		
	//0)전체 1학기, 2학기 성적 프린트
		System.out.print("1학기 성적: ");
		for (int i : term1) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n2학기 성적: ");
		for (int i : term2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	//1)1학기, 2학기 성적 중 동일한 성적 과목 수
	//2)1학기, 2학기 성적 중 오른 과목 수
	//3)1학기, 2학기 성적 중 오른 과목명
		
		int count = 0;	//동일한 성적 카운팅용
		int count2 = 0;	//오른 성적 카운팅용
		int location = -1;	//성적 오른 과목 인덱스 저장용
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]==term2[i]) {
				count++;
			} else if(term1[i]<term2[i]) {
				count2++;
				location = i;
			}
		}
		System.out.println("성적이 동일한 과목 수: "+count);
		System.out.println("성적이 오른 과목 수: "+count2);
		if (location!=-1) {
			System.out.println("성적이 오른 과목: "+subj[location]);
		} else {
			System.out.println("성적이 오른 과목: 없음");
		}
		
	}

}
