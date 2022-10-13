package bai6_2;

public class Dog extends Animal {
    public String color;

    public Dog() {
    }

    public Dog(String name, int age, double weight, double height, String color) {
        super(name, age, weight, height);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public void display() {
        System.out.println("Đây là Dog");
    }

    public void makeNoise() {
        System.out.println("Gâu gâu");
    }
}
