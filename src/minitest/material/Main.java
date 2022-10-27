package minitest.material;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaterialManager manager = new MaterialManager();
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm vật liệu");
            System.out.println("2. Sửa vật liệu theo id");
            System.out.println("3. Xóa vật liệu theo id");
            System.out.println("4. Hiển thị tất cả vật liệu");
            System.out.println("5. Hiển thị chênh lệch chiết khấu vật liệu");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            int choice = -1;
            try {
               choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Định dạng sai! Nhập lại!");
            }
            switch (choice) {
                case 1:
                    menuAddMaterial(scanner, manager);
                    break;
                case 2:
                    manager.update(scanner);
                    break;
                case 3:
                    manager.delete(scanner);
                    break;
                case 4:
                    manager.display();
                    break;
                case 5:
                    manager.displayByDiscount();
                    break;
                case 11:
                    manager.writeFile();
                    break;
                case 22:
                    manager.readFile();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void menuAddMaterial(Scanner scanner, MaterialManager manager) {
        do {
            System.out.println("Chọn vật liệu muốn tạo: ");
            System.out.println("1. Meat");
            System.out.println("2. CrispyFlour");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            int choice2 = -1;
            try {
                choice2 = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Định dạng sai! Nhập lại!");
            }
            if (choice2 == 0) {
                break;
            }
            manager.add(choice2, scanner);
        } while (true);
    }
}
