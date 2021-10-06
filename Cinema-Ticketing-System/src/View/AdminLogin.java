package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin {

	private JFrame loginFrame;
	private JTextField txtFieldUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
					window.loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginFrame = new JFrame();
		loginFrame.setResizable(false);
		loginFrame.getContentPane().setBackground(Color.DARK_GRAY);
		loginFrame.setBounds(100, 100, 505, 345);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setTitle("                                                 Admin Login");
		loginFrame.setLocationRelativeTo(null);
		loginFrame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(63, 69, 109, 27);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 22));
		loginFrame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(70, 138, 102, 27);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		loginFrame.getContentPane().add(lblPassword);
		
		txtFieldUsername = new JTextField();
		txtFieldUsername.setBounds(182, 57, 219, 39);
		loginFrame.getContentPane().add(txtFieldUsername);
		txtFieldUsername.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(63, 225, 128, 39);
		btnLogin.setEnabled(false);
		if(txtFieldUsername.getText() != ""  && passwordField.getPassword().length != 0 ) {
			btnLogin.setEnabled(true);
		}
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String validUsername = "admin";
		         String validPassword = "yacckk";
		         String username = txtFieldUsername.getText();
		         String password = new String(passwordField.getPassword());
		    
		         if(validUsername.equals(username) &&
		            validPassword.equals(password)) {
		             JOptionPane.showMessageDialog(loginFrame, "Login Successfully");
		         }else{
		             JOptionPane.showMessageDialog(loginFrame, "Invalid Account!");
		             
		         }
			}
		});
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginFrame.getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(283, 225, 128, 39);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainView main = new MainView();
				main.frmMainview.setVisible(true);
			}
		});
		btnCancel.setBackground(SystemColor.inactiveCaption);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		loginFrame.getContentPane().add(btnCancel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(182, 126, 219, 39);
		loginFrame.getContentPane().add(passwordField);
		
	}
}