package bai17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("Menu");
            System.out.println("1. Add product");
            System.out.println("2. Update product");
            System.out.println("3. Delete product");
            System.out.println("4. Display product");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
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
                    productManager.display();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
