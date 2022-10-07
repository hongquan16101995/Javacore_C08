package bai1;

import java.util.Scanner;

//khởi tạo 1 lớp trong Java, tên lớp cùng tên với file chứa nó
public class Demo {
    //hàm siêu main: là hàm được gọi đầu tiên khi khởi chạy chương trình Java
    public static void main(String[] args) {
        //lớp Scanner: dùng để quét ở màn hình console những giá trị cần lấy sau nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        //System.out: xuất dữ liệu tương ứng ra màn hình console để hiển thị
//        System.out.println("Nhập gì đó: ");
//        double abc = scanner.nextDouble();
//        String demo = scanner.nextLine();

        //khai báo biến trong java: kiểu dữ liệu => tên biến => phép gán(=) => giá trị tương ứng
        //các kiểu dữ liệu nguyên thủy (premitive): bit, byte, short, int, long, float, double, char, boolean
        //các kiểu dữ liệu tham chiếu (reference): object

        //xuất dữ liệu vs print: các dữ liệu sẽ in liền kề trên 1 dòng
        System.out.print("abc");
        System.out.print("xyz");
        System.out.println();

        //xuất dữ liệu vs println: các dữ liệu sẽ in trên từng dòng riêng biệt
        System.out.println("abc");
        System.out.println("xyz");

        String a = "Tổng tiền: ";
        long b = 100000;
        //xuất dữ liệu vs printf: in dữ liệu thêm từ định dạng nhất định
        //%s,%d: định dạng in chuỗi và số
        // \n : định dạng để xuống dòng trong console
        System.out.printf("%s%20d%s",a,b," VND\n");
        System.out.printf("%s%20d%s",a,b," VND\n");
        System.out.printf("%s%20d%s",a,b," VND\n");
        System.out.printf("%s%20d%s",a,b," VND\n");
    }
}
