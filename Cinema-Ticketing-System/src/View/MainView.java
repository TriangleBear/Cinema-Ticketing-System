package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import View.*;
import Controller.*;
import Model.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class MainView {

    public JFrame frmMainView;
    private JButton btnAdmin;
    private Ticket ticket;
    private JFrame app;
    
    //private final JLabel lblBackground = new JLabel("");


    public MainView() {
        initialize();
    }
    
    private void initialize() {
        frmMainView = new JFrame();
        frmMainView.setResizable(false);
        frmMainView.setTitle("MainView");
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
        lblBackground.setSize(1000,600);
        
        // set bounds
        btnAdmin.setBounds(1298, 0, 128, 32);
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
        btnCinemaOne.setIcon(new ImageIcon(MainView.class.getResource("/images/endgame.jpg")));
        btnCinemaTwo.setIcon(new ImageIcon(MainView.class.getResource("/images/fivefeetapart.jpg")));
        btnCinemaThree.setIcon(new ImageIcon(MainView.class.getResource("/images/conjuring.jpg")));
        btnCinemaFour.setIcon(new ImageIcon(MainView.class.getResource("/images/whitechicks.jpg")));    
        lblBackground.setIcon(new ImageIcon(MainView.class.getResource("/images/HomeView.png")));
        
        btnCinemaOne.addActionListener(new CinemaOneController(ticket, null, app));
    }
        
        public void setAddAction(ActionListener addAction){
            btnAdmin.addActionListener(addAction);
        }

        	



//        
//        lilipat mga to
//        btnAdmin.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                frmMainView.setVisible(false);
//                AdminLogin admin = new AdminLogin();
//                admin.loginFrame.setVisible(true);
//            }
//        });

//        btnCinemaOne.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                frmMainView.setVisible(false);
//                CinemaView cinemaView = new CinemaView();
//                cinemaView.frmSecondView.setVisible(true);
//            }
//        });

    
    }
