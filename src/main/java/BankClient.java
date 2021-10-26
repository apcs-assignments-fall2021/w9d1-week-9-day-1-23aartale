import java.util.Scanner;

public class BankClient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your preferred name? ");
        String name = scan.nextLine();
        BankAccount account = new BankAccount(0, 101134, name);
        while (true) {
            System.out.println("Hi " + name + "! What command would you like to carry out? ");
            System.out.println("(withdraw/deposit/check balance/check account number/set preferred name/print summary)");
            String choice = scan.nextLine();
            if (choice.equals("withdraw")) {
                System.out.println("how much do you want to withdraw?");
                int x = scan.nextInt();
                account.withdraw(x);
            }

            else if (choice.equals("deposit")) {
                System.out.println("How much do you want to deposit?");
                int x = scan.nextInt();
                account.deposit(x);
            }

            else if (choice.equals("check balance")) {
                System.out.println(account.getBalance());
            }

            else if (choice.equals("check account number")) {
                System.out.println(account.getAccountNumber());
            }

            else if (choice.equals("set preferred name")) {
                System.out.println("What do you want to set it too?");
                name = scan.nextLine();
                account.setPreferredName(name);
            }

            else if (choice.equals("print summary")) {
                System.out.println(account.toString());
            }
//        // Create a bank account with the given name and the account number 101134
//        BankAccount account = new BankAccount(name, 101134);
        }
    }
}
