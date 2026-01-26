
import java.util.Scanner;

public class prB{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        double a = sc.nextInt();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.println("Area of square is: " + area);
        System.out.println("Perimeter of square is: " + perimeter);
        System.out.println("Diagonal of square is: " + diagonal);
    }
}
