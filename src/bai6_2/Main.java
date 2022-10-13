package bai6_2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
//        animal.display();
//        dog.display();

        //casting
        //Animal bên trái: kiểu dữ liệu tham chiếu
        //Animal bên phải: kiểu dữ liệu thực tế
        //các phương thức có thể gọi được sẽ chạy theo kiểu dữ liệu thực tế
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Dog dog1 = new Dog();
//        animal1.display();
//        animal2.display();
        Animal[] animals = new Animal[3];
        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = (Animal) dog1;

        for (Animal a : animals) {
            a.display();
            //instanceof: xác định kiểu dữ liệu của biến
            //(Kiểu dữ liệu): ép kiểu tường minh, bắt buộc phải có khi sử dụng Dowmcasting
            //Downcasting để có thể sử dụng được phương thức của riêng lớp Dog
            if (a instanceof Dog) {
               ((Dog) a).makeNoise();
            }
        }
        //trong lúc biên dịch, JVM sẽ hiểu biến tham chiếu là thuộc kiểu dữ liệu tham chiếu
//        animal2.makeNoise();

        //upcasting
        Dog dog2 = new Dog();
        //ép kiểu ngầm định của upcasting: không cần dùng vẫn có thể ép lên thành 1 đối tượng cha
        Animal animal3 = (Animal) dog2;
        ((Dog)animal3).makeNoise();
    }
}
