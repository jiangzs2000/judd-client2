package com.shuyuan.judd.client.model.enums.config;

/**
 * @author Sting
 * create 2018/07/09

 **/
public enum ConfigPayAssumeEnum {
    //renter:租客承担 landlord:房东承担
    RENTER("renter"), LANDLORD("landlord"),PLAT("plat");
    private String name;

    ConfigPayAssumeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
