
package lab3;

public class Task2 {
    public static void main(String[] args) {

        Task2_2 p1 = new Task2_2(1, "Bread");
        Task2_2 p2 = new Task2_2(2, "Laptop", 500000, Category.ELECTRONICS);

        p1.setPrice(300, true);

        p1.printInfo();
        p2.printInfo();

        System.out.println("Total products: " + Task2_2.productCount);
    }
}
