package com.shuyuan.judd.client.model.enums;

/**
 * Created by Kevin
 * description:通知模块 用到的Key
 * date: 2018/10/21 10:47 AM
 */
public enum RedisTypeEnum {
    SINGLE_FUNDOUT_VERIFY_CODE("singleFundOutVerifyCode", "单比提现验证码"),
    CHANGE_CARD_VERIFY_CODE("changeCardVerifyCode", "换绑验证码"),
    MERCHANT_CHANGE_CARD_COUNT_LIMIT("MERCHANT_CHANGE_CARD_COUNT_LIMIT", "商户银行卡换绑次数限制"),
    FINANCES_SETCENTER_PAYSET("FINANCES:SETCENTER:PAYSET", "设置中心-支付设置"),
    FINANCES_SETCENTER_WITHDRAWSET("FINANCES:SETCENTER:WITHDRAWSET", "设置中心-提现设置");
    private String code;
    private String msg;

    RedisTypeEnum(String code, String msg) {
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
