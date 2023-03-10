import java.time.LocalDate;

public class Checkout extends BasePage {
    BankDetails bankDetails;
    User user;

    public Checkout() {
        bankDetails = new BankDetails();
        user = new User();
    }

    public boolean isCardInDate() {
        LocalDate now = LocalDate.now();
        LocalDate expiryDate = bankDetails.getExpirationDate();
        boolean approved;
        if (expiryDate.isBefore(now)) {
            approved = false;
        } else approved = true;
        return approved;
    }

    public void printBookingInfo(User user) {
        if (isCardInDate()) {
            System.out.println("transaction approved");
            System.out.println("Booking info...");
            System.out.println(user.getName());

        } else System.out.println("Sorry something went wrong, please check if your card is valid");
    }
}
