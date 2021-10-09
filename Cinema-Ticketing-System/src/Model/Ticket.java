package Model;
import java.util.Observable;
public class Ticket extends Observable
{
    private static String ticketNumber;
    private String cinemaNumber;
    private static String movieTime;
    private static  String cinemaSeat;
    private int price = 250;

    public Ticket(String tNumber, String cinema, String Seat, String Time, int price){
        this.ticketNumber = tNumber;
        this.cinemaNumber = cinema;
        this.cinemaSeat = Seat;
        this.movieTime = Time;
        this.price = price;
    }
    private void ticketChanged(){
        setChanged();
        notifyObservers();
    }
    public static String getTicket(){
        return ticketNumber;
    }
    public static String getSeat(){
        return cinemaSeat;
    }
    public String getCinema(){
        return cinemaNumber;
    }
    public String getTime(){
        return movieTime;
    }
    public int getPrice() {
        return price;
    }
    public void setTicket(String tNumber){
        this.ticketNumber = tNumber;
        ticketChanged();
    }
    public void setSeat(String Seat){
    this.cinemaSeat = Seat;
    ticketChanged();
    }
    public void setCinema(String cinema){
    this.cinemaNumber = cinema;
    ticketChanged();
    }
    public void setTime(String Time){
    this.movieTime = Time;
    ticketChanged();
    }
    public void setPrice(int price) {
    this.price = price;
    ticketChanged();
    }
}