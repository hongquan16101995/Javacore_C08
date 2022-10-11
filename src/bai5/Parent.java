package bai5;

public class Parent {
    private void m1() {
        System.out.println("Private");
    }

    void m2() {
        System.out.println("Default");
    }

    protected void m3() {
        System.out.println("Protected");
    }

    public void m4() {
        System.out.println("Public");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        parent.m4();
        parent.m2();
        parent.m3();
    }
}

class Demo {
    static Parent parent = new Parent();

    public static void main(String[] args) {
        parent.m3();
    }
}
