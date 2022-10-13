package bai7;

//từ khóa abstract định danh cho lớp abstract
public abstract class AbstractManager {
    private String name;

    public void display() {
        System.out.println("Hello");
    }

    public void create2() {

    }

    //phương thức trừa tượng (abstract) trong lớp abstract
    public abstract void display2();
}
