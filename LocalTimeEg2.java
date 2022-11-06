package LocalTimePackage;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeEg2 {
    public static void main(String [] args){
        ZoneId zone1=ZoneId.of("Asia/Kolkata"); //ZoneId
        ZoneId zone2=ZoneId.of("Asia/Tokyo");
        LocalTime time1=LocalTime.now(zone1);
        System.out.println("Indian Time="+time1);
        LocalTime time2=LocalTime.now(zone2);
        System.out.println("Japan Time="+time2);
        long hours= ChronoUnit.HOURS.between(time1, time2);  // time between time1 and time2
        System.out.println("Hours betwwen two time="+hours);
    }
}
