package bai19;

import java.util.Arrays;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        System.out.println(stringBuilder);
        stringBuilder.append("b");
        stringBuilder.append("c");
        System.out.println(stringBuilder);
        // //thêm 1 giá trị string vào giữa 1 chuỗi dùng String: chưa done
        String a = "abc";
        String[] demo = a.split("");
        System.arraycopy(new String[]{"d"}, 0, demo, 1, 1);
        System.out.println(Arrays.toString(demo));
        //thêm 1 giá trị string vào giữa 1 chuỗi dùng String builder: done
        stringBuilder.insert(1, "d");
        System.out.println(stringBuilder);

//        char[] a = {'a', 'b', 'c', '1', '1'};
//        char[] b = {'x', 'y'};
//        System.arraycopy(b,0,a,3,2);
//        System.out.println(a);
    }
}
