package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainView {

	JFrame frmMainview;

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
		
		//JFRAME
		frmMainview = new JFrame();
		frmMainview.setResizable(false);
		frmMainview.setTitle("MainView");
		frmMainview.setBounds(100, 100, 1440, 682);
		frmMainview.setIconImage(null);
		frmMainview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainview.setLocationRelativeTo(null);
		frmMainview.getContentPane().setLayout(null);
		
		//Admin Button
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBackground(Color.BLACK);
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setBounds(1298, 0, 128, 32);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainview.setVisible(false);
				AdminLogin admin = new AdminLogin();
				admin.loginFrame.setVisible(true);
			}
		});
		
		
		//Cinema1 Button
		JButton btnCinema1 = new JButton("Cinema 1");
		btnCinema1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainview.setVisible(false);
				CinemaView cinemaView = new CinemaView();
				cinemaView.frmSecondView.setVisible(true);
			}
		});
		btnCinema1.setBounds(174, 238, 225, 305);
		try {
		    btnCinema1.setIcon(new ImageIcon(MainView.class.getResource("/images/endgame.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		
		//Cinema2 Button
		JButton btnCinema2 = new JButton("Cinema 2");
		btnCinema2.setBounds(447, 238, 231, 305);
		try {
		    btnCinema2.setIcon(new ImageIcon(MainView.class.getResource("/images/fivefeetapart.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		
		//Cinema3 Button
		JButton btnCinema3 = new JButton("Cinema 3");
		btnCinema3.setBounds(721, 238, 225, 305);
		try {
		    btnCinema3.setIcon(new ImageIcon(MainView.class.getResource("/images/conjuring.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		
		//Cinema4 Button
		JButton btnCinema4 = new JButton("Cinema 4");
		btnCinema4.setBounds(994, 238, 225, 305);
		try {
		    btnCinema4.setIcon(new ImageIcon(MainView.class.getResource("/images/whitechicks.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		
		//Label Background
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(MainView.class.getResource("/images/HomeView.png")));
		lblBackground.setSize(1000,600);
		lblBackground.setBounds(0, 0, 1426, 645);
		
		frmMainview.getContentPane().add(btnCinema1);
		frmMainview.getContentPane().add(btnCinema2);
		frmMainview.getContentPane().add(btnCinema3);
		frmMainview.getContentPane().add(btnCinema4);
		frmMainview.getContentPane().add(btnAdmin);
		frmMainview.getContentPane().add(lblBackground);
		
	}
}
