package com.shuyuan.judd.client.model.enums;

import java.util.stream.Stream;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/6
 */
@Deprecated
public enum RoutingTypeEnum {

    PERCENTAGE(1,"百分比"),
    FIXED_AMOUNT(2,"固定金额");

    private int code;
    private String msg;

    RoutingTypeEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static String getMsgBycode(Integer code){
        return Stream.of(values()).filter(p->code==p.code).findFirst().get().getMsg();
    }
}
