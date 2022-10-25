package bai15;

public class MyException extends Exception{


    @Override
    public String getMessage() {
        return "Đây là lỗi tự tạo!";
    }
}
