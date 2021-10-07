package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Model.*;
import View.*;
public class CinemaOneController implements ActionListener {
	private Ticket ticket;
	private MainView main;
	private JFrame app;
	
	//Constructor
	public CinemaOneController(Ticket ticket, MainView main, JFrame app) {
		this.ticket = ticket;
		this.main = main;
		this.app = app;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//app.getContentPane().removeAll();
		CinemaView cinema = new CinemaView();
		cinema.frmCinemaView.setVisible(true);
		
//		app.validate();
//		app.repaint();
		
	}

}
