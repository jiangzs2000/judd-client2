package com.shuyuan.judd.client.model.enums;

/**
 * Created by Kevin
 * description:
 * date: 2018/10/23 11:51 AM
 */
public enum  ConfigHolidaysTypeEnum {

    WORKAYDAYS("W", "工作日"),
    HOLIDAYS("H", "节假日"),
    DOUBLE_WORKAYDAYS("DW", "双休日");

    private String code;
    private String msg;

    ConfigHolidaysTypeEnum(String code, String msg) {
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
