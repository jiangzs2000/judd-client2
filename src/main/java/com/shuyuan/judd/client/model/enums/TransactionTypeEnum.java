package com.shuyuan.judd.client.model.enums;

import java.util.stream.Stream;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/20
 */
public enum TransactionTypeEnum {

    ROUTING("1", "分账"),
    TRANSACTION("2", "交易"),
    CASH("3", "提现"),
    REFUND("4", "退款"),
    REFUND_FEE("5", "退款手续费");

    private String code;
    private String msg;

    TransactionTypeEnum(String code, String msg) {
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

    public static String getMsgBycode(String code) {
        return Stream.of(values()).filter(p -> code.equals(p.code)).findFirst().get().getMsg();
    }
}
