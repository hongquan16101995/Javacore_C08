package bai5;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        //không truy cập được private từ ngoài lớp
//        parent.m1();
        parent.m4();
        parent.m2();
        parent.m3();
    }
}

class Demo1 {
    static Parent parent = new Parent();

    public static void main(String[] args) {
        parent.m3();
    }
}
