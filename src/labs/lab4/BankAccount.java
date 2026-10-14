package labs.lab4;

public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;


    public BankAccount (){}

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void deposit(double amount){

        if (amount > 0){
          balance = balance + amount ;}

        else{
            System.out.println("Invalid Amount");}

        System.out.println("Deposited "+ amount + " New Total " + balance);
    }


    void withdraw(double amount){

        if( balance >= amount )
        {

            balance = balance - amount;
            System.out.println("Withdrawing "+ amount + " New Total " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }

    }

    @Override
    public String toString(){
        return "Account Holder " + accountHolder + ", \nAccount Number " + accountNumber + ", \nBalance " + balance;
    }





}
