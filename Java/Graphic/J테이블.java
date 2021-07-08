package 그래픽;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class J테이블 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(300, 200);
		
		//table_title
		String[] title = {"컴퓨터", "영어", "수학"};
		
		//table_record
		String[][] content = {
				{"100","100","100"},
				{"80","100","90"},
				{"100","100","100"},
				{"80","100","90"},
				{"100","100","100"},
				{"80","100","90"},
				{"100","100","100"},
				{"80","100","90"},
				{"100","100","100"},
				{"80","100","90"},
				{"100","100","100"},
				{"80","100","90"},
				{"100","100","100"},
				{"80","100","90"},
				{"90","70","65"}
		};
		
		//JTable 선언
		JTable table = new JTable(content, title);
		//JTable에 추가
//		f.add(table);

		//scroll 추가로 title 뜨도록 만듬!
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		f.setVisible(true);
	}

}
