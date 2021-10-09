package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import View.*;
import Controller.*;
import Model.*;

public class InfoView {

	public static JFrame frmInfoView;
	private Ticket ticket;
	private JButton btnDateConfirm;
	private JComboBox comboBoxTime;
	public static JLabel lblMovieTitle;

	public InfoView() {
		
		String [] time = {"Select time","10:00am - 11:30am" , "2:00pm - 3:30pm","5:00pm - 6:30pm","8:00pm-9:30pm"};
		
		//frame
		frmInfoView = new JFrame();
		frmInfoView.setTitle("Movie Times");
		frmInfoView.setResizable(false);
		frmInfoView.setBounds(100, 100, 481, 309);
		frmInfoView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmInfoView.getContentPane().setLayout(null);
		frmInfoView.setLocationRelativeTo(null);
		
		//time
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime now = LocalDateTime.now();
		
		//GUI
		lblMovieTitle = new JLabel("");
		JLabel lbldateBackground = new JLabel("");
		JLabel lblinfoviewDate = new JLabel("Date :");
		JLabel lblDateNow = new JLabel(dtf.format(now));
		comboBoxTime = new JComboBox(time);
		JButton btndateCancel = new JButton("Cancel");
		btnDateConfirm = new JButton("Confirm");
		JLabel lblHeader = new JLabel("Selected Movie:");
		
		//GUI sets
		lblMovieTitle.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMovieTitle.setBounds(179, 35, 233, 26);
		lbldateBackground.setBounds(-67, -40, 593, 342);
		lbldateBackground.setBackground(Color.WHITE);
		lblinfoviewDate.setBackground(Color.WHITE);
		lblinfoviewDate.setForeground(new Color(0, 0, 0));
		lblinfoviewDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblinfoviewDate.setBounds(50, 75, 62, 29);
		lblDateNow.setForeground(new Color(0, 0, 0));
		lblDateNow.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDateNow.setBounds(122, 72, 144, 35);
		comboBoxTime.setBackground(new Color(245, 245, 220));
		comboBoxTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBoxTime.setBounds(50, 121, 362, 29);
		btndateCancel.setBounds(84, 167, 100, 35);
		btnDateConfirm.setBounds(258, 167, 100, 35);
		lblHeader.setForeground(new Color(0, 0, 0));
		lblHeader.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblHeader.setBounds(50, 35, 134, 29);
		lbldateBackground.setIcon(new ImageIcon(InfoView.class.getResource("/images/selectedDate.png")));
		
		
		//content panes
		frmInfoView.getContentPane().add(lblMovieTitle);
		frmInfoView.getContentPane().add(lblinfoviewDate);
		frmInfoView.getContentPane().add(lblDateNow);
		frmInfoView.getContentPane().add(comboBoxTime);
		frmInfoView.getContentPane().add(btndateCancel);
		frmInfoView.getContentPane().add(btnDateConfirm);
		frmInfoView.getContentPane().add(lblHeader);
		frmInfoView.getContentPane().add(lbldateBackground);
		
		btnDateConfirm.setEnabled(false);
		btnDateConfirm.addActionListener( new InfoViewController(ticket, btnDateConfirm, comboBoxTime));
		comboBoxTime.addActionListener(new InfoViewController (ticket, btnDateConfirm, comboBoxTime));
		
		
		btndateCancel.addMouseListener(new InfoViewController.Cancel());
		lblMovieTitle.addMouseListener(new CinemaOneController.CinemaOne());
		
	}
}