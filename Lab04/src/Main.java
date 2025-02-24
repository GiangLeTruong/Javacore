import Product.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Product p1 = new Product();
        p1.inputProductInfo();
        p1.printProductInfo();

        double finalTax = p1.getTaxPrice();
        System.out.println("This is final tax: " + finalTax);

        Product p2 = new Product("Bicycle",5.2,4);
        p2.printProductInfo();
    }
}
