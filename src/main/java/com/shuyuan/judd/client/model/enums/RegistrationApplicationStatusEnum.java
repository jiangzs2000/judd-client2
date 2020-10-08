package com.shuyuan.judd.client.model.enums;

import java.util.stream.Stream;

public enum RegistrationApplicationStatusEnum {
    INIT(1,"初始"),
    REGISTED(2,"基础信息审核成功"),
    MATERIAL_UPLOADED(3, "资料上传待审核"),
    MATERIAL_PASSED(4, "资料通过"),
    COMPLETEED(5, "资料通过、绑卡成功"),
    DENIED(9,"入网失败");

    private int code;
    private String name;
    RegistrationApplicationStatusEnum(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String findNameByCode(int code) {
        return Stream.of(values()).filter(p->code == p.getCode()).findFirst().get().name;
    }
}
