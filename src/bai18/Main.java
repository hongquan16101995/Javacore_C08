package bai18;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        MyThread myThread1 = new MyThread(product1, "Thread 1: ");
        MyThread myThread2 = new MyThread(product1, "Thread 2: ");
//        myThread2.start();
//        myThread1.start();

//        MyThread myThread3 = new MyThread(product1, "a");
//        myThread3.start();
//        myThread3.destroy();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        product1 = new Product();
        System.gc();
    }
}
