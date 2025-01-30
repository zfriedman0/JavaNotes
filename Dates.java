/*
 * Java does not have a built-in Date class, but we can import the `java.time` package to work with date and time API.
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now(); // Create a date object
        System.out.println(myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);

        System.out.println("Before formatting: " + myDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
