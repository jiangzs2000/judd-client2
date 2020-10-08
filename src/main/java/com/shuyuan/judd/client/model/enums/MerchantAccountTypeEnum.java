package com.shuyuan.judd.client.model.enums;

/**
 * @author Sting
 * create 2018/10/03

 **/
public enum MerchantAccountTypeEnum {
    INCOME_ACCOUNT("0"),
    SETTLED_ACCOUNT("1"),
    BASE_ACCOUNT("2"),
    MARGIN_ACCOUNT("3"),
    LONG_ACOCUNT("4"),
    SHORT_ACCOUNT("5");

    MerchantAccountTypeEnum(String code) {
        this.code = code;
    }

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
