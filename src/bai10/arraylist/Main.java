package bai10.arraylist;

import java.util.ArrayList;

public class Main {
    private static int[] ints;
    private static String[] strings;
    public static void main(String[] args) {
        ints = new int[]{1,2,3,4};
        strings = new String[]{"a", "b"};
        System.out.println(contains(2));
        System.out.println(contains(20));
        System.out.println(contains1("a"));
        System.out.println(contains1("abc"));
    }

    public static boolean contains(int number) {
        boolean flag = false;
        for (int i = 0; i < ints.length; i++) {
            if (number == ints[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean contains1(String s) {
        boolean flag = false;
        for (int i = 0; i < strings.length; i++) {
            if (s.equals(strings[i])) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
