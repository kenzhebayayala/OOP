import java.util.Scanner;
public class prE{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance : ");
        int balance = scanner.nextInt();
        System.out.println("interest is 5% ");
        double interestRate = 0.05; 

        double interest = balance * interestRate;
        double newBalance = balance + interest;

        System.out.println("Initial balance: " + balance);
        System.out.println("Interest: " + interest);
        System.out.println("New balance: " + newBalance);
    }
}
