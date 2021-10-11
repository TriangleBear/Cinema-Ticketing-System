package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import Model.*;
import View.*;

public class CinemaFourController {
	private Ticket ticket;
	private MainView main;
	private JFrame app;
	public static String cinema = "cinema4";
	public static String movie = "White Chicks";
	
	public CinemaFourController(Ticket ticket, MainView main, JFrame app) {
		this.ticket = ticket;
		this.main = main;
		this.app = app;
	}

	public static class CinemaFour implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	InfoView info = new InfoView();
    		info.frmInfoView.setVisible(true);
    		info.lblMovieTitle.setText("White Chicks");
    		Ticket ticket2 = new Ticket(null, movie, cinema, null, null, null, 0);
    		ticket2.setMovie(movie);
    		ticket2.setCinema(cinema);
    		try {
				System.out.println(ticket2.getCinema());
				System.out.println(ticket2.getMovie());
				System.out.println();
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