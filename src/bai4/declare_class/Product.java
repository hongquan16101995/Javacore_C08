package bai4.declare_class;

public class Product {
    //UML: sơ đồ lớp, mô tả của lớp trước khi khởi tạo. biểu diễn bằng HCN
    //Gồm 3 phần:
    //phần 1: tên lớp
    //phần 2: tên thuộc tính kèm kiểu dữ liệu tương ứng
    //phần 3: tên phương thức, kèm kiểu dữ liệu trả về tương ứng, tham số nếu có

    //từ khóa final
    public String name;
    public String name1;
    public String[] names;
    public double price;

    //mỗi lớp được tạo trong Java, mặc định chứa 1 constructor không tham số
    //khi 1 constructor bất kỳ được tạo, lớp sẽ mất đi constructor không tham số mặc định
    //constructor không có giá trị trả về; tên bắt buộc trùng tên lớp
    public Product() {
    }

    //this: trỏ đến các thành phần của chính lớp hiện tại
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getter và setter
    //getter: cấu trúc tên phương thức: get + tên thuộc tính
    //dùng để trả về giá trị của thuộc tính tại thời điểm gọi
    public String getName() {
        return name;
    }

    //setter: cấu trúc tên phương thức: set + tên thuộc tính
    //dùng để đặt lại giá trị của thuộc tính theo tham số truyền vào
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
