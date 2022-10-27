package bia17;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Test");

        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                    new FileOutputStream(new File("src/bia17/demo")));
            objectOutputStream.writeObject(product);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(new File("src/bia17/demo")));
            Object object = objectInputStream.readObject();
            System.out.println(object);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
