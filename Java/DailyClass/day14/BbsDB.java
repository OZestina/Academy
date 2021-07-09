package 클래스생성;

import java.util.ArrayList;
import java.util.Scanner;

public class BbsDB {
	
	String ip = "127.0.0.1";
	String port = "3306";
	String id = "root";
	String pw = "1234";
	
	ArrayList story = new ArrayList();
	int n = 0; 
	
	Scanner sc = new Scanner(System.in);
	
	public void create(String title) {
		n++;
		System.out.println("["+title+"]글이 "+n+"번째 글로 등록됐습니다.");
		story.add(title);
	}
	
	public void read(int num) {
		if (num > n) {
			System.out.println("등록된 글이 그렇게 많지 않네요^^;;");
		}else {
			System.out.println(num+"번째 글 ["+story.get(num-1)+"]을 로드합니다.");
		}
	}
	
	public void update() {
		System.out.println("< 현재 글 목록 >");
		for (int i = 0; i < n; i++) {
			System.out.println((i+1)+"번 글: "+story.get(i));
		}
		System.out.println("총 "+n+"개 글이 등록돼있습니다.");
	}
	
	public void delete(int num) {
		if (num > n) {
			System.out.println("등록된 글이 그렇게 많지 않네요^^;;");
		}else {
			System.out.println(num+"번째 글 ["+story.get(num-1)+"]을 삭제했습니다.");
			story.remove(num-1);
			n--;
		}
	}
	
}