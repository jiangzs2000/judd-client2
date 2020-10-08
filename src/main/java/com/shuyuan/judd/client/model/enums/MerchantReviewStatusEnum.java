package com.shuyuan.judd.client.model.enums;

/**
 * @author Sting
 * create 2018/10/19

 **/
//商户审核状态枚举
public enum MerchantReviewStatusEnum {
    N("N", "未开通"),
    F("F", "审核失败"),
    P("P", "审核中"),
    S("S", "审核通过"),
    SB("SB", "审核通过且绑定银行卡"),
    FB("FB", "审核通过但未绑定银行卡");

    private String code;
    private String message;

    MerchantReviewStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
