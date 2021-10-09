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

public class InfoViewController implements ActionListener{
    
    private Ticket ticket;
    private MainView main;
    private JFrame app;
    private JButton btnDateConfirm;
    private JComboBox comboBoxTime;
	
	//Constructor
    public InfoViewController(Ticket Ticket, JButton btnDateConfirm, JComboBox comboBoxTime ) {
        this.ticket = Ticket;
        this.btnDateConfirm = btnDateConfirm;
        this.comboBoxTime = comboBoxTime;
    }
    
    public void actionPerformed(ActionEvent ae){
        String selectedChoice = comboBoxTime.getSelectedItem().toString();
        if (selectedChoice == "") {
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
        String cinematype = Ticket.getCinema();
        InfoView.frmInfoView.dispose();
        MainView.frmMainView.dispose();
        String time = String.valueOf(comboBoxTime.getSelectedItem());
        try {
            Ticket ticket2 = new Ticket(null, cinematype, null, time, null, 0);
            System.out.println(ticket2.getTime());
        } catch (NullPointerException a) {
            // TODO Auto-generated catch block
            System.out.println("ayaw gumana");
        }
    }
	
	public static class Cancel implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	InfoView.frmInfoView.dispose();
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