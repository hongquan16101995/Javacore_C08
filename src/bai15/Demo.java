package bai15;

import bai4.declare_class.Product;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        double price = 0;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Chương trình chạy không chính xác");
            System.exit(0);
        }
        Product product = new Product(name, price);
        System.out.println(product.getPrice());

    }
}
