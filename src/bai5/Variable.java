package bai5;

import java.util.Scanner;

public class Variable {
    //biến global, chứa giá trị mặc định của kiểu dữ liệu nếu không được gán giá trị
    private static int a;
    private static int[] a1;

    public static void display() {
        //biến local, bắt buộc phải khởi tạo giá trị
        int b ;
        int[] ints;
        System.out.println(a);
//        System.out.println(b);
//        System.out.println(ints);
        System.out.println(a1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display();
    }
}
