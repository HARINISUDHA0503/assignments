package String;

public class Stringbuffer {
    public static void main(String []args){
        StringBuffer sb1=new StringBuffer("StringBuffer");
        StringBuffer sb2=new StringBuffer("is a peer class of string");
        StringBuffer sb3=new StringBuffer("that provides much of");
        StringBuffer sb4=new StringBuffer("the same functionality as");
        StringBuffer sb=new StringBuffer("It is used to  specified index postion");
        sb.append(" in Java");
        System.out.println(sb);
        sb.insert(14,"insert text");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}

