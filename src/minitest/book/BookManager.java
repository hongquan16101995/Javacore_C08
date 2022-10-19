package minitest.book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    private final ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(int choice, Scanner scanner) {
        if (choice < 1 || choice > 3) {
            System.out.println("Lựa chọn không phù hợp, mời nhập lại!");
        } else {
            System.out.println("Nhập mã sách: ");
            String code = scanner.nextLine();
            System.out.println("Nhập tên sách: ");
            String name = scanner.nextLine();
            System.out.println("Nhập giá sách: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập tác giả sách: ");
            String author = scanner.nextLine();
            if (choice == 1) {
                books.add(new Book(code, name, price, author));
            } else if (choice == 2) {
                System.out.println("Nhập ngôn ngữ của sách: ");
                String language = scanner.nextLine();
                System.out.println("Nhập framework của sách: ");
                String framework = scanner.nextLine();
                books.add(new ProgrammingBook(code, name, price, author, language, framework));
            } else {
                System.out.println("Nhập thể loại của sách: ");
                String category = scanner.nextLine();
                books.add(new FictionBook(code, name, price, author, category));
            }
        }
    }

    public void countProgrammingJava() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("Số sách lập trình có ngôn ngữ Java là: " + count);
    }

    public void display() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
