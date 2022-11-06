package LocalDateTimePackage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.temporal.ChronoField;

public class EgPrgm1 {
    public static void main(String[] args){
        LocalDateTime now= LocalDateTime.now();
        System.out.println("Before formatting: " + now);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatDateTime=now.format(format);
        System.out.println("After formatting: " + formatDateTime);
        System.out.println(now.get(ChronoField.DAY_OF_WEEK));
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));
    }
}
