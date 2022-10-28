package bai17;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private final ArrayList<MyProduct> products;

    public ProductManager() {
        products = readFile();
    }

    public void addProduct(Scanner scanner) {
        System.out.println("Enter code: ");
        String code = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter price: ");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter description: ");
        String description = scanner.nextLine();
        products.add(new MyProduct(code, name, brand, price, description));
        writeFile();
    }

    public void updateProduct(Scanner scanner) {
        System.out.println("Enter code of product you want update: ");
        String codeUpdate = scanner.nextLine();
        int index = -1;
        for (MyProduct p : products) {
            if (p.getCode().equals(codeUpdate)) {
                index = products.indexOf(p);
            }
        }
        if (index != -1) {
            System.out.println("Enter new name: ");
            String name = scanner.nextLine();
            products.get(index).setName(name);
            System.out.println("Enter new brand: ");
            String brand = scanner.nextLine();
            products.get(index).setBrand(brand);
            System.out.println("Enter new price: ");
            Double price = Double.parseDouble(scanner.nextLine());
            products.get(index).setPrice(price);
            System.out.println("Enter new description: ");
            String description = scanner.nextLine();
            products.get(index).setDescription(description);
        }
        writeFile();
    }

    public void deleteProduct(Scanner scanner) {
        System.out.println("Enter code of product you want update: ");
        String codeUpdate = scanner.nextLine();
        int index = -1;
        for (MyProduct p : products) {
            if (p.getCode().equals(codeUpdate)) {
                index = products.indexOf(p);
            }
        }
        if (index != -1) {
            products.remove(index);
        }
        writeFile();
    }

    public void display() {
        for (MyProduct product : products) {
            System.out.println(product);
        }
    }

    private void writeFile() {
        File file = new File("src/bai17/product");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file.toPath()));
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private ArrayList<MyProduct> readFile() {
        File file = new File("src/bai17/product");
        ArrayList<MyProduct> productArrayList = new ArrayList<>();
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() > 0) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                productArrayList = (ArrayList<MyProduct>) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return productArrayList;
    }
}
