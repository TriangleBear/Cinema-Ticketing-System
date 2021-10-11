package View;
import Controller.*;
import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class AdminLogin {

	public static JFrame loginFrame;
	private JTextField txtFieldUsername;
	private JPasswordField passwordField;


	public AdminLogin() {
		
		loginFrame = new JFrame();
		loginFrame.setResizable(false);
		loginFrame.getContentPane().setBackground(Color.DARK_GRAY);
		loginFrame.setBounds(100, 100, 405, 245);
		loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		loginFrame.setTitle("                       "
				+ "                    Admin Login");
		loginFrame.setLocationRelativeTo(null);
		loginFrame.getContentPane().setLayout(null);
		
		
		//labels, buttons,text
		JLabel lblUsername = new JLabel("Username:");
		JLabel lblPassword = new JLabel("Password:");
		final JButton btnLogin = new JButton("Login");
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
		lblUsername.setBounds(43, 38, 109, 27);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPassword.setBounds(43, 87, 102, 27);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtFieldUsername.setBounds(162, 38, 189, 27);
		txtFieldUsername.setColumns(10);
		passwordField.setBounds(162, 87, 189, 27);
		btnLogin.setEnabled(false);
		btnLogin.setBounds(85, 143, 96, 29);
		btnLogin.setBackground(SystemColor.inactiveCaption);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancel.setBounds(218, 143, 96, 29);
		btnCancel.setBackground(SystemColor.inactiveCaption);
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtFieldUsername.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				if(txtFieldUsername.getText().length()>0) {
					btnLogin.setEnabled(true);
				}else {
					btnLogin.setEnabled(false);
				}
			}
		});
		
		btnLogin.addActionListener(new AdminController(txtFieldUsername, passwordField));
		btnCancel.addMouseListener(new AdminController.adminCancel());
		
	}
}