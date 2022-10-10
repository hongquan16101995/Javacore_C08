package bai4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        //khai báo static-inner classes
        Parent.Child1 child1 = new Parent.Child1();

        //khai báo inner classes
        Parent parent = new Parent();
        Parent.Child2 child2 = parent.new Child2();
    }
}
