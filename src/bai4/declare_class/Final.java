package bai4.declare_class;

public class Final {
    public static void main(String[] args) {
        //final với biến: tạo ra giá trị hằng, không thay đổi được giá trị của biến sau đó
        final int number = 10;
//        number = 1111;

        //final với biến tham chiếu: tạo ra 1 hằng tham chiếu,
        //không thay đổi được tham chiếu của biến sang 1 đối tượng khác
        final Product product = new Product("Iphone", 11111);
//        product = new Product();
        Product product1 = new Product();
        product1 = new Product("Bimbim", 15000);
        product.setName("OPPO");
        System.out.println(product.getName());
    }
}
