package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class ticketView {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ticketView window = new ticketView();
                    window.frame.setVisible(true);
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
        frame = new JFrame();
        frame.setBounds(100, 100, 1168, 491);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("DATE : ");
        lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
        lblNewLabel_1.setBounds(121, 271, 96, 34);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("TITLE:");
        lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
        lblNewLabel_2.setBounds(478, 58, 80, 34);
        frame.getContentPane().add(lblNewLabel_2);
        
        JLabel lblTitle = new JLabel("");
        lblTitle.setBounds(488, 103, 259, 59);
        frame.getContentPane().add(lblTitle);
        
        JLabel lblDate = new JLabel("");
        lblDate.setBounds(187, 271, 231, 34);
        frame.getContentPane().add(lblDate);
        
        JLabel lblNewLabel_3 = new JLabel("Seat :");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_3.setBounds(478, 253, 71, 24);
        frame.getContentPane().add(lblNewLabel_3);
        
        JLabel lblNewLabel_3_1 = new JLabel("Price :");
        lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_3_1.setBounds(478, 307, 71, 24);
        frame.getContentPane().add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_1_1 = new JLabel("Time :");
        lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_3_1_1.setBounds(478, 355, 71, 24);
        frame.getContentPane().add(lblNewLabel_3_1_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(ticketView.class.getResource("/images/TicketGUI.png")));
        lblNewLabel.setBounds(-74, 0, 1285, 452);
        frame.getContentPane().add(lblNewLabel);
    }

}