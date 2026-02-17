//Analyzer

// gradebook log
package lab3;

import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task1 data = new Task1();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double value = Double.parseDouble(input);
                data.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number or Q.");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

        scanner.close();
    }
}
