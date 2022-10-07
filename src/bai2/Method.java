package bai2;

public class Method {
    public static void main(String[] args) {
        display("HelloWorld");
        Method method = new Method();
        method.display1();
    }

    //phương thức void: không có giá trị trả về
    //tham số x: có kiểu dữ liệu là String
    public static void display(String x) {
        System.out.println(x);
    }

    public void display1() {
        System.out.println("HelloWorld");
        int number = display2();
        System.out.println(number);
    }

    public int display2() {
        return 100;
    }
}
