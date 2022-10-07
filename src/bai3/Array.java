package bai3;

public class Array {
    public static void main(String[] args) {
        //khai báo trực tiếp giá trị phần tử
        int[] array = {1, 2, 3};

        //khai báo sử dụng từ khóa new
        //các phần tử nhận giá trị mặc định của kiểu dữ liệu
        int[] array1 = new int[10];

        //cách 3
        int[] array2 = new int[]{1, 2, 3};

        //vị trí của ký hiệu mảng ([]) và tên mảng có thể hoàn đổi cho nhau
        int array3[] = {1, 2, 3};
        int array4[] = new int[10];

        //khai báo mảng 2 chiều
        int[][] array5 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array6 = new int[5][5];

        //đổi vị trí của ký hiệu mảng ([]) và tên mảng
        int[][] array7 = {{1}};
        int array8[][] = {{1}};
        int[] array9[] = {{1}};

        //lưu ý về khai báo mảng chiều
        int[][] array10 = new int[5][];
        array10[0] = new int[4];

        //duyệt mảng sử dụng for
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
            System.out.println(i);
        }
        System.out.println("-----------");
        //sử dụng for-each
        for (int value : array3) {
            System.out.println(value);
        }
    }
}
