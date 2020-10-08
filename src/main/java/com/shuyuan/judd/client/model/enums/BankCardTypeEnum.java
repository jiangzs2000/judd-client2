package com.shuyuan.judd.client.model.enums;

/**
 * Created by Kevin
 * description:银行卡类型
 * date: 2018/10/23 11:51 AM
 */
public enum BankCardTypeEnum {

    DEBITCARD("0", "借记卡"),
    CREDITCARD("1", "贷记卡"),
    PCR("2", "准贷记卡"),
    PREPAYCARD("3", "预付卡");



    private String code;
    private String msg;

    BankCardTypeEnum(String code, String msg) {
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
