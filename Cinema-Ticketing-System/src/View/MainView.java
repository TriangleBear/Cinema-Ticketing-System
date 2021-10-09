package View;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import Controller.*;
import java.awt.event.ActionListener;


public class MainView {

    public static JFrame frmMainView;
    private JButton btnAdmin;

    public MainView() {
  
        frmMainView = new JFrame();
        frmMainView.setResizable(false);
        frmMainView.setTitle("YACKK Cinema Ticketing System");
        frmMainView.setBounds(100, 100, 1440, 682);
        frmMainView.setIconImage(null);
        frmMainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMainView.setLocationRelativeTo(null);
        frmMainView.getContentPane().setLayout(null);
        
        //interface
        JButton btnAdmin = new JButton("Admin");
        JButton btnCinemaOne = new JButton("");
        JButton btnCinemaTwo = new JButton("");
        JButton btnCinemaThree = new JButton("");
        JButton btnCinemaFour = new JButton("");
        JLabel lblBackground = new JLabel("");
        
        //button Admin modifications
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        btnAdmin.setBorder(compound);
        btnAdmin.setContentAreaFilled(false);
        btnAdmin.setFocusPainted(false);
        btnAdmin.setBorderPainted(false);
 
        
        // set bounds
        btnAdmin.setBounds(1240, 0, 205, 55);
        btnCinemaOne.setBounds(171, 233, 233, 315);
        btnCinemaTwo.setBounds(445, 233, 233, 315);
        btnCinemaThree.setBounds(718, 233, 233, 315);
        btnCinemaFour.setBounds(990, 233, 233, 315);
        lblBackground.setBounds(0, 0, 1426, 645);

        
        
        //content pane
        frmMainView.getContentPane().add(btnAdmin);
        frmMainView.getContentPane().add(btnCinemaOne);
        frmMainView.getContentPane().add(btnCinemaTwo);
        frmMainView.getContentPane().add(btnCinemaThree);
        frmMainView.getContentPane().add(btnCinemaFour);
        frmMainView.getContentPane().add(lblBackground);
        
        //setIcons
        btnAdmin.setIcon(new ImageIcon(MainView.class.getResource("/images/adminButton.png")));
        btnCinemaOne.setIcon(new ImageIcon(MainView.class.getResource("/images/endgame.jpg")));
        btnCinemaTwo.setIcon(new ImageIcon(MainView.class.getResource("/images/fivefeetapart.jpg")));
        btnCinemaThree.setIcon(new ImageIcon(MainView.class.getResource("/images/conjuring.jpg")));
        btnCinemaFour.setIcon(new ImageIcon(MainView.class.getResource("/images/whitechicks.jpg")));    
        lblBackground.setIcon(new ImageIcon(MainView.class.getResource("/images/HomeView.png")));
        
        
        btnCinemaOne.addMouseListener(new CinemaOneController.CinemaOne());
        btnCinemaTwo.addMouseListener(new CinemaTwoController.CinemaTwo());
        btnCinemaThree.addMouseListener(new CinemaThreeController.CinemaThree());
        btnCinemaFour.addMouseListener(new CinemaFourController.CinemaFour());
        btnAdmin.addMouseListener(new AdminController.adminClick());
    }
        
        public void setAddAction(ActionListener addAction){
            btnAdmin.addActionListener(addAction);
        }
    }