package LocalDatePackage;
import java.time.*;

public class StringToDate {
    public  static void main(String[] args){
        String str=("2017-11-23");
        LocalDate d1str=LocalDate.parse(str);
        System.out.println("String to date: " + d1str);

    }
}
