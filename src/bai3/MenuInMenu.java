package bai3;

import java.util.Scanner;

public class MenuInMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("Enter choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1 thân switch");
                    break;
                case 2:
                    int choice2;
                    do {
                        System.out.println("2.1");
                        System.out.println("2.2");
                        System.out.println("2.3");
                        System.out.println("Enter choice2");
                        choice2 = scanner.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.println("2.1 thân switch");
                                break;
                            case 2:
                                System.out.println("2.2 thân switch");
                                break;
                            case 3:
                                System.out.println("2.3 thân switch");
                                break;
                        }
                    } while (choice2 != 0);
                    break;
                case 3:
                    System.out.println("3 thân switch");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
