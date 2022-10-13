package bai6_1;

//từ khóa extends dùng để xác định kế thừa trong Java
public class Dog extends Animal{
    public int height;

    public Dog() {
    }

    //super: tham chiếu từ lớp con lên thành phần của lớp cha
    public Dog(String name, int weight, int height) {
        super(name, weight);
        this.height = height;
    }

    public Dog(int height) {
        super();
        this.height = height;
    }

    //từ khóa @Override chẳng có ý nghĩa gì cả
    //nó giúp xác định đây là 1 phương được đang được ghi đè
    //phương thức ghi đè sẽ giữ nguyên cấu trúc, thay đổi phần thân
    //giữ nguyên: tên + tham số và trạng thái trả về
    //ở lớp con, ghi đè có thể thay đổi KDL trả về n phải là con của KDL trả về ở lớp cha
    //access của lớp con phải bằng hoặc mở rộng hơn lớp cha
    @Override
    public Long makeNoise() {
        System.out.println("Gâu gâu");
        return 10l;
    }

//    @Override
//    public void display() {
//        System.out.println("haha");
//    }

    public void display(String a) {
        System.out.println(a);
    }
}
