package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import Model.*;
import View.*;

public class CinemaTwoController {
	private Ticket ticket;
	private MainView main;
	private JFrame app;
	
	public CinemaTwoController(Ticket ticket, MainView main, JFrame app) {
		this.ticket = ticket;
		this.main = main;
		this.app = app;
	}

	public static class CinemaTwo implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	InfoView info = new InfoView();
    		info.frmInfoView.setVisible(true);
    		info.lblMovieTitle.setText("Five Feet Apart");
    		String Cinema = "cinema2";
    		String Movie = "Five Feet Apart";
    		try {
				Ticket ticket2 = new Ticket(null, Movie, Cinema, null, null, null, 0);
				System.out.println(ticket2.getCinema());
				System.out.println(ticket2.getMovie());
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