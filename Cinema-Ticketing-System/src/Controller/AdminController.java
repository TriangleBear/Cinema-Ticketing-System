package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import Model.*;
import View.*;

public class AdminController implements ActionListener {
	private JTextField txtFieldUsername;
	private JPasswordField passwordField;
	
	//Constructor
	public AdminController( JTextField txtFieldUsername, JPasswordField passwordField ) {
		this.txtFieldUsername = txtFieldUsername;
		this.passwordField = passwordField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String validUsername = "admin";
	    String validPassword = "yacckk";
         String username = txtFieldUsername.getText();
         String password = new String(passwordField.getPassword());
         
         if(validUsername.equals(username) &&
            validPassword.equals(password)) {
    
             JOptionPane.showMessageDialog( txtFieldUsername, "Login Successfully");
             AdminView adminview = new AdminView();
             adminview.adminViewFrame.setVisible(true);
             MainView Mview = new MainView(); 
             Mview.frmMainView.dispose();		 
         }
         
         else{
             JOptionPane.showMessageDialog(txtFieldUsername, "Invalid Account!");
	   }
	}

	public static class adminClick implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	AdminLogin admin = new AdminLogin();
        	admin.loginFrame.setVisible(true);
        	
        }

        @Override
        public void mousePressed(MouseEvent e) {
        	

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
	
	public static class adminBack implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        AdminView adminview = new AdminView();	
        adminview.adminViewFrame.dispose();
        MainView main = new MainView();
        main.frmMainView.setVisible(true);

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
	
	public static class adminCancel implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	
        	AdminLogin.loginFrame.dispose();
        	
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

	
}