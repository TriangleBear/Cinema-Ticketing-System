package Model;
import java.util.Observable;
public class Ticket extends Observable
{
    private String ticketNumber;
    private static String movie;
    private static String cinemaNumber;
    private static String movieTime;
    private static String dateNow;
    private static String cinemaSeat;
    private int price = 250;

    public Ticket(String tNumber, String movie, String cinema, String Seat, String Time, String Date, int price){
        this.ticketNumber = tNumber;
        this.cinemaNumber = cinema;
        this.movie = movie;
        this.cinemaSeat = Seat;
        this.movieTime = Time;
        this.dateNow = Date;
        this.price = price;
    }
    private void ticketChanged(){
        setChanged();
        notifyObservers();
    }
    public String getTicket(){
        return ticketNumber;
    }
    public static String getMovie() {
    	return movie;
    }
    public static String getCinema(){
        return cinemaNumber;
    }
    public static String getSeat(){
        return cinemaSeat;
    }
    public static String getTime(){
        return movieTime;
    }
    public static String getDate() {
    	return dateNow;
    }
    public int getPrice() {
        return price;
    }
    public void setTicket(String tNumber){
        this.ticketNumber = tNumber;
        ticketChanged();
    }
    public void setMovie(String movie) {
    	this.movie = movie;
    	ticketChanged();
    }
    public void setCinema(String cinema){
        this.cinemaNumber = cinema;
        ticketChanged();
    }
    public void setSeat(String Seat){
    this.cinemaSeat = Seat;
    ticketChanged();
    }
    
    public void setTime(String Time){
    this.movieTime = Time;
    ticketChanged();
    }
    public void setDate(String Date) {
    	this.dateNow = Date;
    	ticketChanged();
    }
    public void setPrice(int price) {
    this.price = price;
    ticketChanged();
    }
}