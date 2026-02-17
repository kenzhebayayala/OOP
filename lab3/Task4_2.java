package lab3;

// GradeBook
import java.util.ArrayList;

public class Task4_2 {

    private Task4 course;
    private ArrayList<Task4_4> students;

    public Task4_2(Task4 course) {
        this.course = course;
        students = new ArrayList<>();
    }

    public void addStudent(Task4_4 s) {
        students.add(s);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public double determineClassAverage() {
        int sum = 0;
        for (Task4_4 s : students) {
            sum += s.getGrade();
        }
        return (double) sum / students.size();
    }

    public Task4_4 getHighestStudent() {
        Task4_4 best = students.get(0);
        for (Task4_4 s : students) {
            if (s.getGrade() > best.getGrade()) {
                best = s;
            }
        }
        return best;
    }

    public Task4_4 getLowestStudent() {
        Task4_4 worst = students.get(0);
        for (Task4_4 s : students) {
            if (s.getGrade() < worst.getGrade()) {
                worst = s;
            }
        }
        return worst;
    }

    public void outputBarChart() {
        System.out.println("\nGrades distribution:");

        int[] freq = new int[11];

        for (Task4_4 s : students) {
            freq[s.getGrade() / 10]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10)
                System.out.print("100: ");
            else
                System.out.print(i * 10 + "-" + (i * 10 + 9) + ": ");

            for (int j = 0; j < freq[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void displayGradeReport() {
        System.out.printf("\nClass average is %.2f\n", determineClassAverage());

        Task4_4 high = getHighestStudent();
        Task4_4 low = getLowestStudent();

        System.out.println("Highest grade is " + high.getGrade() +
                " (" + high.getName() + ", id: " + high.getId() + ").");

        System.out.println("Lowest grade is " + low.getGrade() +
                " (" + low.getName() + ", id: " + low.getId() + ").");

        outputBarChart();
    }
}
