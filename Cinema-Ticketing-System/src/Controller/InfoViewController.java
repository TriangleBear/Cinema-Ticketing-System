package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import Model.*;
import View.*;

public class infoViewController implements ActionListener{
    
    private Ticket ticket;
    private MainView main;
    private JFrame app;
    private JButton btnDateConfirm;
    private JComboBox comboBoxTime;
	
	//Constructor
    public infoViewController(Ticket Ticket, JButton btnDateConfirm, JComboBox comboBoxTime ) {
        this.ticket = Ticket;
        this.btnDateConfirm = btnDateConfirm;
        this.comboBoxTime = comboBoxTime;
    }
    
    public void actionPerformed(ActionEvent ae){
        int selectedChoice = comboBoxTime.getSelectedIndex();
        if (selectedChoice == 0) {
        btnDateConfirm.setEnabled(false);
        }
        else btnDateConfirm.setEnabled(true);
        
        if(btnDateConfirm.getModel().isArmed()){
            confirm();
        }
        
            
    }
    public void confirm() {
        CinemaView cinema = new CinemaView();
        cinema.frmCinemaView.setVisible(true);
        String cinematype = Ticket.getCinemaMovie();
        infoView.frmInfoView.dispose();
        MainView.frmMainView.dispose();
        String time = String.valueOf(comboBoxTime.getSelectedItem());
        String newprice = Ticket.getCinemaPrice();
        String cinemaDate = Ticket.getCinemaDate();
        String cinemaNum = Ticket.getCinemaNum();
        try {
			Ticket ticket2 = new Ticket(cinematype, cinemaNum, null, time, cinemaDate, newprice);
			System.out.println(ticket2.getCinemaTime());
		} catch (NullPointerException a) {
			// TODO Auto-generated catch block
			System.out.println("ayaw gumana");
		}
    }
	
	public static class Cancel implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	infoView.frmInfoView.dispose();
        	MainView.frmMainView.setVisible(true);
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
