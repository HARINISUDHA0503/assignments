package LocalDateTimePackage;
import java.time.*;
import java.time.LocalDate;
import java.time.temporal.Temporal;

public class PeriodEg {
    public static void main(String[] args){
        Period period = Period.ofDays(26);
        Temporal temp=period.addTo(LocalDate.now());
        System.out.println("PeriodEg: " +temp);
        Period period1=Period.of(2017,05,11);
        System.out.println("period in string: " +period1.toString());

    }
}
