package 문제풀이;

public class 스트링함수연습 {

	public static void main(String[] args) {
		
		String s = "나는 프로grammer프야";
		String s2 = "진짜!!";
		
		System.out.println(s+s2);	//스트링 결합
		System.out.println(s.concat(s2));	//스트링 결합
		System.out.println(s.charAt(0));	//"n"번째에 있는 문자1글자 추출
		System.out.println(s.endsWith("야"));	//~로 끝나냐
		System.out.println(s.substring(3));		//idx n부터 추출
		System.out.println(s.substring(3,8));		//idx n~ <m 추출
		System.out.println(s.contains(s2));			//s에 s2가 포함되어있나
		System.out.println(s.lastIndexOf("프"));		//마지막 idx 리턴
		System.out.println(s.toUpperCase());		//대문자로
		System.out.println(s.toLowerCase());		//소문자로
		System.out.println(s.length());				//글자 수 (String 길이)
		System.out.println(s.replace("나", "너"));	//치환
		
	}

}

