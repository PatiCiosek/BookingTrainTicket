import java.util.Scanner;

public class User extends BasePage {
    private String name;
    private String lastName;
    private int age;
    private BankDetails paymentInfo;

    public User() {
        this.name = messageStringInput("Name of passenger:");
        this.lastName = messageStringInput("Last name of passenger:");
        this.age = messageIntInput("Age of passenger:");
        this.paymentInfo = new BankDetails();
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name=messageStringInput("Name of passenger:");
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(){
        this.lastName=messageStringInput("Last name of passenger:");
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=messageIntInput("Age of passenger:");
    }

    public BankDetails getPaymentInfo(){
        return paymentInfo;
    }

    public void setPaymentInfo(BankDetails paymentInfo){
        this.paymentInfo=paymentInfo;
    }

}
