package bai19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hình thành biểu thức chính quy, search GG
        String regex = "[0-9]";
        //tạo đối tượng Pattern: dùng để biên dịch BTCQ về thành 1 đối tượng để sử dụng
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Nhập gì đó: ");
        //tạo 1 đối tượng Matcher để so khớp giữa regex đã biên dịch với dữ liệu truyền vào
        Matcher matcher = pattern.matcher(scanner.nextLine());
        //rút gọn phần tạo đối tượng Pattern
        Matcher matcher1 = Pattern.compile(regex).matcher(scanner.nextLine());
        //dùng trực tiếp phương thức matches của Partern
        Pattern.matches(regex, scanner.nextLine());
        //phương thức của đối tượng Matcher trả về boolean sau khi so khớp
        if (matcher.matches()) {
            System.out.println("OK");
        }
    }
}
