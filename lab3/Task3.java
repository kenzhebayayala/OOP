package lab3;

public class Task3 {
    public static void main(String[] args) {

        Task3_2 t1 = new Task3_2();         //0c
        Task3_2 t2 = new Task3_2(100);       // 100 C
        Task3_2 t3 = new Task3_2(32, 'F');   // 32 F

        System.out.println("t1 C: " + t1.getCelsius());
        System.out.println("t1 F: " + t1.getFahrenheit());

        System.out.println("t2 C: " + t2.getCelsius());
        System.out.println("t2 F: " + t2.getFahrenheit());

        System.out.println("t3 C: " + t3.getCelsius());
        System.out.println("t3 F: " + t3.getFahrenheit());

        t3.setBoth(0, 'C');
        System.out.println("t3 new F: " + t3.getFahrenheit());
    }
}
