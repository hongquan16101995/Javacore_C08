package minitest.product;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Category> categories;

    static {
        categories = new ArrayList<>();
        categories.add(new Category("Smartphone"));
        categories.add(new Category("Laptop"));
        categories.add(new Category("Tablet"));
    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1. Add product");
            System.out.println("2. Update product by id");
            System.out.println("3. Delete product by id");
            System.out.println("4. Display all product");
            System.out.println("5. Display product by id");
            System.out.println("6. Display product by category");
            System.out.println("7. Sum price product");
            System.out.println("8. Display all product < 100000");
            System.out.println("9. Display all product < 100000 and category");
            System.out.println("10. Display all product by search name");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice < 0 || choice > 10) {
                    throw new RuntimeException();
                }
                switch (choice) {
                    case 1:
                        productManager.add(categories, scanner);
                        break;
                    case 2:
                        productManager.update(categories, scanner);
                        break;
                    case 3:
                        productManager.delete(scanner);
                        break;
                    case 4:
                        productManager.display();
                        break;
                    case 5:
                        productManager.displayById(scanner);
                        break;
                    case 6:
                        productManager.displayByCategory(categories, scanner);
                        break;
                    case 7:
                        productManager.sumPriceOfProducts();
                        break;
                    case 8:
                        productManager.displayProductByPriceLess100();
                        break;
                    case 9:
                        productManager.displayProductByPriceAndCategory();
                        break;
                    case 10:
                        productManager.displayProductByNameContaining(scanner);
                        break;
                    case 0:
                        System.exit(0);
                }
            } catch (Exception e) {
                System.err.println("Please re-enter your selection!");
            }
        } while (true);
    }
}
