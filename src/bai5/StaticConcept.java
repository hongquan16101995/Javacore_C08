package bai5;

public class StaticConcept {
    //thuộc tính static: thuộc về lớp, tiết kiệm bộ nhớ, thay đổi đồng bộ
    public static int a;
    public int b;

    public StaticConcept(int b) {
        this.b = b;
    }

    public static void display() {
        System.out.println("Hello");
        System.out.println(a);
        //do property b và method display1() được khởi tạo sau
        //nên display không nhìn thấy để trỏ đến
//        System.out.println(b);
//        display1();
    }

    public void display1() {
        System.out.println("Hello");
        System.out.println(a);
        System.out.println(b);
        display();
    }
}
