package lab3;
//product
enum Category {
    FOOD, ELECTRONICS, CLOTHING
}

public class Task2_2 {

    public static int productCount;

    private final int id;

    private String name;
    private double price;
    private Category category;

    {
        productCount++;
    }

    public Task2_2(int id, String name) {
        this.id = id;          
        this.name = name;
        this.price = 0;
        this.category = Category.FOOD;
    }

    public Task2_2(int id, String name, double price, Category category) {
        this(id, name);       
        this.price = price;
        this.category = category;
    }

  
    public void setPrice(double price) {
        this.price = price;
    }

    public void setPrice(double price, boolean withTax) {
        this.price = withTax ? price * 1.12 : price;
    }

    public void printInfo() {
        System.out.println(id + " | " + name + " | " + price + " | " + category);
    }
}
