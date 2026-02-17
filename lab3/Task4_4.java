package lab3;

// Student
public class Task4_4 {

    private String name;
    private int id;
    private int grade;

    public Task4_4(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + ", id: " + id + ", grade: " + grade;
    }
}

