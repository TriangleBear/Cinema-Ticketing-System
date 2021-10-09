package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.CinemaViewController;
import Model.Ticket;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class ticketView {

	public static JFrame frmTicketView;
	/**
	 * Create the application.
	 */
	public ticketView() {
        frmTicketView = new JFrame();
        frmTicketView.setTitle("Print Ticket");
        frmTicketView.setBounds(100, 100, 1103, 494);
        frmTicketView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmTicketView.getContentPane().setLayout(null);
        frmTicketView.setLocationRelativeTo(null);
        
        //labels and button
        JLabel setlblTitle = new JLabel(Ticket.getCinema().toString());
        JLabel setlblDate = new JLabel();
        JLabel setlblSeat = new JLabel(Ticket.getSeat());
        JLabel setlblPrice = new JLabel("");
        JLabel setlblTime = new JLabel(Ticket.getTime().toString());
        JLabel setlblCinema = new JLabel("");
        JButton btnPrint = new JButton("Print");
        JLabel lblNewLabel = new JLabel("");
        
        // content pane
        frmTicketView.getContentPane().add(setlblTitle);
        frmTicketView.getContentPane().add(setlblDate);
        frmTicketView.getContentPane().add(setlblSeat);
        frmTicketView.getContentPane().add(setlblPrice);
        frmTicketView.getContentPane().add(setlblTime);
        frmTicketView.getContentPane().add(setlblCinema);
        frmTicketView.getContentPane().add(btnPrint);
        frmTicketView.getContentPane().add(lblNewLabel);
        
        //set bounds
        setlblTitle.setBounds(463, 89, 259, 59);
        setlblDate.setBounds(217, 250, 194, 34);
        setlblSeat.setBounds(518, 233, 214, 24);
        setlblPrice.setBounds(518, 321, 231, 24);
        setlblTime.setBounds(518, 276, 214, 24);
        setlblCinema.setBounds(547, 171, 177, 24);
        btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnPrint.setBounds(0, 421, 1093, 34);
        lblNewLabel.setBounds(-118, -28, 1285, 529);
        
        
        // set icon
        lblNewLabel.setIcon(new ImageIcon(ticketView.class.getResource("/images/FinalTicketGUI.png")));

        btnPrint.addMouseListener(new CinemaViewController.Print());
        

    }
}