package String;

public class Stringbuilder {
    public static void main(String []args){
        StringBuilder sb1=new StringBuilder("StringBuffer");
        StringBuilder sb2=new StringBuilder("is a peer class of string");
        StringBuilder sb3=new StringBuilder("that provides much of");
        StringBuilder sb4=new StringBuilder("the same functionality as");
        StringBuilder sb=new StringBuilder("It is used to  specified index postion");
        sb.append(" in Java");
        System.out.println(sb);
        sb.insert(14,"insert text");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

