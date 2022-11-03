public class Interest {
        public static void main(String []args){
            double p,r,t,s_interest,c_interest;
            p=1500;
            r=5;
            t=3;
            s_interest=(p*r*t/100);
            c_interest=p*Math.pow(1+r/100,t);
            System.out.println("simple interest:"+s_interest);
            System.out.println("compund interest:"+c_interest);
        }
    }



