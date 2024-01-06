package Day38.Bank;

import java.util.Scanner;

public class SavingAccount extends  BankAccount {
  double interestRate;

  public SavingAccount(String accauntNumber, double balance, double interestRate) {
    super(accauntNumber, balance);
    this.interestRate = interestRate;
  }

  public void deposit(double amount) {
    balance += amount + (amount * interestRate / 100);
    System.out.println("successfully deposited to: " + accountNumber);

  }

  public void withdraw(double amount) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter pincode: ");
    int pinCode = scanner.nextInt();

    if (pinCode == this.pinCode) {

      if (amount > balance) {
        System.out.println("failed withdraw" + accountNumber);
      } else {
        balance -= amount;
        System.out.println("successfully" + accountNumber);
        System.out.println("remaining" + accountNumber);
      }
    }
    else {
      System.out.println("wrong pincode");
    }
  }
}