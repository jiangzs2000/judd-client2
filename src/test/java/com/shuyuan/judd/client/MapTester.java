package com.shuyuan.judd.client;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args){
        Map<String, String > m = new HashMap<>();
        m.put("test","1");

        m.put("test", null);

        System.out.println(m);
    }
}

