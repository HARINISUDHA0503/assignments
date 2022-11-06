package BasicDataStructure;

public class Armstrongrange {
    public static void main(String[]args){
        for(int k=100;k<=999;k++){
            int n=k;
            int s=0;
            while(n>0){
               int d=n%10;
                s=s+(d*d*d);
                n=n/10;
            }
            if(k==s){
                System.out.println("The Armstrong number range between 100 to 999="+k);
            }
        }
    }
}
