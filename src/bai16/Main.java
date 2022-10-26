package bai16;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        do {
            System.out.println("Nhập vào từ gì đó: ");
            str = scanner.nextLine();
            writeFile(str);
            readFile();
        } while (!str.equals("q"));

    }

    private static void writeFile(String str) {
        File file = new File("src/bai16/demo.txt");
        //sử dụng try-with-resources để đóng luồng ghi tự động mà không cần phương thức close()
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            if (!file.exists()) {
                file.createNewFile();
            }

            bufferedWriter.write(str + "\n");
            //phương thức close() bị mờ do không được sử dụng
//            fileWriter.close();
        } catch (IOException e) {
            System.out.println();
        }
    }

    private static void readFile() {
        File file = new File("src/bai16/demo.txt");
        try {
            boolean checkNewFile = false;
            if (!file.exists()) {
                checkNewFile = file.createNewFile();
            }
            if (checkNewFile) {
                System.out.println("File không có dữ liệu!");
            } else {
                try (FileReader fileReader = new FileReader(file)) {
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    int ch;
                    while ((ch = bufferedReader.read()) != -1) {
                        if (ch == 13) {
                            continue;
                        }
                        if (ch == 10) {
                            System.out.println();
                            continue;
                        }
                        System.out.print((char) ch);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println();
        }
    }
}
