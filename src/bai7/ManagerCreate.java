package bai7;

public class ManagerCreate implements Manager{
    @Override
    public void create() {
        System.out.println("M1");
    }

    @Override
    public void create1() {
        System.out.println("M2");
    }

    @Override
    public void create2() {
        System.out.println("M3");
    }

    public void m1() {
        System.out.println("HelloWorld");
    }
}
