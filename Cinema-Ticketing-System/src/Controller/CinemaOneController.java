package Controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import Model.*;
import View.*;
public class CinemaOneController{
	private static Ticket ticket;
	private MainView main;
	private JFrame app;
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	static LocalDateTime now = LocalDateTime.now();
	
	
	//Constructor
	public CinemaOneController(Ticket ticket, MainView main, JFrame app) {
		this.ticket = ticket;
		this.main = main;
		this.app = app;
	}



	public static class CinemaOne implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	infoView info = new infoView();
    		info.frmInfoView.setVisible(true);
    		info.lblMovieTitle.setText("Avengers: END GAME");
    		String cinema = "Avengers";
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


