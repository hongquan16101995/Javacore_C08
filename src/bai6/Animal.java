package bai6;

public class Animal {
    private String name;
    public int weight = 10;

    public Animal() {
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    protected Number makeNoise() {
        System.out.println("Tạo tiếng ồn");
        return 10;
    }

    public void display() {
        System.out.println("hihi");
    }
}
