package minitest.book;

import java.util.Scanner;

public class BookSystem {

    private final BookManager bookManager;
    private final Scanner scanner;

    public BookSystem() {
        this.bookManager = new BookManager();
        this.scanner = new Scanner(System.in);
    }

    public void menuBookManager() {
        do {
            System.out.println("MENU");
            System.out.println("1. Tạo sách");
            System.out.println("2. Tính tổng tiền");
            System.out.println("3. Đếm sách Java");
            System.out.println("4. Đếm sách Viễn tưởng");
            System.out.println("5. Đếm sách Fiction có giá <100");
            System.out.println("6. Hiển thị tất cả sách");
            System.out.println("0. Thoát");
            System.out.println("Mời nhập lựa chọn: ");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    menuCreateBook();
                    break;
                case 3:
                    bookManager.countProgrammingJava();
                    break;
                case 6:
                    bookManager.display();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private void menuCreateBook() {
        int choice2;
        do {
            System.out.println("Chọn loại sách muốn tạo: ");
            System.out.println("1. Sách thông thường");
            System.out.println("2. Sách lập trình");
            System.out.println("3. Sách khoa học");
            System.out.println("0. Thoát");
            choice2 = Integer.parseInt(scanner.nextLine());
            if (choice2 == 0) {
                break;
            }
            bookManager.addBook(choice2, scanner);
        } while (true);
    }
}
