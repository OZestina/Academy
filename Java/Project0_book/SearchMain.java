package 그래픽;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class SearchMain {
	private static JTextField textField;
	private static JTable table;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("30대 남성 인기 도서");
		lblNewLabel.setBounds(77, 250, 331, 50);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("순위");
		lblNewLabel_2.setBounds(77, 306, 57, 15);
		f.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("도서명");
		lblNewLabel_2_1.setBounds(266, 306, 57, 15);
		f.getContentPane().add(lblNewLabel_2_1);

		String header[] = { "순위", "도서명" };
		String bookRank[][] = { { "1위", "어린왕자" }, { "2위", "어린왕자1" }, { "3위", "어린왕자2" }, { "4위", "어린왕자3" },
				{ "5위", "어린왕자4" } };

		table = new JTable(bookRank, header);
		table.setBounds(77, 331, 381, 137);
		f.getContentPane().add(table);

		JLabel lblNewLabel_1 = new JLabel("30대 남성 인기 장르");
		lblNewLabel_1.setBounds(501, 250, 331, 50);
		f.getContentPane().add(lblNewLabel_1);

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

		JButton btnNewButton = new JButton("메인페이지");
		btnNewButton.setBounds(77, 87, 287, 50);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("도서검색");
		btnNewButton_1.setBounds(364, 87, 287, 50);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("마이페이지");
		btnNewButton_1_1.setBounds(651, 87, 287, 50);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_3 = new JButton("(차트 추가 예정)");
		btnNewButton_3.setBounds(504, 327, 381, 333);
		f.getContentPane().add(btnNewButton_3);

		f.setVisible(true);

	}
}
