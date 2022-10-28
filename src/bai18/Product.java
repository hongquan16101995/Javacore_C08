package bai18;

public class Product {
    public synchronized void test(String name) {
        int a = 1;
        while (a <= 500) {
            System.out.println(name + a);
            a++;
        }
    }

    public void startTime() {
        System.out.println(System.currentTimeMillis());
    }
}
