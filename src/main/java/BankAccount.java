public class BankAccount {
    // Instance variables
    private int balance;
    private int accountNumber;
    private String preferredName;

    //Constructor
    public BankAccount(int b, int a, String p){
        balance = b;
        accountNumber = a;
        preferredName = p;
    }

    public void withdraw(int x){
        balance -= x;
    }

    public void deposit(int x){
        balance += x;
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getPreferredName(){
        return preferredName;
    }

    public void setPreferredName(String name){
        preferredName = name;
    }

    public String toString(){
        return "Your account number is " + accountNumber + "\n Your balance is " + balance;
    }
}