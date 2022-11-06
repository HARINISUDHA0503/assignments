package LocalDatePackage;

import java.time.LocalDate;

public class LocalDateEg {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalDate yesterday=date.minusDays(1);
        LocalDate tomorrow=date.plusDays(1);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);
    }
}