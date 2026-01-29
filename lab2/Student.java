public class Student {

    private String name;
    private int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1; 
    }


    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

   
    public int getYearOfStudy() {
        return yearOfStudy;
    }

   
    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

 
    public static void main(String[] args) {
        Student s = new Student("Aiala", 101);

        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("Year: " + s.getYearOfStudy());

        s.incrementYearOfStudy();
        System.out.println("After increment: " + s.getYearOfStudy());
    }
}
