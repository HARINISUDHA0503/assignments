package LocalDatePackage;
import java.time.*;
import java.time.LocalDateTime;


public class AtTimeMethod {
    public static void main(String[] args){
        LocalDate Date =LocalDate.of(2017,11,20);
        LocalDateTime DateTime = Date.atTime(1,20,3);
        System.out.println("Date and Time:"+DateTime);
        boolean before=LocalDate.parse("2019-11-20").isBefore(LocalDate.parse("2022-11-20"));
        System.out.println("Before:"+before);
        boolean after=LocalDate.parse("2019-11-20").isAfter(LocalDate.parse("2022-11-20"));
        System.out.println("after:"+after);
    }
}
