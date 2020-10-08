package com.shuyuan.judd.client.model.enums;

import java.util.stream.Stream;

/**
 * Created by Kevin
 * description:结算(出款)类型
 * date: 2018/10/21 10:47 AM
 */
public enum SettleMentTypeEnum {
    MANUAL_SETTLEMENT(1, "手动结算"),
    AUTO_SETTLEMENT(2, "自动结算");

    private int code;
    private String msg;

    SettleMentTypeEnum(int code, String msg) {
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
