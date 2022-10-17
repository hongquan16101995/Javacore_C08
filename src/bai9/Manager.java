package bai9;

//sử dụng chuột phải hoặc combo phím: alt + enter
//chọn phần đầu tiên => chọn create test
//chọn các phương thức nếu muốn
//kết quả: IDE sẽ tự động tạo 1 class test có tên tương ứng kèm package trong thư mục test
public class Manager {
    public int[] demo;

    public int absoluteNumber(int number) {
        if (number < 0) {
            return number * (-1);
        }
        return number;
    }
}
