import java.util.Scanner;

public class login {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter username:");
            String username = s.nextLine();
        System.out.print("Enter password:");
        String password = s.nextLine();

             if(username.equals("user") && (password.equals("pass")))
            {
                System.out.println("WELCOME"+ username);
            }
            else{
                for(int attempt =0;attempt<3;attempt++)
            {if(!(password.equals("PASSWORD"))){
             System.out.println("CONTACT ADMIN" );}
        }
    }}}
