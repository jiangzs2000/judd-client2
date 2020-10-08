package com.shuyuan.judd.client.model.enums.config;

/**
 * 三方机构，新引入一家三方机构，需要在这里增加
 */
public enum Institution3rdEnum {
    LD("LD", "联动优势");

    /**
     * 给机构一个唯一的编码，数据库里跟这里相同
     */
    private String code;
    /**
    * 机构的名字，数据库里与这里相同
     */
    private String name;
    Institution3rdEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
