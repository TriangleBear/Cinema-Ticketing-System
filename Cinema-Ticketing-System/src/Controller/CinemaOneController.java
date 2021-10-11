package Controller;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import Model.*;
import View.*;
public class CinemaOneController{
	private MainView main;
	private JFrame app;
	public static String cinema = "cinema1";
	public static String movie = "Avengers";
	//Constructor
	public CinemaOneController(MainView main, JFrame app) {
		this.main = main;
		this.app = app;
	}



	public static class CinemaOne implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        	InfoView info = new InfoView();
    		info.frmInfoView.setVisible(true);
    		info.lblMovieTitle.setText("Avengers: END GAME");
			Ticket ticket2 = new Ticket(null, movie, cinema, null, null, null, 0);
			ticket2.setMovie(movie);
    		ticket2.setCinema(cinema);
    		
    		try {
				System.out.println(Ticket.getMovie());
				System.out.println(Ticket.getCinema());
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