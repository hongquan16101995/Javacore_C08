package bai5;

public class MainStatic {
    //block static: thành phần chạy trước main
    //thường dùng để khai báo các giá trị tĩnh
    static int num;

    static {
        num = 1111;
    }

    public static void main(String[] args) {
        StaticConcept.a = 100;

        System.out.println(num);

        StaticConcept staticConcept1 = new StaticConcept(1);
        StaticConcept staticConcept2 = new StaticConcept(2);
        StaticConcept staticConcept3 = new StaticConcept(3);
        staticConcept1.a = 1111;
        System.out.println(staticConcept1.a);
        System.out.println(staticConcept2.a);
        System.out.println(staticConcept3.a);

        StaticConcept.display();
//        StaticConcept.display1();
    }
}
