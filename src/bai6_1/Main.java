package bai6_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(1);
        System.out.println(dog.weight);
        Animal animal = new Animal();
        animal.makeNoise();
        dog.makeNoise();

        dog.display();
        dog.display("hehe");
        Animal animal1 = new Dog();
        Animal[] animals = new Animal[10];
        animals[0] = animal;
        animals[1] = animal1;

        for (Animal a : animals) {
            if (a instanceof Dog) {
                System.out.println(((Dog) a).height);
            }
            System.out.println(a.weight);
        }

        Dog dog1 = new Dog();
        Animal animal2 = (Animal) dog1;
    }

    public Animal demo() {
        return new Animal();
    }
}
