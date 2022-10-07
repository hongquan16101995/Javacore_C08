package bai2;

public class Demo {
    public static void main(String[] args) {
        A a = new A("A");
        test(a);
        System.out.println(a.name);
    }

    public static void test(A a) {
//        a = new A("B");
        a.name = "B";
    }
}
