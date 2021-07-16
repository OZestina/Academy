package project0_Search;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchBook {
	private static JTextField t1;

	public void search() throws Exception {
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		BookDAO db = new BookDAO();

		// Table
		JLabel lblNewLabel_2_2 = new JLabel("도서 검색");
		lblNewLabel_2_2.setFont(new Font("궁서", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(12, 10, 306, 27);
		f.getContentPane().add(lblNewLabel_2_2);

		JLabel l1 = new JLabel("검색 결과");
		l1.setBounds(27, 127, 172, 50);
		f.getContentPane().add(l1);
		
		String header[] = { "도서명", "저자", "장르", "가격", "판매량" };
		ArrayList<String[]> searchResult = null;
		try {
			searchResult = db.searchRead();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		bookList에 searchResult 값 넣기 (String화)
		String[][] bookList = new String[searchResult.size()][header.length];
		for (int i = 0; i < searchResult.size(); i++) {
			bookList[i] = searchResult.get(i);
		}

		JTable table = new JTable(bookList, header);
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(12, 10, 885, 314);
		scroll.setPreferredSize(new Dimension(300, 125));
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 176, 909, 349);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		panel.add(scroll);
		
		t1 = new JTextField();
		t1.setBounds(35, 57, 518, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("검색하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(565, 57, 131, 50);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("인기 도서&장르 추천");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchPopular pp = new SearchPopular();
				try {
					pp.popularBook();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(716, 57, 228, 50);
		f.getContentPane().add(btnNewButton_1);
		
		JButton b1 = new JButton("창닫기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		b1.setBounds(708, 665, 247, 74);
		f.getContentPane().add(b1);

		f.setVisible(true);

	}
}
