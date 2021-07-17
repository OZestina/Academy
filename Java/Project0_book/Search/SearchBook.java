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
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

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
		String[][] bookList = null;

		DefaultTableModel model = new DefaultTableModel(bookList, header);
		JTable table = new JTable(model);

		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(12, 10, 885, 314);
		scroll.setPreferredSize(new Dimension(300, 125));

		JPanel panel = new JPanel();
		panel.setBounds(37, 176, 909, 349);
		panel.add(scroll);
		f.getContentPane().add(panel);
		panel.setLayout(null);

		t1 = new JTextField();
		t1.setBounds(200, 72, 355, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JComboBox<String> comboBox = new JComboBox<String>(header);

		comboBox.setBounds(37, 72, 151, 50);
		f.getContentPane().add(comboBox);

		JButton btnNewButton = new JButton("검색하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String opt = comboBox.getSelectedItem().toString();
				String keyword = t1.getText();

				switch (opt) {
				case "도서명":
				case "저자":
				case "장르":
					try {
						ArrayList<String[]> searchResult = db.searchRead(opt, keyword);
						String[][] bookList = new String[searchResult.size()][header.length];
						for (int i = 0; i < searchResult.size(); i++) {
							bookList[i] = searchResult.get(i);
						}
						DefaultTableModel model = new DefaultTableModel(bookList, header);
						table.setModel(model);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					t1.setText(null);
					break;

				case "가격":
					try {
						ArrayList<String[]> searchPriceResult;
						if (keyword.equals("")) {
							searchPriceResult = db.searchPrice();
						} else {
							searchPriceResult = db.searchPrice(Integer.parseInt(keyword));
						}
						String[][] bookList = new String[searchPriceResult.size()][header.length];
						for (int i = 0; i < searchPriceResult.size(); i++) {
							bookList[i] = searchPriceResult.get(i);
						}
						DefaultTableModel model = new DefaultTableModel(bookList, header);
						table.setModel(model);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					t1.setText(null);
					break;

				case "판매량":
					try {
						ArrayList<String[]> searchResult;
						if (keyword.equals("")) {
							searchResult = db.searchRead();
						} else {
							searchResult = db.searchRead(Integer.parseInt(keyword));
						}
						String[][] bookList = new String[searchResult.size()][header.length];
						for (int i = 0; i < searchResult.size(); i++) {
							bookList[i] = searchResult.get(i);
						}
						DefaultTableModel model = new DefaultTableModel(bookList, header);
						table.setModel(model);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					t1.setText(null);
					break;
				}
			}
		});
		btnNewButton.setBounds(567, 72, 131, 50);
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
		btnNewButton_1.setBounds(718, 72, 228, 50);
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
