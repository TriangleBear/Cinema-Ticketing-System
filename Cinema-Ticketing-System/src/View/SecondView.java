package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class SecondView {

	JFrame frmSecondView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondView window = new SecondView();
					window.frmSecondView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SecondView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSecondView = new JFrame();
		frmSecondView.setTitle("                                                        "
				+ "                                   "
				+ "  Cinema");
		frmSecondView.setBounds(100, 100, 688, 737);
		frmSecondView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSecondView.setLocationRelativeTo(null);
		frmSecondView.getContentPane().setLayout(null);
		
		JButton btn_a1 = new JButton("");
		btn_a1.setBackground(new Color(222, 184, 135));
		btn_a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_a1.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a1.setBounds(154, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a1);
		
		JButton btn_a2 = new JButton("");
		btn_a2.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a2.setBounds(198, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a2);
		
		JButton btn_a3 = new JButton("");
		btn_a3.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a3.setBounds(243, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a3);
		
		JButton btn_a4 = new JButton("");
		btn_a4.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a4.setBounds(287, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a4);
		
		JButton btn_a5 = new JButton("");
		btn_a5.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a5.setBounds(331, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a5);
		
		JButton btn_a6 = new JButton("");
		btn_a6.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a6.setBounds(376, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a6);

		JButton btn_a7 = new JButton("");
		btn_a7.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a7.setBounds(420, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a7);
		
		JButton btn_a8 = new JButton("");
	
		btn_a8.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_a8.setBounds(468, 258, 46, 39);
		frmSecondView.getContentPane().add(btn_a8);
				
		JButton btn_b1 = new JButton("");
		btn_b1.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b1.setBounds(154, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b1);
		
		JButton btn_b2 = new JButton("");
		btn_b2.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b2.setBounds(198, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b2);
		
		JButton btn_b3 = new JButton("");
		btn_b3.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b3.setBounds(243, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b3);
		
		JButton btn_b4 = new JButton("");
		btn_b4.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b4.setBounds(287, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b4);
		
		JButton btn_b5 = new JButton("");
		btn_b5.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b5.setBounds(331, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b5);
		
		JButton btn_b6 = new JButton("");
		btn_b6.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b6.setBounds(376, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b6);
		
		JButton btn_b7 = new JButton("");
		btn_b7.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b7.setBounds(420, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b7);
		
		JButton btn_b8 = new JButton("");
		btn_b8.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_b8.setBounds(468, 312, 46, 39);
		frmSecondView.getContentPane().add(btn_b8);
		
		JButton btn_c1 = new JButton("");
		btn_c1.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c1.setBounds(154, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c1);
		
		JButton btn_c2 = new JButton("");
		btn_c2.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c2.setBounds(198, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c2);
		
		JButton btn_c3 = new JButton("");
		btn_c3.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c3.setBounds(243, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c3);
		
		JButton btn_c4 = new JButton("");
		btn_c4.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c4.setBounds(287, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c4);
		
		JButton btn_c5 = new JButton("");
		btn_c5.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c5.setBounds(331, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c5);
		
		JButton btn_c6 = new JButton("");
		btn_c6.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c6.setBounds(376, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c6);
		
		JButton btn_c7 = new JButton("");
		btn_c7.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c7.setBounds(420, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c7);
		
		JButton btn_c8 = new JButton("");
		btn_c8.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_c8.setBounds(468, 364, 46, 39);
		frmSecondView.getContentPane().add(btn_c8);
		
		JButton btn_d1 = new JButton("");
		btn_d1.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d1.setBounds(154, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d1);
		
		JButton btn_d2 = new JButton("");
		btn_d2.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d2.setBounds(198, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d2);
		
		JButton btn_d3 = new JButton("");
		btn_d3.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d3.setBounds(243, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d3);
		
		JButton btn_d4 = new JButton("");
		btn_d4.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d4.setBounds(287, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d4);
		
		JButton btn_d5 = new JButton("");
		btn_d5.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d5.setBounds(331, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d5);
		
		JButton btn_d6 = new JButton("");
		btn_d6.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d6.setBounds(376, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d6);
		
		JButton btn_d7 = new JButton("");
		btn_d7.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d7.setBounds(420, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d7);
		
		JButton btn_d8 = new JButton("");
		btn_d8.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_d8.setBounds(468, 418, 46, 39);
		frmSecondView.getContentPane().add(btn_d8);
		
		JButton btn_e1 = new JButton("");
		btn_e1.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e1.setBounds(154, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e1);
		
		JButton btn_e2 = new JButton("");
		btn_e2.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e2.setBounds(198, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e2);
		
		JButton btn_e3 = new JButton("");
		btn_e3.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e3.setBounds(243, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e3);
		
		JButton btn_e4 = new JButton("");
		btn_e4.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e4.setBounds(287, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e4);
		
		JButton btn_e5 = new JButton("");
		btn_e5.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e5.setBounds(331, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e5);
		
		JButton btn_e6 = new JButton("");
		btn_e6.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e6.setBounds(376, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e6);
		
		JButton btn_e7 = new JButton("");
		btn_e7.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e7.setBounds(420, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e7);
		
		JButton btn_e8 = new JButton("");
		btn_e8.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_e8.setBounds(468, 470, 46, 39);
		frmSecondView.getContentPane().add(btn_e8);
		
		JButton btn_f1 = new JButton("");
		btn_f1.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f1.setBounds(154, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f1);
		
		JButton btn_f2 = new JButton("");
		btn_f2.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f2.setBounds(198, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f2);
		
		JButton btn_f3 = new JButton("");
		btn_f3.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f3.setBounds(243, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f3);
		
		JButton btn_f4 = new JButton("");
		btn_f4.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f4.setBounds(287, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f4);
		
		JButton btn_f5 = new JButton("");
		btn_f5.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f5.setBounds(331, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f5);
		
		JButton btn_f6 = new JButton("");
		btn_f6.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f6.setBounds(376, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f6);
		
		JButton btn_f7 = new JButton("");
		btn_f7.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f7.setBounds(420, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f7);
		
		JButton btn_f8 = new JButton("");
		btn_f8.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_f8.setBounds(468, 526, 46, 39);
		frmSecondView.getContentPane().add(btn_f8);
		
		JButton btn_g1 = new JButton("");
		btn_g1.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g1.setBounds(154, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g1);
		
		JButton btn_g2 = new JButton("");
		btn_g2.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g2.setBounds(198, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g2);
		
		JButton btn_g3 = new JButton("");
		btn_g3.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g3.setBounds(243, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g3);
		
		JButton btn_g4 = new JButton("");
		btn_g4.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g4.setBounds(287, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g4);
		
		JButton btn_g5 = new JButton("");
		btn_g5.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g5.setBounds(331, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g5);
		
		JButton btn_g6 = new JButton("");
		btn_g6.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g6.setBounds(376, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g6);
		
		JButton btn_g7 = new JButton("");
		btn_g7.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g7.setBounds(420, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g7);
		
		JButton btn_g8 = new JButton("");
		btn_g8.setIcon(new ImageIcon(SecondView.class.getResource("/images/iconSeat.png")));
		btn_g8.setBounds(468, 577, 46, 39);
		frmSecondView.getContentPane().add(btn_g8);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(552, 650, 119, 48);
		frmSecondView.getContentPane().add(btnConfirm);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSecondView.setVisible(false);
				MainView cinemaView = new MainView();
				JOptionPane.showConfirmDialog(null, "Are you sure?");
				cinemaView.frmMainview.setVisible(true);
			}
		});
		btnCancel.setBounds(0, 650, 119, 48);
		frmSecondView.getContentPane().add(btnCancel);
		
		JLabel seatPlan = new JLabel("");
		seatPlan.setIcon(new ImageIcon(SecondView.class.getResource("/images/YACCKK_bg.png")));
		seatPlan.setSize(300,300);
		seatPlan.setBounds(0, 0, 671, 716);
		frmSecondView.getContentPane().add(seatPlan);
	}
}
