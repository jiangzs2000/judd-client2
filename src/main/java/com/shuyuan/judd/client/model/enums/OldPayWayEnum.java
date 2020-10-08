package com.shuyuan.judd.client.model.enums;

public enum OldPayWayEnum {
    //jzs 应该是对应config_payment_channel里的3rd_payway
    ALIPAY("ALIPAY","支付宝公众号支付"),
    WECHAT("WECHAT","微信公众号支付"),
    FASTPAY("FASTPAY","银行卡快捷支付"),
    ALIPAYVIPCN("AL","支付宝公众号支付"),
    B2BBANK("B2BBANK","B2B网银支付"),
    B2CDEBITBANK("B2CDEBITBANK","B2C网银支付"),
    WXAPPPAY("WXAPPPAY","微信app支付"),
    ALIAPPPAY("ALIAPPPAY","支付宝app支付"),
    WX("WX","惠商小程序支付"),
    AL("AL","惠商支付宝服务窗");
//jzs todo 上面定义有重复
    private  String code;
    private  String msg;

    OldPayWayEnum(String code, String msg) {
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
