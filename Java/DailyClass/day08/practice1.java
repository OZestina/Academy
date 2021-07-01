package practice;

public class practice1 {

	public static void main(String[] args) {
		
		String[] subjects = {"국어","영어","수학","컴퓨터","회화"};
		int[] sem1 = {44,66,22,99,100};
		int[] sem2 = sem1.clone();
		sem2[0] = 22;
		sem2[2] = 88;
		
		//0) 전체 1학기/2학기 성적 프린트
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < sem1.length; i++) {
			System.out.print(sem1[i]+"  ");
		}
		System.out.println();
		for (int i = 0; i < sem2.length; i++) {
			System.out.print(sem2[i]+"  ");
		}
		System.out.println();
		
		//1) 1학기 vs 2학기 성적 중 동일한 성적 과목 수
		int count = 0;
		for (int i = 0; i < sem1.length; i++) {
			if (sem1[i]==sem2[i]) {
				count++;
			}
		}
		System.out.println("1학기와 점수가 통일한 과목의 수: "+count);

		//2) 1학기보다 2학기에 성적이 오른 과목 수
		int count2 = 0;
		String[] upgrade = new String[sem1.length];
		for (int i = 0; i < sem1.length; i++) {
			if (sem1[i]<sem2[i]) {
				upgrade[count2] = subjects[i];
				count2++;
			}
		}
		
		//3) 성적이 오른 과목 명
		System.out.println("성적이 오른 과목의 수: "+count2);
		
		System.out.print("성적이 오른 과목: ");
		for (int i = 0; i < upgrade.length; i++) {
			if(upgrade[i]!=null) {
				System.out.print(upgrade[i]+" ");
			}
		}
		
	}

}
