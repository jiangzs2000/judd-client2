package com.shuyuan.judd.client.model.enums;
/**
 * Created by Kevin
 * description: 收入 支出标识
 * date: 2018/11/23 1:35 PM
 */
public enum InComeOutGoTypeEnum {
    IN_COME("IN", "收入"),
    OUT_GO("OUT", "支出");
    private String code;
    private String msg;

    InComeOutGoTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
