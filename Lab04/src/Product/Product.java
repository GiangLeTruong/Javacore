package Product;

import java.util.Scanner;

public class Product {
    //Attributes:
    private String productName;
    private double productPrice;
    private double countryTax;

    //Constructors:
    public Product(){
       this.productName = "";
       this.productPrice = 0;
       this.countryTax = 0;
    }


    public Product(String productName, double productPrice, double countryTax) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.countryTax = countryTax;
    }

    //Getter setter:
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getCountryTax() {
        return countryTax;
    }

    public void setCountryTax(double countryTax) {
        this.countryTax = countryTax;
    }

    //Methods:
    public void inputProductInfo()
    {
        System.out.println("-------------------------------------");
        System.out.println("Please enter Product Info: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter product name: ");
        this.productName = input.nextLine();
        System.out.println("Please enter product price: ");
        this.productPrice = input.nextDouble();
        System.out.println("Please enter country tax: ");
        this.countryTax = input.nextDouble();
        System.out.println("Input completed.");
        System.out.println("-------------------------------------");
    }

    public void printProductInfo()
    {
        System.out.println("Printing product info... ");
        System.out.println("Your product name is " + this.productName + " price is " + this.productPrice + "$ contrytax is " + this.countryTax+"$.");
    }

    public double getTaxPrice()
    {
        return this.countryTax*this.productPrice;
    }

}
