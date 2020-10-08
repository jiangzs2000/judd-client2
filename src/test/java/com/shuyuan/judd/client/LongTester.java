package com.shuyuan.judd.client;

public class LongTester {
    public static void main(String[] args) {
        Long a = 1L;
        Long b = new Long("1");
        System.out.println(b);
        if (a.equals(b)) {
            System.out.println("equal");
        }

        System.out.println(2/3);
        System.out.println(2%3);
        System.out.println(Math.ceil(((double) 3) / 20));
        System.out.println(new Double(Math.ceil((double) 3) / 20).intValue());
    }
}
