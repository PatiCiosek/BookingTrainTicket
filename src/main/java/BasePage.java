import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BasePage {
    private Scanner input = new Scanner(System.in);

    public String messageStringInput(String message){
        System.out.println(message);
        return input.nextLine();
    }

    public int messageIntInput(String message){
        System.out.println(message);
        return input.nextInt();
    }

    public LocalDate messageDateInput(String message){
        System.out.println(message);
        String UserInput=input.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy"); //put it into a method
        return LocalDate.parse(UserInput, dateFormat);
    }


}
