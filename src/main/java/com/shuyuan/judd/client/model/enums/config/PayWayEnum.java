package com.shuyuan.judd.client.model.enums.config;

import java.util.stream.Stream;

/**
 * create by jzs
 * 定义全局的支付方式，在销售协议中挂载销售费率，在通道采购协议中挂载成本费率
 */
public enum PayWayEnum {
    /*
    //微信主扫支付
    WX_SCAN("WX_SCAN", "微信主扫支付"),
    //微信被扫支付
    WX_BESCAN("WX_BESCAN", "微信被扫支付"),
    //支付宝主扫支付
    ALI_SCAN("ALI_SCAN", "支付宝主扫支付"),
    //支付被扫支付
    ALI_BESCAN("ALI_BESCAN", "支付被扫支付"),
    //聚合码主扫支付
    JH_SCAN("JH_SCAN", "聚合码主扫支付"),
    //聚合码被扫支付
    JH_BESCAN("JH_BESCAN", "聚合码被扫支付"),
    WX_VIPCN("WX_VIPCN", "微信公众号支付"),
    WX_APPLET("WX_APPLET", "微信小程序支付"),
    WX_APP("WX_APP", "微信APP支付"),
    ALI_APP("ALI_APP", "支付宝APP支付"),
     */
    SCAN("SCAN", "主动扫码支付"),
    BESCAN("BESCAN", "被动扫码支付"),
    VIPCN("VIPCN", "公众号支付"),
    APPLET("APPLET", "小程序支付"),
    APP("APP", "APP支付"),
    DEBIT_FASTPAY("DEBIT_FASTPAY", "借记卡快捷支付"),
    CREDIT_FASTPAY("CREDIT_FASTPAY", "贷记卡快捷支付"),
    ENTRUST("ENTRUST", "委托协议支付"),
    BALANCE("BALANCE", "余额支付"),
    EBANK("EBANK","网银支付");

    private String code;
    private String name;

    PayWayEnum(String id, String name) {
        this.code = id;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String findNameByCode(String code) {
        return Stream.of(values()).filter(p->code.equals(p.getCode())).findFirst().get().name;
    }
}
