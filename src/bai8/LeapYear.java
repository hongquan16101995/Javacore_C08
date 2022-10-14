package bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class LeapYear {
    private static final int FOUR = 4;
    private static final int ONE_HUNDRED = 100;
    private static final int FOUR_HUNDRED = 400;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHƯƠNG TRÌNH KIỂM TRA NĂM NHUẬN");
        System.out.println("Nhập vào năm bạn muốn kiểm tra: ");
        int year = Integer.parseInt(scanner.nextLine());
        display(year, isLeapYear(year));
        if (isLeapYear(year)) {
            System.out.println(year + 1);
        } else {
            System.out.println(year - 1);
        }
        //magic value: các giá trị trực quan và cố định trong chương trình
        //tách biến: đưa các biểu thức thành các biến để tái sử dụng nếu cần
        //tách phương thức: đưa 1 khối code hoặc 1 nhóm câu lệnh mà có nhu cầu sử dụng nhiều lần
        //trở thành 1 phương thức

    }

    public static boolean isLeapYear(int year) {
        boolean isDivisionByFour = (year % LeapYear.FOUR == 0);
        boolean isDivisionByOneHundred = (year % LeapYear.ONE_HUNDRED == 0);
        boolean isDivisionByFourHundred = (year % LeapYear.FOUR_HUNDRED == 0);
        if (isDivisionByFour) {
            if (isDivisionByOneHundred) {
                return isDivisionByFourHundred;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void display(int year, boolean check) {
        if (check) {
            System.out.println(year + " là một năm nhuận");
        } else {
            System.out.println(year + " không là một năm nhuận");
        }
    }
}
