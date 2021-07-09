package 그래픽;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Color;

public class SearchResult {
	
	private static JTextField textField;
	private static JTable table;
	private static JTable table_1;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(77, 155, 155, 35);
		f.getContentPane().add(comboBox);

		textField = new JTextField();
		textField.setBounds(244, 155, 561, 35);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton_2 = new JButton("검색하기");
		btnNewButton_2.setBounds(817, 155, 121, 35);
		f.getContentPane().add(btnNewButton_2);
		
		/////////////////////////////////////////////////////////////
		
		JLabel lblNewLabel = new JLabel("(도서 이미지)");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(111, 237, 121, 167);
		f.getContentPane().add(lblNewLabel);
		
		
		String header[] = { "순위", "도서명" };
		String bookResult1[][] = { {"도서이름", "bookname"},
				{"지은이", "writer"},
				{"출판사", "~~~"} };
		
		String bookResult2[][] = {{"장르", "genre"},
				{"가격", "price"},
				{"판매량", "count"} };

		table = new JTable(bookResult1, header);
		table.setBounds(285, 267, 299, 87);
		f.getContentPane().add(table);
		
		table_1 = new JTable(bookResult2, header);
		table_1.setBounds(613, 264, 299, 90);
		f.getContentPane().add(table_1);
		
		

		JButton btnNewButton = new JButton("메인페이지");
		btnNewButton.setBounds(77, 87, 287, 50);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("도서검색");
		btnNewButton_1.setBounds(364, 87, 287, 50);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("마이페이지");
		btnNewButton_1_1.setBounds(651, 87, 287, 50);
		f.getContentPane().add(btnNewButton_1_1);
		
	

		
		
		f.setVisible(true);

	}

}
