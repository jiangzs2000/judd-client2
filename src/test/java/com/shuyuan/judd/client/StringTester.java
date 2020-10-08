package com.shuyuan.judd.client;

public class StringTester {
    public static void main(String[] args){
        String s = "1234567890";
        System.out.println(s.substring(s.length()-4));
        StringBuffer sb = new StringBuffer();
        sb.append("abcd");
        System.out.println(sb.substring(0, sb.length()-1));
    }
}
