package bai3;

public class Method1 {
    public static void main(String[] args) {
        Method1 method1 = new Method1();
        method1.display();
    }

    private void display() {
        System.out.println("HelloWorld");
    }

    public void display1() {
        System.out.println("ByeWorld");
        display();
    }

    public void display2(String value) {
        System.out.println(value);
        display3();
    }

    public static void display3() {
        System.out.println("Method static");
    }
}
