public class Marks {
    public static void main(String[]args){
        int a=60;
        int sub1=73;
        int sub2=45;
        int sub3=88;
        if(sub1>a && sub2>a && sub3>a){
            System.out.println("passed");}
        else if (sub1>a && sub2>a){
            System.out.println("promoted");}
        else if(sub2>a && sub3>a){
            System.out.println("promoted");}
        else if(sub1>a && sub3>a){
            System.out.println("promoted");}
        else{
            System.out.println("failed");
        }
    }
}
