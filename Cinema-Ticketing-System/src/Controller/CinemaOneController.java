package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Model.*;
import View.*;
public class CinemaOneController{
	private Ticket ticket;
	private MainView main;
	private JFrame app;
//	public static JLabel lblMovieTitle;
	
	//Constructor
	public CinemaOneController(Ticket ticket, MainView main, JFrame app) {
		this.ticket = ticket;
		this.main = main;
		this.app = app;
	//	this.lblMovieTitle = lblMovieTitle;
		
	}



	public static class CinemaOne implements MouseListener {
		
        @Override
        public void mouseClicked(MouseEvent e) {
        	InfoView info = new InfoView();
    		info.frmInfoView.setVisible(true);
    		info.lblMovieTitle.setText("Avengers: Endgame");
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