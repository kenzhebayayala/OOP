
import java.util.Scanner; 
public class prC{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int score=scanner.nextInt();

        if (score >= 95)
            System.out.println("A+");
        else if (score >= 90 && score<=94)
            System.out.println("A");
        else if (score >= 85 && score <= 89)
            System.out.println("A-");
        else if (score >= 80 && score <= 84)
            System.out.println("B+");
        else if (score >= 75 && score <= 79)
            System.out.println("B");
        else if (score >= 70 && score <= 74)
            System.out.println("B-");
        else if (score >= 65 && score <= 69)
            System.out.println("C+");
        else if (score >= 60 && score <= 64)
            System.out.println("C");
        else if (score >= 55 && score <= 59)
            System.out.println("C-");
        else if (score >= 50 && score <= 54)
            System.out.println("D");
        else
            System.out.println("F");
    }
}