package bai4.declare_class;

public class Main {
    public static void main(String[] args) {
        //khởi tạo 1 đối tượng: sử dụng từ khóa new
        //từ khóa new: trỏ đến constructor tương ứng trong class được tạo trước đó
        Product product = new Product("abc", 100);
        Product product1 = new Product(); // thuộc tính name = null
        product1.setName("Iphone13"); // thuộc tính name = Iphone13
        product1.setName("Samsung, OPPO, Vivo"); // thuộc tính name = Samsung => giá trị của name từ đấy là Samsung
        product1.setNames(new String[]{"Samsung", "OPPO", "Vivo"});
        System.out.println( "Demo blabla: " + product1.getNames()[1]);
        product1.setPrice(100000);
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        product1 = new Product("Ipohne14", 124678);
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
    }
}
