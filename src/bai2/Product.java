package bai2;

public class Product {
    public String name;
    public int price;
    public String brand;
    public String description;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public Product(int price, String brand, String description) {
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public Product(String brand, String description, int price) {
        this.brand = brand;
        this.description = description;
        this.price = price;
    }

    public Product(String name, int price, String brand, String description) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }
}
