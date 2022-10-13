package bai6_2;

public class Animal {
    public String name;
    public int age;
    public double weight;
    public double height;

    public Animal() {
    }

    public Animal(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void display() {
        System.out.println("Đây là Animal");
    }
}
