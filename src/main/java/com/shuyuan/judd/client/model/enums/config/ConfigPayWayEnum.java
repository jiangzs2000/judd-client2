package com.shuyuan.judd.client.model.enums.config;

/**
 * @author Sting
 * create 2018/07/11

 **/
public enum ConfigPayWayEnum {
    // jzs 应该对应config_payment_channels里的pay-type字段
    //WX:微信支付, ALI:支付宝支付, CARD:快捷支付
    WX("wx"), ALI("ali"), CARD("card");

    private String name;

    ConfigPayWayEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
