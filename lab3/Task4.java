package lab3;

// Course
public class Task4 {

    private String name;
    private String description;
    private int credits;
    private String prerequisites;

    public Task4(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return name + " " + description +
                " (" + credits + " credits, prereq: " + prerequisites + ")";
    }
}
