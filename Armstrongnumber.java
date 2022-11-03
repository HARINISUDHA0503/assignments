public class Armstrongnumber {
        public static void main (String[]args){
            int num=153;
            int arm=0;
            while(num>0){
                int rem=num%10;
                arm=arm+(rem*rem*rem);
                num=num/10;
            }
            System.out.println("Armstrong number:"+arm);
        }

    }

