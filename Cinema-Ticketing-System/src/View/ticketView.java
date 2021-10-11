package View;



import javax.swing.JFrame;
import javax.swing.JLabel;
import Controller.*;
import Model.*;
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
        
        //date
     
        
        //labels and button
        JLabel setlblTitle = new JLabel(Ticket.getCinemaMovie());
        JLabel setlblDate = new JLabel(Ticket.getCinemaDate());
        JLabel setlblPrice = new JLabel(Ticket.getCinemaPrice());
        JLabel setlblTime = new JLabel(Ticket.getCinemaTime());
        JLabel setlblCinema = new JLabel(Ticket.getCinemaNum());
        JButton btnPrint = new JButton("Print");
        JLabel setlblSeat = new JLabel(Ticket.getCinemaSeat());
        JLabel lblbackground = new JLabel("");
        
        // content pane
        frmTicketView.getContentPane().add(setlblTitle);
        frmTicketView.getContentPane().add(setlblDate);
        frmTicketView.getContentPane().add(setlblPrice);
        frmTicketView.getContentPane().add(setlblTime);
        frmTicketView.getContentPane().add(setlblSeat);
        frmTicketView.getContentPane().add(setlblCinema);
        frmTicketView.getContentPane().add(btnPrint);
        frmTicketView.getContentPane().add(lblbackground);
        
        //set bounds
        setlblTitle.setBounds(473, 97, 259, 59);
        setlblDate.setBounds(221, 248, 194, 34);
        setlblPrice.setBounds(524, 324, 225, 24);
        setlblTime.setBounds(524, 277, 208, 24);
        setlblCinema.setBounds(545, 167, 177, 24);
        btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnPrint.setBounds(0, 421, 1093, 34);
        setlblSeat.setBounds(524, 231, 225, 24);
        lblbackground.setBounds(-118, -28, 1285, 529);
        setlblTitle.setForeground(Color.LIGHT_GRAY);
        setlblTitle.setFont(new Font("SansSerif", Font.BOLD, 25));
        setlblDate.setForeground(Color.LIGHT_GRAY);
        setlblDate.setFont(new Font("SansSerif", Font.BOLD, 34));
        setlblPrice.setForeground(Color.LIGHT_GRAY);
        setlblPrice.setFont(new Font("SansSerif", Font.BOLD, 20));
        setlblTime.setForeground(Color.LIGHT_GRAY);
        setlblTime.setFont(new Font("SansSerif", Font.BOLD, 20));
        setlblCinema.setFont(new Font("SansSerif", Font.BOLD, 29));
        setlblCinema.setForeground(Color.LIGHT_GRAY);
        setlblSeat.setFont(new Font("SansSerif", Font.BOLD, 20));
        setlblSeat.setForeground(Color.LIGHT_GRAY);
        
        
        
        // set icon
        lblbackground.setIcon(new ImageIcon(ticketView.class.getResource("/images/FinalTicketGUI.png")));

        btnPrint.addMouseListener(new cinemaViewController.Print());
        
    }
}