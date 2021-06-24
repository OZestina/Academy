package 복습;

public class 복습1 {

	public static void main(String[] args) {
		// 오늘을 나타내는 정보 기본데이터로 저장 및 출력

		int classNo = 8;
		char day = '목';
		String lunch = "'김치찜'";

		double todayTemp = 26.2;
		double yesTemp = 27.5;

		boolean tempSame = (todayTemp == yesTemp);
		boolean yesBig = (todayTemp < yesTemp);

		System.out.println("(●'◡'●) 수업 몇교시야? \n(❁´◡`❁) 오늘 수업 " + classNo + "교시");
		System.out.println("오늘은 " + day + "요일입니다.");
		System.out.println("오늘은 점심으로 " + lunch + "을/를 먹을거에요.");

		System.out.println("오늘 온도: " + todayTemp);
		System.out.println("어제 온도: " + yesTemp);
		System.out.println("오늘 온도: " + todayTemp);
		System.out.println("어제 온도: " + yesTemp);
		System.out.println("어제 온도와 오늘 온도가 동일한가요? " + (todayTemp == yesTemp));
		System.out.println("오늘 온도가 어제 온도보다 높은가요? " + (todayTemp > yesTemp));
		System.out.println("어제 온도와 오늘 온도가 동일한가요? " + tempSame);
		System.out.println("오늘 온도가 어제 온도보다 높은가요? " + !yesBig);

		// 오늘 온도가 29.2도로 상승했습니다!
		// 바뀐 오늘의 온도와 어제의 온도를 비교해주세요

		todayTemp = 29.2;
		System.out.println("어제 온도와 오늘 온도가 동일한가요? " + (todayTemp == yesTemp));
		System.out.println("오늘 온도가 어제 온도보다 높은가요? " + (todayTemp > yesTemp));

		System.out.println("오늘 온도가 어제 온도보다 높은가요? " + !yesBig);	//todayTemp값이 바뀌어도 yesBig의 값은 기존값 유지

	}

}
