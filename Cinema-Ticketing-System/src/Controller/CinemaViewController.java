package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import Model.*;
import View.*;

public class CinemaViewController{
    private Ticket ticket;
    private MainView main;
    private static JFrame app;
    
    //Constructor
    public CinemaViewController(Ticket ticket, MainView main, JFrame app) {
        this.ticket = ticket;
        this.main = main;
        this.app = app;
    }
    
    
    public static class Cancel implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            CinemaView.frmCinemaView.dispose();
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
    
    public static class Confirm implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            
            int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
                 if(result == JOptionPane.YES_OPTION){
                    CinemaView.frmCinemaView.dispose();
                     ticketView ticket = new ticketView();
                     ticket.frmTicketView.setVisible(true);
                 }else
                    {
                   CinemaView.frmCinemaView.setVisible(true);
                    }
        
            
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
    
    
    public static class Print implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
                    for(int i=0; i<1; i++){
                        JOptionPane.showMessageDialog(null, "Please Wait" );
                        if(i==0){
                            JOptionPane.showMessageDialog(null, "Done" );
                         ticketView.frmTicketView.dispose();
                         MainView.frmMainView.setVisible(true);
                         }
                        }      
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