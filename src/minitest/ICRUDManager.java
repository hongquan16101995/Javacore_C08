package minitest;

import java.util.Scanner;

public interface ICRUDManager<E> {
    void add(int choice, Scanner scanner);

    void update(Scanner scanner);

    void delete(int index);

    void display();
}
