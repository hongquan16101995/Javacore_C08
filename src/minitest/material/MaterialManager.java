package minitest.material;

import minitest.ICRUDManager;
import minitest.book.Book;
import minitest.book.FictionBook;
import minitest.book.ProgrammingBook;

import java.util.ArrayList;
import java.util.Scanner;

public class MaterialManager implements ICRUDManager<Material> {
    private ArrayList<Material> materials;

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
                materials.add(new Material());
            } else if (choice == 2) {
                System.out.println("Nhập ngôn ngữ của sách: ");
                String language = scanner.nextLine();
                System.out.println("Nhập framework của sách: ");
                String framework = scanner.nextLine();
                materials.add(new Material());
            } else {
                System.out.println("Nhập thể loại của sách: ");
                String category = scanner.nextLine();
                materials.add(new Material());
            }
        }
    }

    @Override
    public void update(Scanner scanner) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public void display() {

    }
}
