import java.time.LocalDate;

public class BankDetails extends BasePage {
    private int cardNr;
    private int cvv;
    private String fullName;
    private LocalDate expirationDate;

    public BankDetails() {
        this.cardNr = messageIntInput("please provide your card number: ");
        this.cvv = messageIntInput("please provide your cvv:");
        this.fullName = messageStringInput("Please provide your full name:");
        this.expirationDate = messageDateInput("Please provide your card's expiration date (ex. M/d/yyyy):");
    }

    public int getCardNr(){
        return cardNr;
    }

    public void setCardNr(){
        this.cardNr=messageIntInput("please provide your card number: ");
    }

    public int getCvv(){
        return cvv;
    }

    public void setCvv(){
        this.cvv=messageIntInput("please provide your cvv:");
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(){
        this.fullName=messageStringInput("Please provide your full name:");
    }

    public LocalDate getExpirationDate(){
        return expirationDate;
    }

    public void setExpirationDate(){
        this.expirationDate=messageDateInput("Please provide your card's expiration date (ex. M/d/yyyy):");
    }

}
