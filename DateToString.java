package LocalDatePackage;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateToString {
    public static void main(String[] args){
        LocalDate d1=LocalDate.now();
        String d1str=d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date to String:"+d1str);
    }

}
