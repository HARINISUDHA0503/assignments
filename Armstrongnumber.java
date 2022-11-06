package BasicDataStructure;

public class Armstrongnumber {
        public static void main (String[]args){
            int num=153,orginalnum,arm=0;
            orginalnum=num;
            while(orginalnum>0){
                int rem=orginalnum%10;
                arm=arm+(rem*rem*rem);
                orginalnum=orginalnum/10;
            }
            if(arm==num){
            System.out.println(num+"is Armstrong number");
          }else {
                System.out.println(num+"is not a Armstrong number");
            }

}}

