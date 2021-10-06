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
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainview.setVisible(false);
				AdminLogin admin = new AdminLogin();
				admin.loginFrame.setVisible(true);
			}
		});
		btnAdmin.setBounds(1298, 0, 128, 32);
		frmMainview.getContentPane().add(btnAdmin);
		
		JButton btnNewButton = new JButton("Cinema 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainview.setVisible(false);
				CinemaView cinemaView = new CinemaView();
				cinemaView.frmSecondView.setVisible(true);
			}
		});
		btnNewButton.setBounds(22, 92, 335, 467);
		try {
		    btnNewButton.setIcon(new ImageIcon(MainView.class.getResource("/images/cinema11.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		frmMainview.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Cinema 2");
		btnNewButton_2.setBounds(367, 92, 335, 467);
		try {
		    btnNewButton_2.setIcon(new ImageIcon(MainView.class.getResource("/images/cinema22.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		frmMainview.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton3 = new JButton("Cinema 3");
		btnNewButton3.setBounds(712, 92, 335, 467);
		try {
		    btnNewButton3.setIcon(new ImageIcon(MainView.class.getResource("/images/cinema33.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		frmMainview.getContentPane().add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Cinema 4");
		btnNewButton4.setBounds(1057, 92, 335, 467);
		try {
		    btnNewButton4.setIcon(new ImageIcon(MainView.class.getResource("/images/cinema44.jpg")));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		frmMainview.getContentPane().add(btnNewButton4);
		
		JLabel lblBackground = new JLabel("");
		frmMainview.getContentPane().add(lblBackground);
		lblBackground.setIcon(new ImageIcon(MainView.class.getResource("/images/CURTAIN.jpg")));
		lblBackground.setSize(1000,600);
		lblBackground.setBounds(0, 0, 1426, 645);
		frmMainview.getContentPane().add(lblBackground);
		
	}
}
