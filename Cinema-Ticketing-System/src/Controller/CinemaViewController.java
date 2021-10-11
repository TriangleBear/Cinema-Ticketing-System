package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Model.*;
import View.*;

public class cinemaViewController{
	private Ticket ticket;
	private MainView main;
	private static JButton btn_a1;
	private static JFrame app;
	public static String cinemaseatselected;
	public static int a1,a2,a3,a4,a5,a6,a7,a8;
	public static int b1,b2,b3,b4,b5,b6,b7,b8;
	public static int c1,c2,c3,c4,c5,c6,c7,c8;
	public static int d1,d2,d3,d4,d5,d6,d7,d8;
	public static int e1,e2,e3,e4,e5,e6,e7,e8;
	public static int f1,f2,f3,f4,f5,f6,f7,f8;
	public static int g1,g2,g3,g4,g5,g6,g7,g8;
	
	
	
	
	//Constructor
	public cinemaViewController(Ticket ticket, JButton btn_a1, MainView main ){
		this.ticket = ticket;
		this.main = main;
		this.btn_a1 = btn_a1;
		
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
	

	
	public static class Print implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
               	 for(int i=0; i<1; i++){
               		 JOptionPane.showMessageDialog(null, "Please Wait" );
               		 if(i==0){
               			 JOptionPane.showMessageDialog(null, "Done" );
                         ticketView.frmTicketView.dispose();
                         MainView.frmMainView.setVisible(true);
                         System.out.println(Ticket.getCinemaTime());
                         System.out.println(Ticket.getCinemaMovie());
                         System.out.println(Ticket.getCinemaSeat());
                         System.out.println(Ticket.getCinemaPrice());
                      	System.out.println(Ticket.getCinemaNum());
                     	System.out.println(Ticket.getCinemaDate());
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
	
	
	public static class buttona1 implements ActionListener{
	public void actionPerformed(ActionEvent ae){
		int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
	    JOptionPane.YES_NO_OPTION,
	    JOptionPane.QUESTION_MESSAGE);
		
	    if(result == JOptionPane.YES_OPTION){ 
	    	String action = ae.getActionCommand();
	    	if (action.equals("selecteda1")) {
	    		a1 = 1;
	        }
		CinemaView.frmCinemaView.dispose();
        String cinemaSeat = "A1";
        String cinemaMovie = Ticket.getCinemaMovie();
    	String cinemaTime = Ticket.getCinemaTime();
    	String cinemaPrice = Ticket.getCinemaPrice();
    	String cinemaNum = Ticket.getCinemaNum();
    	String cinemaDate = Ticket.getCinemaDate();
    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
                cinemaPrice); 
     	System.out.println(Ticket.getCinemaSeat());  	
     	System.out.println(Ticket.getCinemaMovie());
     	System.out.println(Ticket.getCinemaTime());
     	ticketView print = new ticketView();
     	print.frmTicketView.setVisible(true);
        
	}else
	{
        CinemaView.frmCinemaView.setVisible(true);
     	}
	
            
    }
		     
	}
	public static class buttona2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selecteda2")) {
		    		a2 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "A2";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttona3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selecteda3")) {
		    		a3 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "A3";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttona4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selecteda4")) {
		    		a4 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "A4";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttona5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selecteda5")) {
		    		a5 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "A5";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttona6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selecteda6")) {
		    		a6 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "A6";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttona7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selecteda7")) {
		    		a7 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "A7";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttona8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selecteda8")) {
		    		a8 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "A8";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb1")) {
		    		b1 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B1";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb2")) {
		    		b2 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B2";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb3")) {
		    		b3 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B3";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb4")) {
		    		b4 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B4";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb5")) {
		    		b5 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B5";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb6")) {
		    		b6 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B6";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb7")) {
		    		b7 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B7";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonb8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedb8")) {
		    		b8 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "B8";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedc1")) {
		    		c1 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C1";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
			    	String action = ae.getActionCommand();
			    	if (action.equals("selectedc2")) {
			    		c2 = 1;
			    	}
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C2";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
			    	String action = ae.getActionCommand();
			    	if (action.equals("selectedc3")) {
			    		c3 = 1;
			        }
		    
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C3";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    
			    	String action = ae.getActionCommand();
			    	if (action.equals("selectedc4")) {
			    		c4 = 1;
			        }
		    
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C4";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedc5")) {
		    		c5 = 1;
		        }
		    
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C5";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedc6")) {
		    		c6 = 1;
		        }
		    
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C6";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedc7")) {
		    		c7 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C7";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
	        
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
		
	            
	    }
			     
		}
	public static class buttonc8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedc8")) {
		    		c8 = 1;
		        }
		    
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "C8";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd1")) {
		    		d1 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D1";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd2")) {
		    		d2 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D2";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd3")) {
		    		d3 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D3";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd4")) {
		    		d4 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D4";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd5")) {
		    		d5 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D5";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd6")) {
		    		d6 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D6";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd7")) {
		    		d7 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D7";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttond8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedd8")) {
		    		d8 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "D8";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede1")) {
		    		e1 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E1";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede2")) {
		    		e2 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E2";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede3")) {
		    		e3 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E3";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede4")) {
		    		e4 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E4";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede5")) {
		    		e5 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E5";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede6")) {
		    		e6 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E6";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede7")) {
		    		e7 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E7";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttone8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectede8")) {
		    		e8 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "E8";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf1")) {
		    		f1 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F1";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf2")) {
		    		f2 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F2";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf3")) {
		    		f3 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F3";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf4")) {
		    		f4 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F4";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf5")) {
		    		f5 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F5";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf6")) {
		    		f6 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F6";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf7")) {
		    		f7 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F7";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttonf8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedf8")) {
		    		f8 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "F8";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong1 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg1")) {
		    		g1 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G1";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong2 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg2")) {
		    		g2 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G2";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong3 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg3")) {
		    		g3 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G3";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong4 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg4")) {
		    		g4 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G4";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong5 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg5")) {
		    		g5 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G5";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong6 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg6")) {
		    		g6 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G6";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong7 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg7")) {
		    		g7 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G7";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
	public static class buttong8 implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			int result = JOptionPane.showConfirmDialog(app,"Are you sure on the Selected Seats?", "Swing Tester",
		    JOptionPane.YES_NO_OPTION,
		    JOptionPane.QUESTION_MESSAGE);
		    if(result == JOptionPane.YES_OPTION){ 
		    	String action = ae.getActionCommand();
		    	if (action.equals("selectedg8")) {
		    		g8 = 1;
		        }
			CinemaView.frmCinemaView.dispose();
	        String cinemaSeat = "G8";
	        String cinemaMovie = Ticket.getCinemaMovie();
	    	String cinemaTime = Ticket.getCinemaTime();
	    	String cinemaPrice = Ticket.getCinemaPrice();
	    	String cinemaNum = Ticket.getCinemaNum();
	    	String cinemaDate = Ticket.getCinemaDate();
	    	Ticket ticket = new Ticket(cinemaMovie, cinemaNum, cinemaSeat, cinemaTime, cinemaDate,
	                cinemaPrice); 
	     	System.out.println(Ticket.getCinemaSeat());  	
	     	System.out.println(Ticket.getCinemaMovie());
	     	System.out.println(Ticket.getCinemaTime());
	     	System.out.println(Ticket.getCinemaNum());
	     	System.out.println(Ticket.getCinemaDate());
	     	ticketView print = new ticketView();
	     	print.frmTicketView.setVisible(true);
		}else
		{
	        CinemaView.frmCinemaView.setVisible(true);
	     	}
	    }
		}
}
	
