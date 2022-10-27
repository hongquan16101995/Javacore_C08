package minitest.material;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MaterialManager {
    private ArrayList<Material> materials;

    public MaterialManager() {
        materials = new ArrayList<>();
    }

    public void add(int choice, Scanner scanner) {
        try {
            if (choice < 1 || choice > 2) {
                System.out.println("Lựa chọn không phù hợp, mời nhập lại!");
            } else {
                System.out.println("Nhập id: ");
                Long id = Long.parseLong(scanner.nextLine());
                System.out.println("Nhập tên vật liệu: ");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sản xuất:(yyyy-MM-dd)");
                LocalDate date = LocalDate.parse(scanner.nextLine());
                System.out.println("Nhập đơn giá: ");
                int cost = Integer.parseInt(scanner.nextLine());
                if (choice == 1) {
                    System.out.println("Nhập cân nặng: ");
                    double weight = Double.parseDouble(scanner.nextLine());
                    materials.add(new Meat(id, name, date, cost, weight));
                } else {
                    System.out.println("Nhập số lượng: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    materials.add(new CrispyFlour(id, name, date, cost, quantity));
                }
                writeFile();
            }
        } catch (InputMismatchException | NumberFormatException | DateTimeParseException e) {
            System.err.println("Thông tin bạn nhập chưa phù hợp! Mời nhập lại!");
        }
    }

    public void update(Scanner scanner) {
        try {
            System.out.println("Nhập id sản phẩm bạn muốn sửa: ");
            Long idUpdate = Long.parseLong(scanner.nextLine());
            int index;
            if ((index = checkExist(idUpdate)) != -1) {
                System.out.println("Nhập tên mới: ");
                String name = scanner.nextLine();
                if (!name.equals("")) {
                    materials.get(index).setName(name);
                }
                System.out.println("Nhập ngày sản xuất mới: ");
                String date = scanner.nextLine();
                if (!date.equals("")) {
                    materials.get(index).setManufacturingDate(LocalDate.parse(date));
                }
                System.out.println("Nhập đơn giá mới: ");
                String cost = scanner.nextLine();
                if (!cost.equals("")) {
                    materials.get(index).setCost(Integer.parseInt(cost));
                }
                if (materials.get(index) instanceof Meat) {
                    System.out.println("Nhập cân nặng mới: ");
                    String weight = scanner.nextLine();
                    if (!weight.equals("")) {
                        ((Meat) materials.get(index)).setWeight(Double.parseDouble(weight));
                    }
                } else {
                    System.out.println("Nhập số lượng mới: ");
                    String quantity = scanner.nextLine();
                    if (!quantity.equals("")) {
                        ((CrispyFlour) materials.get(index)).setQuantity(Integer.parseInt(quantity));
                    }
                }
                writeFile();
            } else {
                System.out.println("Sản phẩm bạn muốn sửa không tồn tại!");
            }
        } catch (InputMismatchException | NumberFormatException | DateTimeParseException e) {
            System.err.println("Thông tin bạn nhập chưa phù hợp! Mời nhập lại!");
        }
    }

    public void delete(Scanner scanner) {
        try {
            System.out.println("Nhập id sản phẩm bạn muốn xóa: ");
            Long idUpdate = Long.parseLong(scanner.nextLine());
            int index;
            if ((index = checkExist(idUpdate)) != -1) {
                materials.remove(index);
                writeFile();
            } else {
                System.out.println("Sản phẩm bạn muốn xóa không tồn tại!");
            }
        } catch (NumberFormatException e) {
            System.err.println("Thông tin bạn nhập chưa phù hợp! Mời nhập lại!");
        }
    }

    public int checkExist(Long id) {
        for (Material m : materials) {
            if (m.getId().equals(id)) {
                return materials.indexOf(m);
            }
        }
        return -1;
    }

    public void display() {
        if (materials.isEmpty()) {
            System.out.println("Hiện không có sản phẩm nào!");
        } else {
            for (Material m : materials) {
                System.out.println(m);
            }
        }

    }

    public void displayByDiscount() {
        if (materials.isEmpty()) {
            System.out.println("Hiện không có sản phẩm nào!");
        } else {
            System.out.printf("%-10s%-10s%-15s%-20s%-20s%s",
                    "ID", "Name", "Money", "RealMoney", "Deviant", "ExpiryDate\n");
            for (Material m : materials) {
                if (m instanceof Meat) {
                    System.out.printf("%-10s%-10s%-15s%-20s%-20s%s",
                            m.getId(), m.getName(), m.getAmount(),
                            ((Meat) m).getRealMoney(),
                            (m.getAmount() - ((Meat) m).getRealMoney()), m.getExpiryDate() + "\n");
                } else {
                    System.out.printf("%-10s%-10s%-15s%-20s%-20s%s",
                            m.getId(), m.getName(), m.getAmount(),
                            ((CrispyFlour) m).getRealMoney(),
                            (m.getAmount() - ((CrispyFlour) m).getRealMoney()), m.getExpiryDate() + "\n");
                }
            }
        }
    }

    public void writeBinaryFile() {
        File file = new File("src/minitest/material/file/binary");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(materials);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println();
        }
    }

    public void readBinaryFile() {
        File file = new File("src/minitest/material/file/binary");
        ArrayList<Material> materialsArray = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Object object;
            while ((object = objectInputStream.readObject()) != null) {
                materialsArray = (ArrayList<Material>) object;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        materials = materialsArray;
    }

    public void writeFile() {
        File file1 = new File("src/minitest/material/file/meat.csv");
        File file2 = new File("src/minitest/material/file/flour.csv");
        try {
            if (!file1.exists()) {
                file1.createNewFile();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file1));
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file2));
            for (Material m : materials) {
                if (m instanceof Meat) {
                    bufferedWriter1.write(m.getId() + "," + m.getName() + ","
                            + m.getManufacturingDate() + "," + m.getCost() + ","
                            + ((Meat) m).getWeight() + "\n");
                } else if (m instanceof CrispyFlour) {
                    bufferedWriter2.write(m.getId() + "," + m.getName() + ","
                            + m.getManufacturingDate() + "," + m.getCost() + ","
                            + ((CrispyFlour) m).getQuantity() + "\n");
                }
            }
            bufferedWriter1.close();
            bufferedWriter2.close();
        } catch (IOException e) {
            System.out.println();
        }
    }

    public void readFile() {
        File file1 = new File("src/minitest/material/file/meat.csv");
        File file2 = new File("src/minitest/material/file/flour.csv");
        ArrayList<Material> materialsReader = new ArrayList<>();
        try {
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            String str;
            while ((str = bufferedReader1.readLine()) != null) {
                String[] strings = str.split(",");
                materialsReader.add(new Meat(Long.parseLong(strings[0]), strings[1],
                        LocalDate.parse(strings[2]), Integer.parseInt(strings[3]),
                        Double.parseDouble(strings[4])));
            }
            while ((str = bufferedReader2.readLine()) != null) {
                String[] strings = str.split(",");
                materialsReader.add(new CrispyFlour(Long.parseLong(strings[0]), strings[1],
                        LocalDate.parse(strings[2]), Integer.parseInt(strings[3]),
                        Integer.parseInt(strings[4])));
            }
            materials = materialsReader;
        } catch (IOException e) {
            System.out.println();
        }
    }
}
