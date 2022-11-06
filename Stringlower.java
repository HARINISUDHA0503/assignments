package String;

public class Stringlower {
    public static void main(String []args){
        String txt = "Java String pool refers to a collection of String which are stored in heap memory";
        String txt1 = "java string pool refers to a collection of string which are stored in heap memory";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.replace('a','$'));
        System.out.println(txt.contains("collection"));
        System.out.println(txt.matches(txt1));
        System.out.println(txt.equalsIgnoreCase(txt1));
    }
}
