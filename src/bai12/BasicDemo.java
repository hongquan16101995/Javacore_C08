package bai12;

import bai4.declare_class.Product;

import java.util.*;

public class BasicDemo {
    public static void main(String[] args) {
        Product product = new Product("Iphone", 1234567);
        Product product1 = new Product("Iphone1", 1234567);
        Product product2 = new Product("Iphone2", 1234567);
        Map<Product, Integer> hashMap = new HashMap<>();
        hashMap.put(product, 1);
        hashMap.put(product1, 1);
        hashMap.put(product2, 1);
        //phương thức keySet dùng để trả về tập hợp Key của Map
        Set<Product> keyProduct = hashMap.keySet();
//        System.out.println(hashMap.get(product1));
        for (Product p : keyProduct) {
            if (p.equals(product1)) {
                Integer amount = hashMap.get(p);
                amount += 3;
                hashMap.put(p, amount);
            }
        }

        for (Product p : keyProduct) {
//            System.out.println("Key: " + p.toString() + ", value: " + hashMap.get(p));
        }
//        System.out.println(hashMap.get(product1));


        //Tập hợp Set
        Set<Integer> integerSet = new HashSet<>();
        List<Integer> integerList = new ArrayList<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        for (Integer i : integerSet) {
            System.out.println("Set:" + i);
        }
        for (Integer i : integerList) {
            System.out.println("List:" + i);
        }

        Set<Product> productSet = new HashSet<>();
        Product p1 = new Product("A", 1);
        Product p2 = new Product("B", 2);
        System.out.println(productSet.add(p1));
        p1.setName("D");
//        p1 = new Product("ABC", 3);
        System.out.println(productSet.add(p1));
        productSet.add(p2);

        for (Product p : productSet) {
            System.out.println(p.getName());
        }
    }
}
