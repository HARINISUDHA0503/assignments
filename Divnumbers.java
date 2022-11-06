package Exception;

public class Divnumbers {
    int result;
    public void division(int Firstnum,int Secondnum) {

        try {
            result = Firstnum / Secondnum;
        }
         catch (ArithmeticException e) {
        System.out.println("Divide by zero Exception");

            } finally {
                System.out.println("Result=" + result);
            }
        }
        public static void main (String[]args){
            Divnumbers d = new Divnumbers();
            d.division(25, 0);
        }
    }
