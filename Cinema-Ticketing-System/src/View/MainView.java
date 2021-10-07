package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView {

    JFrame frmMainview;
    
    //private final JLabel lblBackground = new JLabel("");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainView window = new MainView();
                    window.frmMainview.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MainView() {
        initialize();
    }
    

    /**
     * Initialize the contents of the frame.
     */
    
    private void initialize() {
        frmMainview = new JFrame();
        frmMainview.setResizable(false);
        frmMainview.setTitle("MainView");
        frmMainview.setBounds(100, 100, 1440, 682);
        frmMainview.setIconImage(null);
        frmMainview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMainview.setLocationRelativeTo(null);
        frmMainview.getContentPane().setLayout(null);
        
        //interface
        JButton btnAdmin = new JButton("Admin");
        JButton btnNewButton = new JButton("");
        JButton btnNewButton_2 = new JButton("");
        JButton btnNewButton3 = new JButton("");
        JButton btnNewButton4 = new JButton("");
        JLabel lblBackground = new JLabel("");
        lblBackground.setSize(1000,600);
        
        // set bounds
        btnAdmin.setBounds(1298, 0, 128, 32);
        btnNewButton.setBounds(171, 233, 233, 315);
        btnNewButton_2.setBounds(445, 233, 233, 315);
        btnNewButton3.setBounds(718, 233, 233, 315);
        btnNewButton4.setBounds(990, 233, 233, 315);
        lblBackground.setBounds(0, 0, 1426, 645);
        
        //content pane
        frmMainview.getContentPane().add(btnAdmin);
        frmMainview.getContentPane().add(btnNewButton);
        frmMainview.getContentPane().add(btnNewButton_2);
        frmMainview.getContentPane().add(btnNewButton3);
        frmMainview.getContentPane().add(btnNewButton4);
        frmMainview.getContentPane().add(lblBackground);
        
        //setIcons
        btnNewButton.setIcon(new ImageIcon(MainView.class.getResource("/images/endgame.jpg")));
        btnNewButton_2.setIcon(new ImageIcon(MainView.class.getResource("/images/fivefeetapart.jpg")));
        btnNewButton3.setIcon(new ImageIcon(MainView.class.getResource("/images/conjuring.jpg")));
        btnNewButton4.setIcon(new ImageIcon(MainView.class.getResource("/images/whitechicks.jpg")));    
        lblBackground.setIcon(new ImageIcon(MainView.class.getResource("/images/HomeView.png")));
        
        
        //lilipat mga to
        btnAdmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmMainview.setVisible(false);
                AdminLogin admin = new AdminLogin();
                admin.loginFrame.setVisible(true);
            }
        });

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmMainview.setVisible(false);
                CinemaView cinemaView = new CinemaView();
                cinemaView.frmSecondView.setVisible(true);
            }
        });

        
    }
}