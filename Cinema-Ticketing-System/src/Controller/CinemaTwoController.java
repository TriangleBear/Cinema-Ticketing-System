package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import Model.*;
import View.*;

public class CinemaTwoController {
    private Ticket ticket;
    private MainView main;
    private JFrame app;
    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    static LocalDateTime now = LocalDateTime.now();
    
    public CinemaTwoController(Ticket ticket, MainView main, JFrame app) {
        this.ticket = ticket;
        this.main = main;
        this.app = app;
    }

    public static class CinemaTwo implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            infoView info = new infoView();
            info.frmInfoView.setVisible(true);
            info.lblMovieTitle.setText("Five Feet Apart");
            String cinema = "5 Feet Apart";
            String newprice = Ticket.getCinemaPrice();
            String cinemaDate = dtf.format(now);
            String cinemaNum = "1";
            try {
                Ticket ticket2 = new Ticket( cinema,  cinemaNum, null, null,cinemaDate, newprice); 
                System.out.println(ticket2.getCinemaMovie());
                System.out.println(ticket2.getCinemaDate());
                
            } catch (NullPointerException a) {
                // TODO Auto-generated catch block
                System.out.println("ayaw gumana");
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {}
        @Override
        public void mouseReleased(MouseEvent e) {}
        @Override
        public void mouseEntered(MouseEvent e) {}
        @Override
        public void mouseExited(MouseEvent e) {}
    }
    
}