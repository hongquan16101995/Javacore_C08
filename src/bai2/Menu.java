package bai2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("1. Hiển thị hình chữ nhật");
            System.out.println("2 .Hiển thị tam giá vuông (góc vuông trái trên)");
            System.out.println("3 .Hiển thị tam giá vuông (góc vuông trái dưới)");
            System.out.println("4 .Hiển thị tam giá vuông (góc vuông phải trên)");
            System.out.println("5 .Hiển thị tam giá vuông (góc vuông phải dưới)");
            System.out.println("6 .Hiển thị tam giác cân");
            System.out.println("0 .Thoát ");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                    System.out.println("Hiển thị hình chữ nhật: ");

                    break;
                case 2:
//                    System.out.println("Hiển thị tam giá vuông (góc vuông trái trên): ");

                    break;
                case 3:
//                    System.out.println("Hiển thị tam giá vuông (góc vuông trái dưới): ");

                    break;
                case 4:
//                    System.out.println("Hiển thị tam giá vuông (góc vuông phải trên): ");

                    break;
                case 5:
//                    System.out.println("Hiển thị tam giá vuông (góc vuông phải dưới): ");

                    break;
                case 6:
//                    System.out.println("Hiển thị tam giác cân: ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }while (choice != 0);
    }
}
