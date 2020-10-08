package com.shuyuan.judd.client.model.enums;

import java.util.stream.Stream;

/**
 * Created by Kevin
 * description:费用类型
 * date: 2018/10/21 10:47 AM
 */
public enum FeeTypeEnum {
    TRADE_AMOUNT(1,"订单总金额"),
    INST_FEE(2,"平台手续费"),
    PLAT_FEE(3,"机构手续费"),
    SETTLEMENT_FEE(4,"结算手续费"),
    ROUTING_FEE(5,"分账金额");


    private int code;
    private String msg;

    FeeTypeEnum(int code, String msg) {
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

    public static String getMsgBycode(int code){
        return Stream.of(values()).filter(p->code==p.getCode()).findFirst().get().msg;
    }
}
