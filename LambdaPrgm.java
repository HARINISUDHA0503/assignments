import java.util.ArrayList;

public class LambdaPrgm {
    public static void main(String[]args){
        ArrayList<Integer>s = new ArrayList<Integer>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.forEach((n)->System.out.println(n));
    }
}
