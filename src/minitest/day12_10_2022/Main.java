package minitest.day12_10_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tạo 1 đối tượng quản lý Product
        ProductManager productManager = new ProductManager();
        //tạo menu lựa chọn tính năng chương trình
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Cập nhật sản phẩm theo vị trí");
            System.out.println("3. Xóa sản phẩm theo vị trí");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Hiển thị sản phẩm có giá cao nhất");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    productManager.updateProduct(scanner);
                    break;
                case 3:
                    productManager.deleteProduct(scanner);
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.displayMaxPriceProduct();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
