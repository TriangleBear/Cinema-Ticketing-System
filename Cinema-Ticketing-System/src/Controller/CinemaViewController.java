package Controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Model.*;
import View.*;

public class CinemaViewController {
	public Ticket ticket;
	private static JFrame app;
	public static String select;
	public static String movie;
	public static String cinema;
	public static String Time;
	public static String Date;
	// Constructor
	public CinemaViewController(Ticket ticket, MainView main, JFrame app) {
		this.ticket = ticket;
		CinemaViewController.app = app;
	}

	public static class Cancel implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			CinemaView Cview = new CinemaView();
			Cview.frmCinemaView.dispose();
			MainView Mview = new MainView();
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
			movie = Ticket.getMovie();
			cinema = Ticket.getCinema();
			Time = Ticket.getTime();
			Date = Ticket.getDate();
			int result = JOptionPane.showConfirmDialog(app, "Are you sure on the Selected Seats?", "Swing Tester",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			if (result == JOptionPane.YES_OPTION) {
				Ticket ticket = new Ticket(null, movie, cinema, select, Time, Date, 0);
			ticket.setMovie(movie);
			ticket.setCinema(cinema);
			ticket.setSeat(select);
			ticket.setTime(Time);
			ticket.setDate(Date);
				System.out.println(movie);
				System.out.println(cinema);
				System.out.println(select);
				System.out.println(Time);
				System.out.println(Date);
				CinemaView.frmCinemaView.dispose();
				ticketView ticketV = new ticketView();
				ticketV.frmTicketView.setVisible(true);
			} else {
				CinemaView Cview = new CinemaView();
				Cview.frmCinemaView.setVisible(true);
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
			for (int i = 0; i < 1; i++) {
				JOptionPane.showMessageDialog(null, "Please Wait");
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "Done");
					ticketView ticketV = new ticketView();
					ticketV.frmTicketView.dispose();
					MainView Mview = new MainView();
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

	public static class toggleA1 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a1";
			} else {
				select = "";
			}
		}
	}

	public static class toggleA2 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a2";
			} else {
				select = "";
			}
		}
	}

	public static class toggleA3 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a3";
			} else {
				select = "";
			}
		}
	}

	public static class toggleA4 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a4";
			} else {
				select = "";
			}
		}
	}

	public static class toggleA5 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a5";
			} else {
				select = "";
			}
		}
	}

	public static class toggleA6 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a6";
			} else {
				select = "";
			}
		}
	}

	public static class toggleA7 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a7";
			} else {
				select = "";
			}
		}
	}

	public static class toggleA8 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "a8";
			} else {
				select = "";
			}
		}
	}public static class toggleB1 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b1";
			} else {
				select = "";
			}
		}
	}

	public static class toggleB2 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b2";
			} else {
				select = "";
			}
		}
	}

	public static class toggleB3 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b3";
			} else {
				select = "";
			}
		}
	}

	public static class toggleB4 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b4";
			} else {
				select = "";
			}
		}
	}

	public static class toggleB5 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b5";
			} else {
				select = "";
			}
		}
	}

	public static class toggleB6 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b6";
			} else {
				select = "";
			}
		}
	}

	public static class toggleB7 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b7";
			} else {
				select = "";
			}
		}
	}

	public static class toggleB8 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "b8";
			} else {
				select = "";
			}
		}
	}
	public static class toggleC1 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c1";
			} else {
				select = "";
			}
		}
	}

	public static class toggleC2 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c2";
			} else {
				select = "";
			}
		}
	}

	public static class toggleC3 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c3";
			} else {
				select = "";
			}
		}
	}

	public static class toggleC4 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c4";
			} else {
				select = "";
			}
		}
	}

	public static class toggleC5 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c5";
			} else {
				select = "";
			}
		}
	}

	public static class toggleC6 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c6";
			} else {
				select = "";
			}
		}
	}

	public static class toggleC7 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c7";
			} else {
				select = "";
			}
		}
	}

	public static class toggleC8 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "c8";
			} else {
				select = "";
			}
		}
	}
	public static class toggleD1 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d1";
			} else {
				select = "";
			}
		}
	}

	public static class toggleD2 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d2";
			} else {
				select = "";
			}
		}
	}

	public static class toggleD3 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d3";
			} else {
				select = "";
			}
		}
	}

	public static class toggleD4 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d4";
			} else {
				select = "";
			}
		}
	}

	public static class toggleD5 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d5";
			} else {
				select = "";
			}
		}
	}

	public static class toggleD6 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d6";
			} else {
				select = "";
			}
		}
	}

	public static class toggleD7 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d7";
			} else {
				select = "";
			}
		}
	}

	public static class toggleD8 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "d8";
			} else {
				select = "";
			}
		}
	}
	public static class toggleE1 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e1";
			} else {
				select = "";
			}
		}
	}

	public static class toggleE2 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e2";
			} else {
				select = "";
			}
		}
	}

	public static class toggleE3 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e3";
			} else {
				select = "";
			}
		}
	}

	public static class toggleE4 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e4";
			} else {
				select = "";
			}
		}
	}

	public static class toggleE5 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e5";
			} else {
				select = "";
			}
		}
	}

	public static class toggleE6 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e6";
			} else {
				select = "";
			}
		}
	}

	public static class toggleE7 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e7";
			} else {
				select = "";
			}
		}
	}

	public static class toggleE8 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "e8";
			} else {
				select = "";
			}
		}
	}
	public static class toggleF1 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f1";
			} else {
				select = "";
			}
		}
	}

	public static class toggleF2 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f2";
			} else {
				select = "";
			}
		}
	}

	public static class toggleF3 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f3";
			} else {
				select = "";
			}
		}
	}

	public static class toggleF4 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f4";
			} else {
				select = "";
			}
		}
	}

	public static class toggleF5 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f5";
			} else {
				select = "";
			}
		}
	}

	public static class toggleF6 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f6";
			} else {
				select = "";
			}
		}
	}

	public static class toggleF7 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f7";
			} else {
				select = "";
			}
		}
	}

	public static class toggleF8 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "f8";
			} else {
				select = "";
			}
		}
	}
	public static class toggleG1 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g1";
			} else {
				select = "";
			}
		}
	}

	public static class toggleG2 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g2";
			} else {
				select = "";
			}
		}
	}

	public static class toggleG3 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g3";
			} else {
				select = "";
			}
		}
	}

	public static class toggleG4 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g4";
			} else {
				select = "";
			}
		}
	}

	public static class toggleG5 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g5";
			} else {
				select = "";
			}
		}
	}

	public static class toggleG6 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g6";
			} else {
				select = "";
			}
		}
	}

	public static class toggleG7 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g7";
			} else {
				select = "";
			}
		}
	}

	public static class toggleG8 implements ItemListener {

		public void itemStateChanged(ItemEvent itemEvent) {
			int state = itemEvent.getStateChange();
			if (state == ItemEvent.SELECTED) {
				select = "g8";
			} else {
				select = "";
			}
		}
	}
}