package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class ticketView {

    private JFrame frmTicketView;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ticketView window = new ticketView();
                    window.frmTicketView.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public ticketView() {
        initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmTicketView = new JFrame();
        frmTicketView.setBounds(100, 100, 1168, 491);
        frmTicketView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTicketView.getContentPane().setLayout(null);
        
        
        //labels
        JLabel setTitle = new JLabel("TITLE:");
        JLabel setlblTitle = new JLabel("");
        JLabel lblDate = new JLabel("DATE : ");
        JLabel setlblDate = new JLabel("");
        JLabel lblSeat = new JLabel("Seat :");
        JLabel setlblSeat = new JLabel("");
        JLabel lblPrice = new JLabel("Price :");
        JLabel setlblPrice = new JLabel("");
        JLabel lblTime = new JLabel("Time :");
        JLabel setlblTime = new JLabel("");
        JLabel lblNewLabel = new JLabel("");
        
        
        //content panes
        frmTicketView.getContentPane().add(lblDate);
        frmTicketView.getContentPane().add(setTitle);
        frmTicketView.getContentPane().add(setlblTitle);
        frmTicketView.getContentPane().add(setlblDate);
        frmTicketView.getContentPane().add(lblSeat);
        frmTicketView.getContentPane().add(lblPrice);
        frmTicketView.getContentPane().add(lblTime);
        frmTicketView.getContentPane().add(setlblSeat);
        frmTicketView.getContentPane().add(setlblPrice);
        frmTicketView.getContentPane().add(setlblTime);
        frmTicketView.getContentPane().add(lblNewLabel);
        
        //set icon
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Joseph Colesio\\Desktop\\TicketGUI.png"));
        
        //set bounds
        lblDate.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
        lblDate.setBounds(121, 271, 96, 34);
        setTitle.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
        setTitle.setBounds(478, 58, 80, 34);
        setlblTitle.setBounds(488, 103, 259, 59);
        setlblDate.setBounds(187, 271, 231, 34);
        lblSeat.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSeat.setBounds(478, 253, 71, 24);
        lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPrice.setBounds(478, 307, 71, 24);
        lblTime.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblTime.setBounds(478, 355, 71, 24);
        setlblSeat.setBounds(537, 253, 231, 24);
        setlblPrice.setBounds(537, 307, 231, 24);
        setlblTime.setBounds(537, 355, 231, 24);
        lblNewLabel.setBounds(-74, 0, 1285, 452);
        
    }
}