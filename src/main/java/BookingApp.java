import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BookingApp extends BasePage {
    public User user;
    private String fromLocation;
    private String toLocation;
    private LocalDate departureDate;
    Checkout checkout;

    public BookingApp() {
        this.user = new User();
        this.fromLocation = messageStringInput("What's the departure city?");
        this.toLocation = messageStringInput("What's the destination city?");
        this.departureDate = messageDateInput("What's the departure date? (ex. M/d/yyyy)");
        checkout = new Checkout();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDepartureDate() {
        this.departureDate = messageDateInput("What's the departure date? (ex. M/d/yyyy)");
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = messageStringInput("What's the departure city?");
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation() {
        this.toLocation = messageStringInput("What's the destination city?");
    }
}
