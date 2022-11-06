package BasicDataStructure;

import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CTC AMOUNT=");
        double x = sc.nextDouble();
        System.out.println("ctc amount=" +x);
        double a;
        double b;
        double c;
        double d;
        double tax;
        if (x <= 180000) {
            System.out.println("Nil");
        } else if (x >= 180001 && x <= 300000) {
            tax = x/10;
            System.out.println("Tax amount="+tax);
        } else if (x >= 300001 && x <= 500000) {
            tax = x/20;
            System.out.println("Tax amount="+tax);
        } else if (x >= 500001 && x <= 1000000) {
            tax = x/30;
            System.out.println("Tax amount="+tax);
        }
    }
}