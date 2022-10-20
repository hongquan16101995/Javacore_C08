package bai12;

import bai2.A;
import bai4.declare_class.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        //khởi tạo 1 đối tượng Collection dạng Map
        //key là Integer, generic bên trái
        //value là Integer, generic bên phải
        Map<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        //thêm cặp key-value(entry) vào map
        hashMap.put(1, arrayList);
        //lấy ra value dựa vào key
        ArrayList<Integer> a = hashMap.get(1);
    }
}
