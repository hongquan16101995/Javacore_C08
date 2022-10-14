package minitest.day12_10_2022;

import java.util.Scanner;

public class ProductManager {
    private Product[] products;

    public ProductManager() {
        products = new Product[0];
    }

    public void addProduct(Scanner scanner) {
        Product product = getProduct(scanner);
        //tạo 1 mảng sản phẩm mới có độ dài + 1 so với mảng có sẵn
        Product[] newProducts = new Product[products.length + 1];
        //chuyển các phần tử của mảng có sẵn sang mảng mới
        for (int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        //thêm phần tử mới vào cuối mảng
        newProducts[products.length] = product;
        //gán mảng mới thay cho vị trí của mảng cũ
        products = newProducts;
        System.out.println("Tạo mới thành công!");
        System.out.println(product);
    }

    public Product getProduct(Scanner scanner) {
        System.out.println("Nhập thông tin của sản phẩm: ");
        System.out.println("Nhập tên sản phẩm mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm mới: ");
        //Double.parseDouble(String): chuyển giá trị chuỗi về thành dạng số tương ứng nếu dữ liệu là số
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm mới: ");
        String description = scanner.nextLine();
        //tạo 1 sản phẩm mới theo thông tin người dùng nhập
        return new Product(name, price, description);
    }

    public void updateProduct(Scanner scanner) {
        if (products.length > 0) {
            System.out.println("Nhập vị trí sản phẩm bạn muốn sửa (1 - " + products.length + "): ");
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.println("Mời nhập thông tin mới của sản phẩm: ");
            System.out.println("Nhập tên mới cho sản phẩm: " + products[index].getName());
            String name = scanner.nextLine();
            products[index].setName(name);
            System.out.println("Nhập giá mới cho sản phẩm: " + products[index].getPrice());
            double price = Double.parseDouble(scanner.nextLine());
            products[index].setPrice(price);
            System.out.println("Nhập mô tả mới cho sản phẩm: " + products[index].getDescription());
            String description = scanner.nextLine();
            products[index].setDescription(description);
            System.out.println("Cập nhật thành công!");
            System.out.println(products[index]);
        } else {
            System.out.println("Danh sách không có sản phẩm nào!");
        }
    }

    public void deleteProduct(Scanner scanner) {
        if (products.length > 0) {
            System.out.println("Nhập vị trí sản phẩm bạn muốn xóa (1 - " + products.length + "): ");
            int index = Integer.parseInt(scanner.nextLine());
            Product[] newProducts = new Product[products.length - 1];
            for (int i = 0; i < newProducts.length; i++) {
                if (i < index - 1) {
                    newProducts[i] = products[i];
                } else {
                    newProducts[i] = products[i + 1];
                }
            }
            products = newProducts;
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Danh sách không có sản phẩm nào!");
        }
    }

    public void displayProduct() {
        boolean check = products.length > 0;
        if (check) {
            System.out.println("Danh sách sản phẩm hiện có là: ");
            for (Product p : products) {
                System.out.println(p.toString());
            }
        } else {
            System.out.println("Danh sách không có sản phẩm nào!");
        }
    }

    public void displayMaxPriceProduct() {
        if (products.length > 0) {
            System.out.println("Sản phẩm có giá cao nhất hiện tại là: ");
            double maxPrice = products[0].getPrice();
            int index = 0;
            for (int i = 0; i < products.length; i++) {
                if (products[i].getPrice() > maxPrice) {
                    maxPrice = products[i].getPrice();
                    index = i;
                }
            }
            System.out.println(products[index]);
        } else {
            System.out.println("Danh sách không có sản phẩm nào!");
        }
    }
}
