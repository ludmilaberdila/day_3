package Day38.Bank;

public class Main {
    public static void main(String[] args) {
    SavingAccount savingAccount = new SavingAccount("AC123", 0, 2);

    savingAccount.deposit(2000);
        System.out.println(savingAccount.balance);

        savingAccount.withdraw(2000);

        CheckingAccount checkingAccount = new CheckingAccount("CA123", 0,100);

        checkingAccount.deposit(500);
        System.out.println(checkingAccount.balance);

        checkingAccount.withdraw(601);
        System.out.println(checkingAccount.balance);
    }
}
