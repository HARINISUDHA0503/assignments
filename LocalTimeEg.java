package LocalTimePackage;
import java.time.LocalTime;
public class LocalTimeEg {
    public static void main(String[] args){
        LocalTime Time=LocalTime.now();                     // to get correct time
       System.out.println("what is the Time now="+Time);
        LocalTime Specifictime= LocalTime.of(1,20,35); //of method
        System.out.println("time="+Specifictime);
        LocalTime Minushours=Time.minusHours(2);      //minusHours method
        System.out.println("minushours="+Minushours);
        LocalTime MinusMinutes=Time.minusMinutes(6);  //minusMinutes method
        System.out.println("minutes="+MinusMinutes);
        LocalTime PlusHours=Time.plusHours(2);         //plusHours method
        System.out.println("plusHours="+PlusHours);
    }
}
