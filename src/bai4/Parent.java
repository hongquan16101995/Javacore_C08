package bai4;

public class Parent {
    public void m1() {
        System.out.println("Parent");
    }

    protected void m10() {
        System.out.println("Test protected");
    }

    void m11() {
        System.out.println("Test protected");
    }

    static class Child1 {

    }

    class Child2 {

    }

    public static void main(String[] args) {
        Parent parent = new Parent();
    }
}

class Parent1 {

}

class Parent2 {
}
