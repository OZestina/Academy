package 클래스생성;

public class BdsDB_게시물삭제 {

	public static void main(String[] args) {
		
		BbsDB db = new BbsDB();
		db.create("어린완자");
		db.create("누가 내 감자를 옮겼나");
		db.create("쥐를 Java보자");
		System.out.println();
		
		db.read(5);		//현재 등록한 글 3개. 등록한 글보다 더 큰수 입력함 
		db.read(2);
		System.out.println();
				
		db.delete(2);
		System.out.println();
		
		db.update();
		
	}
}
