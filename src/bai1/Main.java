package bai1;

import bai5.Parent;

public class Main extends Parent{
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m4();
        //không truy cập được phương thức default từ package ngoài
//        parent.m2();
        //không truy cập được phương thức protected từ package ngoài
//        parent.m3();
    }

    public void methodChild() {
        //phương thức của lớp con
        // không truy cập được default của cha
        // từ ngoài package
//        super.m2();
        //phương thức của lớp con
        // có thểtruy cập được protected của cha
        // từ ngoài package
        super.m3();
    }
}
