package class_and_objects;

public class Product {

    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public static void main(String[] args) {
        Product obj= new Product("Mobile",15000.567,"Gadget");

        System.out.println("Printing price "+obj.price);
    }
}
