package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Observable;

public class Ticket extends Observable {
	private  String ticketNum;
	private static String cinemaMovie;
	private static String cinemaNum;
	private static String cinemaSeat;
	private static String cinemaTime;
	private static String cinemaDate;
	private static String cinemaPrice = "PHP 250";
	

	

	public Ticket(String cinemaMovie, String cinemaNum, String cinemaSeat, String cinemaTime,
			String cinemaDate, String cinemaPrice){
		this.cinemaMovie = cinemaMovie;
		this.cinemaNum = cinemaNum;
		this.cinemaSeat = cinemaSeat;
		this.cinemaTime = cinemaTime;
		this.cinemaDate = cinemaDate;
		this.cinemaPrice = cinemaPrice;
	}

	private void ticketChanged() {
		setChanged();
		notifyObservers();
	}


	public static String getCinemaSeat() {
		return cinemaSeat;
	}

	public static String getCinemaNum() {
		return cinemaNum;
	}

	public static String getCinemaMovie() {
		return cinemaMovie;
	}

	public static String getCinemaTime() {
		return cinemaTime;
	}

	public static String getCinemaDate() {
		return cinemaDate;
	}

	public static String getCinemaPrice() {
		return cinemaPrice;
	}

	public void setCinemaTicket(String ticketNum) {
		this.ticketNum = ticketNum;
		ticketChanged();
	}

	public void setCinemaSeat(String cinemaSeat) {
		this.cinemaSeat = cinemaSeat;
		ticketChanged();
	}

	public void setCinemaMovie(String cinemaMovie) {
		this.cinemaMovie = cinemaMovie;
		ticketChanged();
	}


	public void setCinemaTime(String cinemaTime) {
		this.cinemaTime = cinemaTime;
		ticketChanged();
	}

	public void setCinemaDate(String cinemaDate) {
		this.cinemaDate = cinemaDate;
		ticketChanged();
	}

	public void setCinemaPrice(String cinemaPrice) {
		this.cinemaPrice = cinemaPrice;
		ticketChanged();
	}
}