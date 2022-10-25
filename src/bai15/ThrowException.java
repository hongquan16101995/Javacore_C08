package bai15;

import java.io.IOException;

public class ThrowException {
    public void m2() throws Exception {
        try {
            m1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        m1();
    }

    //demo throw
    //throws: dùng để ném lỗi có thể xảy ra trong phương thức
    //ném cho phương thức gọi đến nó xử lý
    public void m1() throws Exception {
        //xử lý throw ngay tại phương thức
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        throw new Exception();
    }
}
