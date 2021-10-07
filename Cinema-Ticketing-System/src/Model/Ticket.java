package Model;
import java.util.Observable;
public class Ticket extends Observable
{
    private String ticketNumber;
    private String cinemaSeat;
    private String movieTitle;
    private String movieTime;
    public Ticket(String tNumber, String Seat, String Title, String Time){
        this.ticketNumber = tNumber;
        this.cinemaSeat = Seat;
        this.movieTitle = Title;
        this.movieTime = Time;
    }
    private void ticketChanged(){
        setChanged();
        notifyObservers();
    }
    public String getTicket(){
        return ticketNumber;
    }
    public String getSeat(){
        return cinemaSeat;
    }
    public String getTitle(){
        return movieTitle;
    }
    public String getTime(){
        return movieTime;
    }
    public void setTicket(String tNumber){
        this.ticketNumber = tNumber;
        ticketChanged();
    }
    public void setSeat(String Seat){
    this.cinemaSeat = Seat;
    ticketChanged();
    }
    public void setTitle(String Title){
    this.movieTitle = Title;
    ticketChanged();
    }
    public void setTime(String Time){
    this.movieTime = Time;
    ticketChanged();
    }
}