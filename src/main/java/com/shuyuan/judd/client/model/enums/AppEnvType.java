package com.shuyuan.judd.client.model.enums;

/**
 * Created by Kevin on 5/11/18.
 */
public enum AppEnvType {
    DEV((byte) 0, "dev"),
    DAILY((byte) 1, "daily"),
    TEST((byte)2, "test"),
    PRE((byte) 3, "pre"),
    PROD((byte) 4, "prod");

    private byte value;
    private String desc;

    AppEnvType(byte value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
