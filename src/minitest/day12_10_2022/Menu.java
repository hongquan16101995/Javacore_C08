package minitest.day12_10_2022;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = Integer.parseInt(scanner.nextLine());
        // <=> int number = Integer.parseInt(scanner.nextLine())
        System.out.println("Nhập chữ");
        String str = scanner.nextLine();

        System.out.println("Number: " + number);
        System.out.println("String: " + str);
    }
}
