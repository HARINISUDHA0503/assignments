import java.util.Scanner;

public class arrayvalue {
    public static void main(String[]args){
        int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("The number is in array"+x);}
        }
        }
     }

