package bai4.declare_class;

public class Overload {
    //overloading method: là kỹ thuật nạp chồng phương thức
    //cho phép tạo ra các phương thức cùng tên, khác nhau về tham số
    //khác tham số: khác số lượng, kiểu dữ liệu và vị trí tham số
    //có thể thay đổi giá trị trả về hoặc access modifier tùy ý
    public static void display(int num, int num1, String str, String str1) {
        System.out.println("Method 1");
    }

    //có thể thay đổi được kiểu dữ liệu trả về của phương thức
    public static int display(double num, int num1, String str, String str1) {
        System.out.println("Method 1");
        return 1;
    }

    //có thể thay đổi được access modifier tùy ý
    private static void display(int num) {
        System.out.println("Method 1");
    }

    //thay đổi số lượng tham số
    public static void display(int num, int num1, String str) {
        System.out.println("Method 2");
    }

    //thay đổi kiểu dữ liệu tham số
    public static void display(int num, int num1, double str, String str1) {
        System.out.println("Method double");
    }

    public static void display(int num, int num1, float str, String str1) {
        System.out.println("Method float");
    }

    //thay đổi vị trí tham số
    public static void display(int num, String str, int num1, String str1) {
        System.out.println("Method 4");
    }

    public static void main(String[] args) {
        display(1, 2, "a", "b");
        display(1, "a", 2, "b");
        display(1, 2, 0.999f, "b");
//        display(1, 2, 2.0d, "b");
    }
}
