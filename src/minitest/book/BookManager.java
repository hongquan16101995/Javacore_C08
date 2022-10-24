package minitest.book;

import minitest.ICRUDManager;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager implements ICRUDManager<Book> {
    private final ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    @Override
    public void add(int choice, Scanner scanner) {
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

    public void countProgrammingBookByLanguage() {
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

    public void countFictionBookByCategory() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("Viễn tưởng 1")) {
                    count++;
                }
            }
        }
        System.out.println("Số sách giả tưởng có thể loại Viễn tưởng 1 là: " + count);
    }

    public void countFictionBookByPrice() {
        int count = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                if (book.getPrice() < 100) {
                    count++;
                }
            }
        }
        System.out.println("Số sách giả tưởng có giá <100 là: " + count);
    }

    public void sumPrice() {
        double sumPrice = 0;
        for (Book book : books) {
            sumPrice += book.getPrice();
        }
        System.out.println("Tổng giá tiền sách là: " + sumPrice);
    }

    @Override
    public void update(Scanner scanner) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void display() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
