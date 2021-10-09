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
	private static Ticket ticket;
	private MainView main;
	private static JFrame app;
	public static String select;

	// Constructor
	public CinemaViewController(Ticket Ticket, MainView main, JFrame app) {
		this.ticket = Ticket;
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

			int result = JOptionPane.showConfirmDialog(app, "Are you sure on the Selected Seats?", "Swing Tester",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				CinemaView.frmCinemaView.dispose();
				ticketView print = new ticketView();
				print.frmTicketView.setVisible(true);
				System.out.println(select);
				System.out.println(Ticket.getCinema());
				System.out.println(Ticket.getTime());
			} else {
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
			for (int i = 0; i < 1; i++) {
				JOptionPane.showMessageDialog(null, "Please Wait");
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "Done");
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
	}
}