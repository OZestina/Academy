package project0_Search;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchPopular {

	private static JTable table;

	
	public void popularBook() throws Exception {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		BookDAO db = new BookDAO();

		// PieChart
		JLabel l2 = new JLabel("인기 장르");
		l2.setBounds(465, 47, 207, 50);
		f.getContentPane().add(l2);

		DefaultPieDataset dataset = new DefaultPieDataset();
		
		String[] genre = {"computer", "business", "language", "novel"}; 
		int[] popGenre;
		try {
			popGenre = db.chartRead(genre);
			for (int i = 0; i < genre.length; i++) {
				dataset.setValue((String)(genre[i]), popGenre[i]);	//comparable key, value(int)
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} //[4]
		JFreeChart chart = ChartFactory.createPieChart(null, dataset,false,false,false);

//		chart.setBackgroundPaint(Color.white);
		
		
		
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setBounds(465, 127, 490, 290);
		f.getContentPane().add(chartPanel);
		
		// Table
		JLabel lblNewLabel_2_2 = new JLabel("인기 도서 및 장르 추천");
		lblNewLabel_2_2.setFont(new Font("궁서", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(12, 10, 306, 27);
		f.getContentPane().add(lblNewLabel_2_2);

		JLabel l1 = new JLabel("인기 도서");
		l1.setBounds(25, 47, 172, 50);
		f.getContentPane().add(l1);

		JLabel l1_1 = new JLabel("순위");
		l1_1.setBounds(25, 107, 57, 15);
		f.getContentPane().add(l1_1);

		JLabel l1_2 = new JLabel("도서명");
		l1_2.setBounds(157, 107, 57, 15);
		f.getContentPane().add(l1_2);

		JLabel l1_2_1 = new JLabel("판매량");
		l1_2_1.setBounds(298, 107, 57, 15);
		f.getContentPane().add(l1_2_1);

		String header[] = { "순위", "도서명", "" };
		String bookRank[][] = { { "1위", "a", "a" }, { "2위", "", "a" }, { "3위", "", "" }, { "4위", "", "" },
				{ "5위", "", "" } };

		String[][] bookList;
		try {
			bookList = db.tableRead();
			for (int i = 0; i < bookRank.length; i++) {
				bookRank[i][1] = bookList[i][0];
				bookRank[i][2] = bookList[i][1];
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		table = new JTable(bookRank, header);
		table.setBounds(22, 132, 415, 224);
		f.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("창닫기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		btnNewButton.setBounds(708, 665, 247, 74);
		f.getContentPane().add(btnNewButton);

		f.setVisible(true);

	}
}
