//[자바 크롤링]
//1) 필요 라이브러리 다운로드
//	MVN에서 JSoup 라이브러리 다운 (JSoup Java HTML Parser)
//	1.9.2 버전, jar 파일
//
//2)이클립스
//	크롤링 진행할 프로젝트에서 external jar로 build path
//
//진행하다가 import되는 라이브러리는 모두 jsoup 것으로!

package crawling0730;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;	//html tag가 담긴 arraylist 

public class 테스트_w3cshools {

	public static void main(String[] args) {
		
		try {
			Document doc = Jsoup.connect("https://www.w3schools.com/tags/default.asp").get();
			System.out.println("1. 사이트 연결 성공");
			System.out.println("2. 소스 받아오기 성공");
			
			Elements list = doc.select("a.w3-bar-item.w3-button");	//a태그 중 class가 nav인거
//			Elements list = doc.select("#topnav > div > div > a:nth-child(12)"); //selector 기반
			System.out.println(list.size());
//			System.out.println(list);
			for (int i = 8; i<24; i++) {
				System.out.println(list.get(i).text());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
