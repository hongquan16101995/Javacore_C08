package bai18;

public class Demo implements Runnable{

    @Override
    public void run() {
        int a = 1;
        while (a <= 500) {
            try {
                Thread.sleep(100);
                System.out.println(a);
                a++;
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
