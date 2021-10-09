package View;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import Controller.AdminController;

import javax.swing.JButton;

public class AdminView {

	public static JFrame adminViewFrame;
	private JTable cinemaOne;
	private JTable cinemaTwo;
	private JTable cinemaThree;
	private JTable cinemaFour;
	private JButton btnNewButton;
	private JButton btnBack;


	public AdminView() {
		adminViewFrame = new JFrame();
		adminViewFrame.setTitle("Admin Database");
		adminViewFrame.setBounds(100, 100, 1184, 702);
		adminViewFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		adminViewFrame.getContentPane().setLayout(null);

		
		JLabel lblNewLabel = new JLabel("Cinema 1");
		lblNewLabel.setBounds(10, 21, 113, 29);
		adminViewFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cinema 2");
		lblNewLabel_1.setBounds(10, 184, 113, 29);
		adminViewFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cinema 3");
		lblNewLabel_2.setBounds(10, 347, 113, 29);
		adminViewFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cinema 4");
		lblNewLabel_3.setBounds(10, 510, 113, 29);
		adminViewFrame.getContentPane().add(lblNewLabel_3);
		
		cinemaOne = new JTable();
		cinemaOne.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", ""
			}
		));
		
		cinemaOne.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cinemaOne.setBounds(52, 61, 1085, 112);
		adminViewFrame.getContentPane().add(cinemaOne);
		
		cinemaTwo = new JTable();
		cinemaTwo.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", ""
					}
				));
		cinemaTwo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cinemaTwo.setBounds(52, 224, 1085, 112);
		adminViewFrame.getContentPane().add(cinemaTwo);
		
		cinemaThree = new JTable();
		cinemaThree.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", ""
					}
				));
		cinemaThree.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cinemaThree.setBounds(52, 387, 1085, 112);
		adminViewFrame.getContentPane().add(cinemaThree);
		
		cinemaFour = new JTable();
		cinemaFour.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
					{null, null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", ""
					}
				));
		cinemaFour.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		cinemaFour.setBounds(52, 540, 1085, 112);
		adminViewFrame.getContentPane().add(cinemaFour);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(1048, 0, 120, 35);
		adminViewFrame.getContentPane().add(btnBack);
		
		
	
		btnBack.addMouseListener(new AdminController.adminBack());
		
	
}
}