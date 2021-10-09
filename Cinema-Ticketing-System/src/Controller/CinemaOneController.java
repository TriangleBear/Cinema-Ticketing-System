package Controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import Model.*;
import View.*;
public class CinemaOneController{
	private static Ticket ticket;
	private MainView main;
	private JFrame app;
	
	//Constructor
	public CinemaOneController(Ticket ticket, MainView main, JFrame app) {
		this.ticket = ticket;
		this.main = main;
		this.app = app;
	}



	public static class CinemaOne implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	InfoView info = new InfoView();
    		info.frmInfoView.setVisible(true);
    		info.lblMovieTitle.setText("Avengers: END GAME");
    		String cinema = "Avengers";
    		try {
				Ticket ticket2 = new Ticket(null, cinema, null, null, 0);
				System.out.println(ticket2.getCinema());
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