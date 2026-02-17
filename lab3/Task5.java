package lab3;

public class Task5 {
    public static void main(String[] args) {

        Task5_2 dragon = new Task5_2();

        // Example: B B G G
        dragon.kidnap(new Person("A", Gender.BOY));
        dragon.kidnap(new Person("B", Gender.BOY));
        dragon.kidnap(new Person("C", Gender.GIRL));
        dragon.kidnap(new Person("D", Gender.GIRL));

        System.out.println("Dragon eats? " + dragon.willDragonEatOrNot());
        System.out.println("Left count: " + dragon.leftCount());

        System.out.println("----");

        Task5_2 dragon2 = new Task5_2();
        // Example: G B G B
        dragon2.kidnap(new Person("E", Gender.GIRL));
        dragon2.kidnap(new Person("F", Gender.BOY));
        dragon2.kidnap(new Person("G", Gender.GIRL));
        dragon2.kidnap(new Person("H", Gender.BOY));

        System.out.println("Dragon eats? " + dragon2.willDragonEatOrNot());
        System.out.println("Left count: " + dragon2.leftCount());
    }
}
