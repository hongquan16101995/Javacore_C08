package bai15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println("Demo-try");
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ex) {
            //in lỗi đúng theo định dạng ban đầu; nhưng k làm chết chương trình
//            ex.printStackTrace();
            //in thông báo của lỗi
//            System.out.println(ex.getMessage());
            //in thông báo của lỗi nhưng có màu đỏ
//            System.err.println(ex.getMessage());
            //in 1 dòng rỗng
//            System.out.println();
            //in theo mong muốn của LTV
//            System.out.println("Hello");
            //1 khối lệnh khác trong catch
//            try {
//
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Demo-catch");
            //câu lệnh tắt chương trình, nên sẽ làm cho finally không chạy nữa
//            System.exit(0);
        }
        //khối chắc chắn được chạy (trừ system.exit)
        //là lựa chọn, có thể không có cũng không sao
        finally {
            System.out.println("Demo-finally");
        }
//        System.err.println("Demo");

        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
