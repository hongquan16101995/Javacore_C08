package minitest.product;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager() {
        products = readFile();
    }

    public void add(ArrayList<Category> categories, Scanner scanner) {
        try {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter price: ");
            Double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter quantity: ");
            Integer quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter category: ");
            Category category = getCategoryByIndex(categories, scanner);
            products.add(new Product(name, price, quantity, category));
            writeFile();
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(ArrayList<Category> categories, Scanner scanner) {
        try {
            System.out.println("Enter id of product you want update: ");
            Long id = Long.parseLong(scanner.nextLine());
            Product productUpdate;
            if ((productUpdate = checkExist(id)) != null) {
                System.out.println("Enter new name: ");
                String name = scanner.nextLine();
                if (!name.equals("")) {
                    productUpdate.setName(name);
                }
                System.out.println("Enter new price: ");
                String price = scanner.nextLine();
                if (!price.equals("")) {
                    productUpdate.setPrice(Double.parseDouble(price));
                }
                System.out.println("Enter new quantity: ");
                String quantity = scanner.nextLine();
                if (!quantity.equals("")) {
                    productUpdate.setQuantity(Integer.parseInt(quantity));
                }
                System.out.println("Enter new category: ");
                Category category;
                if ((category = getCategoryByIndex(categories, scanner)) != null) {
                    productUpdate.setCategory(category);
                }
                writeFile();
            } else {
                System.err.println("Not exist product have id!");
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public void delete(Scanner scanner) {
        try {
            System.out.println("Enter id of product you want delete: ");
            Long id = Long.parseLong(scanner.nextLine());
            Product productDelete;
            if ((productDelete = checkExist(id)) != null) {
                products.remove(productDelete);
                writeFile();
            } else {
                System.err.println("Not exist product have id!");
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public void display() {
        System.out.printf("%-10s%-10s%-15s%-20s%s", "ID", "Name", "Price", "Quantity", "Category\n");
        for (Product p : products) {
            p.display();
        }
    }

    public void displayById(Scanner scanner) {
        try {
            System.out.println("Enter id of product you want display: ");
            Long id = Long.parseLong(scanner.nextLine());
            Product product;
            if ((product = checkExist(id)) != null) {
                System.out.println(product);
            } else {
                System.err.println("Not exist product have id!");
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayByCategory(ArrayList<Category> categories, Scanner scanner) {
        System.out.println("Enter your choice: ");
        Category category = getCategoryByIndex(categories, scanner);
        if (category != null) {
            for (Product p : products) {
                if (p.getCategory().equals(category)) {
                    System.out.println(p);
                }
            }
        } else {
            System.err.println("Not exist product have category!");
        }
    }

    public void sumPriceOfProducts() {
        Double price = 0.0;
        for (Product p : products) {
            price += p.getPrice();
        }
        System.out.println("Sum price of products is: " + price);
    }

    public void displayProductByPriceLess100() {
        System.out.println("List product have price less than 100000: ");
        for (Product p : products) {
            if (p.getPrice().compareTo(100000.0) < 0) {
                System.out.println(p);
            }
        }
    }

    public void displayProductByPriceAndCategory() {
        System.out.println("List product have price less than 100000 and category is \"Smartphone\": ");
        for (Product p : products) {
            if (p.getPrice().compareTo(100000.0) < 0 && p.getCategory().getName().equals("Smartphone")) {
                System.out.println(p);
            }
        }
    }

    public void displayProductByNameContaining(Scanner scanner) {
        System.out.println("Enter character you want search: ");
        String search = scanner.nextLine();
        System.out.println("List product have name contains " + search + ": ");
        for (Product p : products) {
            if (p.getName().contains(search)) {
                System.out.println(p);
            }
        }
    }

    private Category getCategoryByIndex(ArrayList<Category> categories, Scanner scanner) {
        for (int i = 0; i < categories.size(); i++) {
            System.out.println((i + 1) + ". " + categories.get(i).getName());
        }
        System.out.println("0. Not choice");
        int choice;
        try {
            do {
                System.out.println("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) {
                    return null;
                }
                if (choice > 0 && choice <= categories.size()) {
                    return categories.get(choice - 1);
                }
                System.err.println("Please re-enter your selection!");
            } while (choice < 0 || choice > categories.size());
        } catch (NumberFormatException | InputMismatchException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private Product checkExist(Long id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    private void writeFile() {
        File file = new File("src/minitest/product/product");
        try (ObjectOutputStream objectOutputStream
                     = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(products);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private ArrayList<Product> readFile() {
        File file = new File("src/minitest/product/product");
        ArrayList<Product> productsArray = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                productsArray = (ArrayList<Product>) objectInputStream.readObject();
            }
            return productsArray;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        return productsArray;
    }
}
