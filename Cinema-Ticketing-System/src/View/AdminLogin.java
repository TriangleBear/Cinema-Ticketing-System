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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AdminLogin {

	JFrame loginFrame;
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
		
		//labels, buttons,text
		JLabel lblUsername = new JLabel("Username:");
		JLabel lblPassword = new JLabel("Password:");
		JButton btnLogin = new JButton("Login");
		JButton btnCancel = new JButton("Cancel");
		txtFieldUsername = new JTextField();
		passwordField = new JPasswordField();
		
		
		//content panes
		loginFrame.getContentPane().add(lblUsername);
		loginFrame.getContentPane().add(lblPassword);
		loginFrame.getContentPane().add(txtFieldUsername);
		loginFrame.getContentPane().add(passwordField);
		loginFrame.getContentPane().add(btnLogin);
		loginFrame.getContentPane().add(btnCancel);
		
		//set bounds
		
		lblUsername.setBounds(63, 69, 109, 27);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPassword.setBounds(70, 138, 102, 27);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtFieldUsername.setBounds(182, 57, 219, 39);
		txtFieldUsername.setColumns(10);
		passwordField.setBounds(182, 126, 219, 39);
		btnLogin.setEnabled(false);
		btnLogin.setBounds(63, 225, 128, 39);
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(283, 225, 128, 39);
		btnCancel.setBackground(SystemColor.inactiveCaption);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtFieldUsername.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(txtFieldUsername.getText().length()>0) {
					btnLogin.setEnabled(true);
				}else {
					btnLogin.setEnabled(false);
				}
			}
		});
		
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
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginFrame.setVisible(false);
				MainView main = new MainView();
				main.frmMainView.setVisible(true);
			}
		});
	
		
		
		
		
	}
}