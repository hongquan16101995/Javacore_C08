package bai9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    private static int[] ints;
    private static Manager manager;

    //annotation Test: dùng để đánh dấu đây là phương thức test
    //annotation: nhận biết bắt đầu bằng @, dùng để đánh dấu các thành phần đặc biệt trong project
    @BeforeAll
    static void mBeforeAll() {
        manager = new Manager();
        manager.demo = new int[]{1, 2, 3};
        ints = new int[]{100,200,300};
        System.out.println("BeforeAll");
    }

    @BeforeEach
    void mBeforeEach() {
//        Manager manager = new Manager();
        System.out.println(ints[1]);
        System.out.println(manager.demo[1]);
        System.out.println("BeforeEach");
    }

    @Test
    void absoluteNumber() {
        //biến đầu vào
        int input = 0;
        //giá trị kỳ vọng mà kết quả của phương thức trả về
        int expected = 0;

        Manager manager = new Manager();
        //giá trị thực tế mà phương thức trả về
        int result = manager.absoluteNumber(input);
        //phương thức so sánh (của thư viện junit cung cấp)
        //trả về test đúng nếu 2 giá trị khớp nhau
        //trả về test sau nếu 2 giá trị khác nhau
        assertEquals(expected, result);

    }

    @Test
    void m1() {
        int input = 1;
        int expected = 1;

        Manager manager = new Manager();
        int result = manager.absoluteNumber(input);
        assertEquals(expected, result);
    }

    @Test
    void m2() {
        int input = -1;
        int expected = 1;

        Manager manager = new Manager();
        int result = manager.absoluteNumber(input);
        assertEquals(expected, result);
    }
}
