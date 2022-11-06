package AssignmentsOnStream;
import java.util.*;
class Trader
{
    String name;
    String city;
    public Trader(String name, String city) {this.name = name;this.city = city;
    }
    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
class StreamsAssignment3 {
    public static void main(String args[])
    {
        List<Trader> trader=Arrays.asList(
                new Trader( "Harika", "Vizag"),
                new Trader( "Shyamu", "Bangalore"),
                new Trader( "Anusha", "Hyderabad")
        );
        System.out.println(trader);
    }
}


