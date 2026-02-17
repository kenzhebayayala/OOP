package lab3;

// GradeBookTest
import java.util.Scanner;

public class Task4_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Task4 course = new Task4(
                "CS101",
                "Object-Oriented Programming and Design",
                5,
                "None"
        );

        Task4_2 gb = new Task4_2(course);
        gb.displayMessage();

        System.out.println("\nPlease, input grades for students:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Student name: ");
            String name = sc.next();

            System.out.print("Grade: ");
            int grade = sc.nextInt();

            gb.addStudent(new Task4_4(name, i, grade));
        }

        gb.displayGradeReport();
        sc.close();
    }
}

