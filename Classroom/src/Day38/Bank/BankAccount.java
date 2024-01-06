package Day38.Bank;

public abstract class BankAccount {
    String accountNumber;
    double balance;
   final int pinCode = 1234;
    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit( double amount);

    public abstract void withdraw(double amount);

}
