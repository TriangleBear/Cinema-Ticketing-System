package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import Controller.*;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

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
        JLabel setlblTitle = new JLabel("");
        JLabel setlblDate = new JLabel("");
        JLabel setlblSeat = new JLabel("");
        JLabel setlblPrice = new JLabel("");
        JLabel setlblTime = new JLabel("");
        JLabel setlblCinema = new JLabel("");
        JButton btnPrint = new JButton("Print");
        frmTicketView.getContentPane().add(setlblTitle);
        frmTicketView.getContentPane().add(setlblDate);
        frmTicketView.getContentPane().add(setlblSeat);
        frmTicketView.getContentPane().add(setlblPrice);
        frmTicketView.getContentPane().add(setlblTime);
        frmTicketView.getContentPane().add(setlblCinema);
        frmTicketView.getContentPane().add(btnPrint);
        setlblTitle.setBounds(463, 89, 259, 59);
        setlblDate.setBounds(217, 250, 194, 34);
        setlblSeat.setBounds(518, 232, 214, 24);
        setlblPrice.setBounds(518, 325, 231, 24);
        setlblTime.setBounds(518, 279, 214, 24);
        setlblCinema.setBounds(547, 171, 177, 24);
        btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnPrint.setBounds(0, 421, 1093, 34);
        JLabel lblNewLabel = new JLabel("");
        frmTicketView.getContentPane().add(lblNewLabel);
        
        // set icon
        lblNewLabel.setIcon(new ImageIcon(ticketView.class.getResource("/images/FinalTicketGUI.png")));
        lblNewLabel.setBounds(-118, -28, 1285, 529);
        
        

        
        
        btnPrint.addMouseListener(new CinemaViewController.Print());
        

    }
}