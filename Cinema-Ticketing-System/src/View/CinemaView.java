package View;


import javax.swing.JFrame;
import javax.swing.JLabel;
import Controller.*;
import Model.Ticket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.util.Observable;
import java.util.Observer;


public class CinemaView implements Observer{

	public static JFrame frmCinemaView;
	public int Aone = 0, Atwo = 0, Athree = 0, Afour = 0, Afive = 0, Asix = 0, Aseven = 0, Aeight = 0;
	public int Bone = 0, Btwo = 0, Bthree = 0, Bfour = 0, Bfive = 0, Bsix = 0, Bseven = 0, Beight = 0;
	public int Cone = 0, Ctwo = 0, Cthree = 0, Cfour = 0, Cfive = 0, Csix = 0, Cseven = 0, Ceight = 0;
	public int Done = 0, Dtwo = 0, Dthree = 0, Dfour = 0, Dfive = 0, Dsix = 0, Dseven = 0, Deight = 0;
	public int Eone = 0, Etwo = 0, Ethree = 0, Efour = 0, Efive = 0, Esix = 0, Eseven = 0, Eeight = 0;
	public int Fone = 0, Ftwo = 0, Fthree = 0, Ffour = 0, Ffive = 0, Fsix = 0, Fseven = 0, Feight = 0;
	public int Gone = 0, Gtwo = 0, Gthree = 0, Gfour = 0, Gfive = 0, Gsix = 0, Gseven = 0, Geight = 0;
	


	
	public CinemaView() {
		frmCinemaView = new JFrame();
		frmCinemaView.setTitle(
				"                                                        "
				+ "                                   "
				+ "  Cinema");
		frmCinemaView.setBounds(100, 100, 686, 737);
		frmCinemaView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCinemaView.getContentPane().setLayout(null);
		frmCinemaView.setLocationRelativeTo(null);
		frmCinemaView.setResizable(false);
		
		//buttons
		JButton btn_a1 = new JButton("");
		btn_a1.setActionCommand("selecteda1");
		if (Aone != cinemaViewController.a1) {
			btn_a1.setEnabled(false);
			btn_a1.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_a2 = new JButton("");
		btn_a2.setActionCommand("selecteda2");
		if (Atwo != cinemaViewController.a2) {
			btn_a2.setEnabled(false);
			btn_a2.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_a3 = new JButton("");
		btn_a3.setActionCommand("selecteda3");
		if (Athree != cinemaViewController.a3) {
			btn_a3.setEnabled(false);
			btn_a3.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_a4 = new JButton("");
		btn_a4.setActionCommand("selecteda4");
		if (Afour != cinemaViewController.a4) {
			btn_a4.setEnabled(false);
			btn_a4.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_a5 = new JButton("");
		btn_a5.setActionCommand("selecteda5");
		if (Afive != cinemaViewController.a5) {
			btn_a5.setEnabled(false);
			btn_a5.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_a6 = new JButton("");
		btn_a6.setActionCommand("selecteda6");
		if (Asix != cinemaViewController.a6) {
			btn_a6.setEnabled(false);
			btn_a6.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_a7 = new JButton("");
		btn_a7.setActionCommand("selecteda7");
		if (Aseven != cinemaViewController.a7) {
			btn_a7.setEnabled(false);
			btn_a7.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_a8 = new JButton("");
		btn_a8.setActionCommand("selecteda8");
		if (Aeight != cinemaViewController.a8) {
			btn_a8.setEnabled(false);
			btn_a8.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b1 = new JButton("");
		btn_b1.setActionCommand("selectedb1");
		if (Bone != cinemaViewController.b1) {
			btn_b1.setEnabled(false);
			btn_b1.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b2 = new JButton("");
		btn_b2.setActionCommand("selectedb2");
		if (Btwo != cinemaViewController.b2) {
			btn_b2.setEnabled(false);
			btn_b2.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b3 = new JButton("");
		btn_b3.setActionCommand("selectedb3");
		if (Bthree != cinemaViewController.b3) {
			btn_b3.setEnabled(false);
			btn_b3.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b4 = new JButton("");
		btn_b4.setActionCommand("selectedb4");
		if (Bfour != cinemaViewController.b4) {
			btn_b4.setEnabled(false);
			btn_b4.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b5 = new JButton("");
		btn_b5.setActionCommand("selectedb5");
		if (Bfive != cinemaViewController.b5) {
			btn_b5.setEnabled(false);
			btn_b5.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b6 = new JButton("");
		btn_b6.setActionCommand("selectedb6");
		if (Bsix != cinemaViewController.b6) {
			btn_b6.setEnabled(false);
			btn_b6.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b7 = new JButton("");
		btn_b7.setActionCommand("selectedb7");
		if (Bseven != cinemaViewController.b7) {
			btn_b7.setEnabled(false);
			btn_b7.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_b8 = new JButton("");
		btn_b8.setActionCommand("selectedb8");
		if (Beight != cinemaViewController.b8) {
			btn_b8.setEnabled(false);
			btn_b8.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c1 = new JButton("");
		btn_c1.setActionCommand("selectedc1");
		if (Cone != cinemaViewController.c1) {
			btn_c1.setEnabled(false);
			btn_c1.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c2 = new JButton("");
		btn_c2.setActionCommand("selectedc2");
		if (Ctwo != cinemaViewController.c2) {
			btn_c2.setEnabled(false);
			btn_c2.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c3 = new JButton("");
		btn_c3.setActionCommand("selectedc3");
		if (Cthree != cinemaViewController.c3) {
			btn_c3.setEnabled(false);
			btn_c3.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c4 = new JButton("");
		btn_c4.setActionCommand("selectedc4");
		if (Cfour != cinemaViewController.c4) {
			btn_c4.setEnabled(false);
			btn_c4.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c5 = new JButton("");
		btn_c5.setActionCommand("selectedc5");
		if (Cfive != cinemaViewController.c5) {
			btn_c5.setEnabled(false);
			btn_c5.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c6 = new JButton("");
		btn_c6.setActionCommand("selectedc6");
		if (Csix != cinemaViewController.c6) {
			btn_c6.setEnabled(false);
			btn_c6.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c7 = new JButton("");
		btn_c7.setActionCommand("selectedc7");
		if (Cseven != cinemaViewController.c7) {
			btn_c7.setEnabled(false);
			btn_c7.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_c8 = new JButton("");
		btn_c8.setActionCommand("selectedc8");
		if (Ceight != cinemaViewController.c8) {
			btn_c8.setEnabled(false);
			btn_c8.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d1 = new JButton("");
		btn_d1.setActionCommand("selectedd1");
		if (Done != cinemaViewController.d1) {
			btn_d1.setEnabled(false);
			btn_d1.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d2 = new JButton("");
		btn_d2.setActionCommand("selectedd2");
		if (Dtwo != cinemaViewController.d2) {
			btn_d2.setEnabled(false);
			btn_d2.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d3 = new JButton("");
		btn_d3.setActionCommand("selectedd3");
		if (Dthree != cinemaViewController.d3) {
			btn_d3.setEnabled(false);
			btn_d3.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d4 = new JButton("");
		btn_d4.setActionCommand("selectedd4");
		if (Dfour != cinemaViewController.d4) {
			btn_d4.setEnabled(false);
			btn_d4.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d5 = new JButton("");
		btn_d5.setActionCommand("selectedd5");
		if (Dfive != cinemaViewController.d5) {
			btn_d5.setEnabled(false);
			btn_d5.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d6 = new JButton("");
		btn_d6.setActionCommand("selectedd6");
		if (Dsix != cinemaViewController.d6) {
			btn_d6.setEnabled(false);
			btn_d6.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d7 = new JButton("");
		btn_d7.setActionCommand("selectedd7");
		if (Dseven != cinemaViewController.d7) {
			btn_d7.setEnabled(false);
			btn_d7.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_d8 = new JButton("");
		btn_d8.setActionCommand("selectedd8");
		if (Deight != cinemaViewController.d8) {
			btn_d8.setEnabled(false);
			btn_d8.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e1 = new JButton("");
		btn_e1.setActionCommand("selectede1");
		if (Eone != cinemaViewController.e1) {
			btn_e1.setEnabled(false);
			btn_e1.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e2 = new JButton("");
		btn_e2.setActionCommand("selectede2");
		if (Etwo != cinemaViewController.e2) {
			btn_e2.setEnabled(false);
			btn_e2.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e3 = new JButton("");
		btn_e3.setActionCommand("selectede4");
		if (Ethree != cinemaViewController.e3) {
			btn_e3.setEnabled(false);
			btn_e3.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e4 = new JButton("");
		btn_e4.setActionCommand("selectede4");
		if (Efour != cinemaViewController.e4) {
			btn_e4.setEnabled(false);
			btn_e4.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e5 = new JButton("");
		btn_e5.setActionCommand("selectede5");
		if (Efive != cinemaViewController.e5) {
			btn_e5.setEnabled(false);
			btn_e5.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e6 = new JButton("");
		btn_e6.setActionCommand("selectede6");
		if (Esix != cinemaViewController.e6) {
			btn_e6.setEnabled(false);
			btn_e6.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e7 = new JButton("");
		btn_e7.setActionCommand("selectede7");
		if (Eseven != cinemaViewController.e7) {
			btn_e7.setEnabled(false);
			btn_e7.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_e8 = new JButton("");
		btn_e8.setActionCommand("selectede8");
		if (Eeight != cinemaViewController.e8) {
			btn_e8.setEnabled(false);
			btn_e8.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f1 = new JButton("");
		btn_f1.setActionCommand("selectedf1");
		if (Fone != cinemaViewController.f1) {
			btn_f1.setEnabled(false);
			btn_f1.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f2 = new JButton("");
		btn_f2.setActionCommand("selectedf2");
		if (Ftwo != cinemaViewController.f2) {
			btn_f2.setEnabled(false);
			btn_f2.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f3 = new JButton("");
		btn_f3.setActionCommand("selectedf3");
		if (Fthree != cinemaViewController.f3) {
			btn_f3.setEnabled(false);
			btn_f3.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f4 = new JButton("");
		btn_f4.setActionCommand("selectedf4");
		if (Ffour != cinemaViewController.f4) {
			btn_f4.setEnabled(false);
			btn_f4.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f5 = new JButton("");
		btn_f5.setActionCommand("selectedf5");
		if (Ffive != cinemaViewController.f5) {
			btn_f5.setEnabled(false);
			btn_f5.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f6 = new JButton("");
		btn_f6.setActionCommand("selectedf6");
		if (Fsix != cinemaViewController.f6) {
			btn_f6.setEnabled(false);
			btn_f6.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f7 = new JButton("");
		btn_f7.setActionCommand("selectedf7");
		if (Fseven != cinemaViewController.f7) {
			btn_f7.setEnabled(false);
			btn_f7.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_f8 = new JButton("");
		btn_f8.setActionCommand("selectedf8");
		if (Feight != cinemaViewController.f8) {
			btn_f8.setEnabled(false);
			btn_f8.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g1 = new JButton("");
		btn_g1.setActionCommand("selectedg1");
		if (Gone != cinemaViewController.g1) {
			btn_g1.setEnabled(false);
			btn_g1.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g2 = new JButton("");
		btn_g2.setActionCommand("selectedg2");
		if (Gtwo!= cinemaViewController.g2) {
			btn_g2.setEnabled(false);
			btn_g2.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g3 = new JButton("");
		btn_g3.setActionCommand("selectedg3");
		if (Gthree != cinemaViewController.g3) {
			btn_g3.setEnabled(false);
			btn_g3.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g4 = new JButton("");
		btn_g4.setActionCommand("selectedg4");
		if (Gfour != cinemaViewController.g4) {
			btn_g4.setEnabled(false);
			btn_g4.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g5 = new JButton("");
		btn_g5.setActionCommand("selectedg5");
		if (Gfive != cinemaViewController.g5) {
			btn_g5.setEnabled(false);
			btn_g5.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g6 = new JButton("");
		btn_g6.setActionCommand("selectedg6");
		if (Gsix != cinemaViewController.g6) {
			btn_g6.setEnabled(false);
			btn_g6.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g7 = new JButton("");
		btn_g7.setActionCommand("selectedg7");
		if (Gseven != cinemaViewController.g7) {
			btn_g7.setEnabled(false);
			btn_g7.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btn_g8 = new JButton("");
		btn_g8.setActionCommand("selectedg8");
		if (Geight != cinemaViewController.g8) {
			btn_g8.setEnabled(false);
			btn_g8.setDisabledIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		}
		JButton btnCancel = new JButton("Cancel");
		JLabel seatPlan = new JLabel("");
		seatPlan.setForeground(Color.YELLOW);
		seatPlan.setBackground(Color.YELLOW);
		
		//function
		
			
		
		//labels
		JLabel lblNewLabel = new JLabel("A");
		JLabel lblNewLabel_1 = new JLabel("B");
		JLabel lblNewLabel_1_1 = new JLabel("C");
		JLabel lblNewLabel_1_2 = new JLabel("D");
		JLabel lblNewLabel_1_3 = new JLabel("E");
		JLabel lblNewLabel_2 = new JLabel("F");
		JLabel lblNewLabel_1_4 = new JLabel("G");
		JLabel lblNewLabel_2_1 = new JLabel("1");
		JLabel lblNewLabel_3 = new JLabel("2");
		JLabel lblNewLabel_3_1 = new JLabel("3");
		JLabel lblNewLabel_3_2 = new JLabel("4");
		JLabel lblNewLabel_3_3 = new JLabel("5");
		JLabel lblNewLabel_3_4 = new JLabel("6");
		JLabel lblNewLabel_3_5 = new JLabel("7");
		JLabel lblNewLabel_3_6 = new JLabel("8");
				
		
		//set bounds, set icons, set backgrounds
		//btn_a1.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
//		btn_a2.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
//		btn_a3.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_a4.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_a5.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_a6.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_a7.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_a8.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b1.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b2.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b3.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b4.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b5.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b6.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b7.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_b8.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c1.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c2.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c3.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c4.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c5.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c6.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c7.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_c8.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d1.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d2.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d3.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d4.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d5.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d6.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d7.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_d8.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e1.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e2.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e3.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e4.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e5.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e6.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e7.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_e8.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f1.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f2.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f3.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f4.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f5.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f6.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f7.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_f8.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g1.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g2.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g3.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g4.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g5.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g6.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g7.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_g8.setSelectedIcon(new ImageIcon(CinemaView.class.getResource("/images/selectedSeat.png")));
		btn_a1.setBackground(new Color(222, 184, 135));
		btn_a1.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a1.setBounds(154, 258, 46, 39);
		btn_a2.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a2.setBounds(198, 258, 46, 39);
		btn_a3.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a3.setBounds(243, 258, 46, 39);
		btn_a4.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a4.setBounds(287, 258, 46, 39);
		btn_a5.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a5.setBounds(331, 258, 46, 39);
		btn_a6.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a6.setBounds(376, 258, 46, 39);
		btn_a7.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a7.setBounds(420, 258, 46, 39);
		btn_a8.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_a8.setBounds(468, 258, 46, 39);
		btn_b1.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b1.setBounds(154, 312, 46, 39);
		btn_b2.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b2.setBounds(198, 312, 46, 39);
		btn_b3.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b3.setBounds(243, 312, 46, 39);
		btn_b4.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b4.setBounds(287, 312, 46, 39);
		btn_b5.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b5.setBounds(331, 312, 46, 39);
		btn_b6.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b6.setBounds(376, 312, 46, 39);
		btn_b7.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b7.setBounds(420, 312, 46, 39);
		btn_b8.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_b8.setBounds(468, 312, 46, 39);
		btn_c1.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c1.setBounds(154, 364, 46, 39);
		btn_c2.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c2.setBounds(198, 364, 46, 39);
		btn_c3.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c3.setBounds(243, 364, 46, 39);
		btn_c4.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c4.setBounds(287, 364, 46, 39);
		btn_c5.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c5.setBounds(331, 364, 46, 39);
		btn_c6.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c6.setBounds(376, 364, 46, 39);
		btn_c7.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c7.setBounds(420, 364, 46, 39);
		btn_c8.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_c8.setBounds(468, 364, 46, 39);
		btn_d1.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d1.setBounds(154, 418, 46, 39);
		btn_d2.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d2.setBounds(198, 418, 46, 39);
		btn_d3.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d3.setBounds(243, 418, 46, 39);
		btn_d4.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d4.setBounds(287, 418, 46, 39);
		btn_d5.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d5.setBounds(331, 418, 46, 39);
		btn_d6.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d6.setBounds(376, 418, 46, 39);
		btn_d7.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d7.setBounds(420, 418, 46, 39);
		btn_d8.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_d8.setBounds(468, 418, 46, 39);
		btn_e1.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e1.setBounds(154, 470, 46, 39);
		btn_e2.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e2.setBounds(198, 470, 46, 39);
		btn_e3.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e3.setBounds(243, 470, 46, 39);
		btn_e4.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e4.setBounds(287, 470, 46, 39);
		btn_e5.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e5.setBounds(331, 470, 46, 39);
		btn_e6.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e6.setBounds(376, 470, 46, 39);
		btn_e7.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e7.setBounds(420, 470, 46, 39);
		btn_e8.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_e8.setBounds(468, 470, 46, 39);
		btn_f1.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f1.setBounds(154, 526, 46, 39);
		btn_f2.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f2.setBounds(198, 526, 46, 39);
		btn_f3.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f3.setBounds(243, 526, 46, 39);
		btn_f4.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f4.setBounds(287, 526, 46, 39);
		btn_f5.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f5.setBounds(331, 526, 46, 39);
		btn_f6.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f6.setBounds(376, 526, 46, 39);
		btn_f7.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f7.setBounds(420, 526, 46, 39);
		btn_f8.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_f8.setBounds(468, 526, 46, 39);
		btn_g1.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g1.setBounds(154, 577, 46, 39);
		btn_g2.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g2.setBounds(198, 577, 46, 39);
		btn_g3.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g3.setBounds(243, 577, 46, 39);
		btn_g4.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g4.setBounds(287, 577, 46, 39);
		btn_g5.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g5.setBounds(331, 577, 46, 39);
		btn_g6.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g6.setBounds(376, 577, 46, 39);
		btn_g7.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g7.setBounds(420, 577, 46, 39);
		btn_g8.setIcon(new ImageIcon(CinemaView.class.getResource("/images/iconSeat.png")));
		btn_g8.setBounds(468, 577, 46, 39);
		btnCancel.setBounds(0, 650, 119, 48);
		lblNewLabel.setBounds(142, 273, 46, 14);
		lblNewLabel_1.setBounds(142, 323, 46, 14);
		lblNewLabel_1_1.setBounds(142, 377, 46, 14);
		lblNewLabel_1_2.setBounds(142, 430, 46, 14);
		lblNewLabel_1_3.setBounds(142, 482, 46, 14);
		lblNewLabel_2.setBounds(142, 538, 46, 14);
		lblNewLabel_1_4.setBounds(142, 591, 46, 14);
		lblNewLabel_2_1.setBounds(173, 233, 18, 14);
		lblNewLabel_3.setBounds(215, 233, 18, 14);
		lblNewLabel_3_1.setBounds(259, 233, 18, 14);
		lblNewLabel_3_2.setBounds(303, 233, 18, 14);
		lblNewLabel_3_3.setBounds(348, 233, 18, 14);
		lblNewLabel_3_4.setBounds(392, 233, 18, 14);
		lblNewLabel_3_5.setBounds(437, 233, 18, 14);
		lblNewLabel_3_6.setBounds(485, 233, 18, 14);
		//btnConfirm.setBounds(552, 650, 119, 48);
		seatPlan.setIcon(new ImageIcon(CinemaView.class.getResource("/images/YACCKK_bg.png")));
		seatPlan.setSize(300,300);
		seatPlan.setBounds(0, 0, 671, 716);
			
		
		//content panes
		frmCinemaView.getContentPane().add(btn_a1);
		frmCinemaView.getContentPane().add(btn_a2);
		frmCinemaView.getContentPane().add(btn_a3);
		frmCinemaView.getContentPane().add(btn_a4);
		frmCinemaView.getContentPane().add(btn_a5);	
		frmCinemaView.getContentPane().add(btn_a6);	
		frmCinemaView.getContentPane().add(btn_a7);
		frmCinemaView.getContentPane().add(btn_a8);
		frmCinemaView.getContentPane().add(btn_b1);	
		frmCinemaView.getContentPane().add(btn_b2);
		frmCinemaView.getContentPane().add(btn_b3);
		frmCinemaView.getContentPane().add(btn_b4);
		frmCinemaView.getContentPane().add(btn_b5);
		frmCinemaView.getContentPane().add(btn_b6);
		frmCinemaView.getContentPane().add(btn_b7);
		frmCinemaView.getContentPane().add(btn_b8);
		frmCinemaView.getContentPane().add(btn_c1);
		frmCinemaView.getContentPane().add(btn_c2);
		frmCinemaView.getContentPane().add(btn_c3);
		frmCinemaView.getContentPane().add(btn_c4);
		frmCinemaView.getContentPane().add(btn_c5);
		frmCinemaView.getContentPane().add(btn_c6);
		frmCinemaView.getContentPane().add(btn_c7);
		frmCinemaView.getContentPane().add(btn_c8);
		frmCinemaView.getContentPane().add(btn_d1);
		frmCinemaView.getContentPane().add(btn_d2);
		frmCinemaView.getContentPane().add(btn_d3);
		frmCinemaView.getContentPane().add(btn_d4);
		frmCinemaView.getContentPane().add(btn_d5);
		frmCinemaView.getContentPane().add(btn_d6);
		frmCinemaView.getContentPane().add(btn_d7);
		frmCinemaView.getContentPane().add(btn_d8);
		frmCinemaView.getContentPane().add(btn_e1);
		frmCinemaView.getContentPane().add(btn_e2);
		frmCinemaView.getContentPane().add(btn_e3);
		frmCinemaView.getContentPane().add(btn_e4);
		frmCinemaView.getContentPane().add(btn_e5);
		frmCinemaView.getContentPane().add(btn_e6);
		frmCinemaView.getContentPane().add(btn_e7);
		frmCinemaView.getContentPane().add(btn_e8);
		frmCinemaView.getContentPane().add(btn_f1);
		frmCinemaView.getContentPane().add(btn_f2);
		frmCinemaView.getContentPane().add(btn_f3);
		frmCinemaView.getContentPane().add(btn_f4);
		frmCinemaView.getContentPane().add(btn_f5);
		frmCinemaView.getContentPane().add(btn_f6);
		frmCinemaView.getContentPane().add(btn_f7);
		frmCinemaView.getContentPane().add(btn_f8);
		frmCinemaView.getContentPane().add(btn_g1);
		frmCinemaView.getContentPane().add(btn_g2);
		frmCinemaView.getContentPane().add(btn_g3);
		frmCinemaView.getContentPane().add(btn_g4);
		frmCinemaView.getContentPane().add(btn_g5);
		frmCinemaView.getContentPane().add(btn_g6);
		frmCinemaView.getContentPane().add(btn_g7);
		frmCinemaView.getContentPane().add(btn_g8);
		frmCinemaView.getContentPane().add(btnCancel);
		frmCinemaView.getContentPane().add(lblNewLabel);
		frmCinemaView.getContentPane().add(lblNewLabel_1);
		frmCinemaView.getContentPane().add(lblNewLabel_1_1);
		frmCinemaView.getContentPane().add(lblNewLabel_1_2);
		frmCinemaView.getContentPane().add(lblNewLabel_1_3);
		frmCinemaView.getContentPane().add(lblNewLabel_2);	
		frmCinemaView.getContentPane().add(lblNewLabel_1_4);						
		frmCinemaView.getContentPane().add(lblNewLabel_2_1);
		frmCinemaView.getContentPane().add(lblNewLabel_3);
		frmCinemaView.getContentPane().add(lblNewLabel_3_1);
		frmCinemaView.getContentPane().add(lblNewLabel_3_2);
		frmCinemaView.getContentPane().add(lblNewLabel_3_3);
		frmCinemaView.getContentPane().add(lblNewLabel_3_4);
		frmCinemaView.getContentPane().add(lblNewLabel_3_5);
		frmCinemaView.getContentPane().add(lblNewLabel_3_6);
		frmCinemaView.getContentPane().add(seatPlan);
	
		
		//actions
		btnCancel.addMouseListener(new cinemaViewController.Cancel());
		btn_a1.addActionListener(new cinemaViewController.buttona1());
		btn_a2.addActionListener(new cinemaViewController.buttona2());
		btn_a3.addActionListener(new cinemaViewController.buttona3());
		btn_a4.addActionListener(new cinemaViewController.buttona4());
		btn_a5.addActionListener(new cinemaViewController.buttona5());
		btn_a6.addActionListener(new cinemaViewController.buttona6());
		btn_a7.addActionListener(new cinemaViewController.buttona7());
		btn_a8.addActionListener(new cinemaViewController.buttona7());
		btn_b1.addActionListener(new cinemaViewController.buttonb1());
		btn_b2.addActionListener(new cinemaViewController.buttonb2());
		btn_b3.addActionListener(new cinemaViewController.buttonb3());
		btn_b4.addActionListener(new cinemaViewController.buttonb4());
		btn_b5.addActionListener(new cinemaViewController.buttonb5());
		btn_b6.addActionListener(new cinemaViewController.buttonb6());
		btn_b7.addActionListener(new cinemaViewController.buttonb7());
		btn_b8.addActionListener(new cinemaViewController.buttonb8());
		btn_c1.addActionListener(new cinemaViewController.buttonc1());
		btn_c2.addActionListener(new cinemaViewController.buttonc2());
		btn_c3.addActionListener(new cinemaViewController.buttonc3());
		btn_c4.addActionListener(new cinemaViewController.buttonc4());
		btn_c5.addActionListener(new cinemaViewController.buttonc5());
		btn_c6.addActionListener(new cinemaViewController.buttonc6());
		btn_c7.addActionListener(new cinemaViewController.buttonc7());
		btn_c8.addActionListener(new cinemaViewController.buttonc8());
		btn_d1.addActionListener(new cinemaViewController.buttond1());
		btn_d2.addActionListener(new cinemaViewController.buttond2());
		btn_d3.addActionListener(new cinemaViewController.buttond3());
		btn_d4.addActionListener(new cinemaViewController.buttond4());
		btn_d5.addActionListener(new cinemaViewController.buttond5());
		btn_d6.addActionListener(new cinemaViewController.buttond6());
		btn_d7.addActionListener(new cinemaViewController.buttond7());
		btn_d8.addActionListener(new cinemaViewController.buttond8());
		btn_e1.addActionListener(new cinemaViewController.buttone1());
		btn_e2.addActionListener(new cinemaViewController.buttone2());
		btn_e3.addActionListener(new cinemaViewController.buttone3());
		btn_e4.addActionListener(new cinemaViewController.buttone4());
		btn_e5.addActionListener(new cinemaViewController.buttone5());
		btn_e6.addActionListener(new cinemaViewController.buttone6());
		btn_e7.addActionListener(new cinemaViewController.buttone7());
		btn_e8.addActionListener(new cinemaViewController.buttone8());
		btn_f1.addActionListener(new cinemaViewController.buttonf1());
		btn_f2.addActionListener(new cinemaViewController.buttonf2());
		btn_f3.addActionListener(new cinemaViewController.buttonf3());
		btn_f4.addActionListener(new cinemaViewController.buttonf4());
		btn_f5.addActionListener(new cinemaViewController.buttonf5());
		btn_f6.addActionListener(new cinemaViewController.buttonf6());
		btn_f7.addActionListener(new cinemaViewController.buttonf7());
		btn_f8.addActionListener(new cinemaViewController.buttonf8());
		btn_g1.addActionListener(new cinemaViewController.buttong1());
		btn_g2.addActionListener(new cinemaViewController.buttong2());
		btn_g3.addActionListener(new cinemaViewController.buttong3());
		btn_g4.addActionListener(new cinemaViewController.buttong4());
		btn_g5.addActionListener(new cinemaViewController.buttong5());
		btn_g6.addActionListener(new cinemaViewController.buttong6());
		btn_g7.addActionListener(new cinemaViewController.buttong7());
		btn_g8.addActionListener(new cinemaViewController.buttong8());
		
	
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}