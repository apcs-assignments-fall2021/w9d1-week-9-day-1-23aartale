import java.util.Scanner;

public class DogsClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dogs dog = new Dogs(2,40);
        while (true){
            System.out.println("What command do you want to carry out?");
            System.out.println("(check age, celebrate birthday, check weight, add weight, subtract weight, or print summary) ");
            String choice = scan.nextLine();
            if (choice.equals("check age")){
                System.out.println(dog.checkAge());
            }
            else if (choice.equals("celebrate birthday")){
                dog.celebrateBirthday();
            }
            else if (choice.equals("check weight")){
                System.out.println(dog.checkWeight());
            }
            else if (choice.equals("add weight")){
                System.out.println("how much weight do you want to add?");
                int x = scan.nextInt();
                dog.addWeight(x);
            }
            else if (choice.equals("subtract weight")){
                System.out.println("how much weight do you want to subtract?");
                int x = scan.nextInt();
                dog.subtractWeight(x);
            }
            else if (choice.equals("print summary")) {
                System.out.println(dog.toString());
            }
        }
    }
}
