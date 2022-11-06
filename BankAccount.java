package Exception;
import java.util.Scanner;
public class BankAccount {
    double withdraw;
    double balance = 1110;
    long id;

    void SavingsAccount(long id, double balance){
        this.balance = balance;
        this.id = id;
    }
    void withdraw(double amount) throws InsuffcientBalanceExeption, IllegalBankTransactionException {
        if (balance < amount) {
            throw new InsuffcientBalanceExeption();
        }
        if (balance < (-amount)) {
            throw new IllegalBankTransactionException();
        }
        balance = balance - amount;
        System.out.println("Your Amount is withdraw succesfully");
    }

    public static void main(String[] args) throws InsuffcientBalanceExeption, IllegalBankTransactionException {
        Scanner sc = new Scanner(System.in);
        System.out.println("depositAccount");
        System.out.println("withdraw a amount=");
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw(sc.nextDouble());
    }

    class IllegalBankTransactionException extends Exception {
    }

    class InsuffcientBalanceExeption extends Exception {
    }
}