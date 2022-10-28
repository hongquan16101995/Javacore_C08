package bai18;

public class MyThread extends Thread {
    private Product product;
    private String name;

    public MyThread(Product product, String name) {
        this.product = product;
        this.name = name;
    }

    @Override
    public void run() {
        product.startTime();
    }

    @Override
    public void destroy() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println();
        }
        System.out.println(System.currentTimeMillis());;
    }
}
