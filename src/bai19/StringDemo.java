package bai19;

import bai18.Product;

public class StringDemo {
    public static void main(String[] args) {
        String a1 = "abc";
        String a2 = "abc";
        String b1 = new String("abc");
        String b2 = new String("abc");
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        a1 = a1 + a2;
        System.out.println(a1);
        System.out.println(a1.hashCode());

        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        Product product = new Product();
        Product product1 = new Product();
        System.out.println(product.hashCode());
        System.out.println(product1.hashCode());
    }
}
