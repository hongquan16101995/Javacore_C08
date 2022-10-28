package bai17;

import java.io.Serializable;

public class MyProduct implements Serializable {
    private final String code;
    private String name;
    private String brand;
    private Double price;
    private String description;

    public MyProduct(String code, String name, String brand, Double price, String description) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyProduct{" +
                "code='" + getCode() + '\'' +
                ", name='" + getName() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
