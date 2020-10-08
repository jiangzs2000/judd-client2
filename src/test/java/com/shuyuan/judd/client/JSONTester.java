package com.shuyuan.judd.client;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONTester {
    public static void main(String[] args) {
        String arr = "[{\"name\":\"test\", \"age\":\"19\"}, {\"name\":\"test1\",\"age\":\"20\"}]";
        List<JSONObject> l = JSONObject.parseObject(arr, List.class);
        for(JSONObject i : l){
            System.out.println(i);
            System.out.println(i.getClass());
            System.out.println(i.getInteger("age"));
        }
    }
}
