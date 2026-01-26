import java.util.Scanner;
public class prD{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a=scanner.nextInt();

        System.out.println("Enter b: ");
        double b = scanner.nextInt();

        System.out.println("Enter c: ");
        double c = scanner.nextInt();

        double D=b*b-4*a*c;
        if(D<0){
            System.out.println("Error: D is negative ");
        }else{
            double d=Math.sqrt(D);

            double x1 = (-b + d) / (2 * a);
            double x2 = (-b - d) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);


        }
    }
}