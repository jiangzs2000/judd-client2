package com.shuyuan.judd.client.model.enums;

import lombok.Data;

public enum AccountStatusEnum {
    INITIAL(0,"初始"),
    NORMAL(1, "正常"),
    FREEZON(2, "冻结"),
    REMOVED(9, "销户");
    private int code;
    private String name;

    AccountStatusEnum(int code, String name) {
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
}
