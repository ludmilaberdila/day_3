package Day38.Bank;

import java.util.Scanner;

public class CheckingAccount extends BankAccount{
    double overdraftLimit;
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
    }
    public void deposit( double amount){
        balance += amount;
        System.out.println("successfully deposit to: "+ accountNumber);
    }

    public void withdraw(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter pincode: ");
        int pinCode = scanner.nextInt();

        if (pinCode == this.pinCode) {
            if (amount <= (balance + overdraftLimit)) {
                balance -= amount;
                balance -= (amount / 100);
                System.out.println("successfully made withdraw: " + accountNumber);
            } else {
                System.out.println("overdraft limit in: " + accountNumber);
            }

        } else {
            System.out.println("wrong pinCode:");
        }
    }
}
