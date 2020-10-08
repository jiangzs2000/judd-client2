package com.shuyuan.judd.client.model.enums;

import java.util.stream.Stream;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/3/15
 */
public enum AssumePersonEnum {

    PAYER("payer", "付款方"),
    REMITTEE("remittee", "收款方"),
    PLAT("plat", "平台方");

    private String code;
    private String msg;

    AssumePersonEnum(String code, String msg) {
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

    public static String findMsgByCode(String code) {
        return Stream.of(values()).filter(p->code.equals(p.getCode())).findFirst().get().msg;
    }
}
