package com.shuyuan.judd.client.model.enums.config;

/**
 * @author Sting
 * create 2018/07/09

 **/
public enum ConfigPayChannelEnum {
    //通联微信支付
    ALLIANPAY_WX("allianpay_wx", "WX_TL"),
    //支付宝原生支付
    ALIPAY("alipay", "ALI"),
    //连连快捷支付
    LLIANPAY_CARD("llianpay_card", "CARD_LL"),
    //平安微信支付
    PINGANPAY_WX("pinganpay_wx", "WX_PA"),
    //联动微信支付
    LDPAY_WX("ldpay_wx", "WX_LD", "WECHAT"),
    //联动支付宝支付
    LDPAY_ALI("ldpay_ali", "ALI_LD", "ALIPAY"),
    //联动快捷支付
    LDPAY_CARD("ldpay_card", "CARD_LD","FASTPAY"),
    //网银支付
    LDPAY_EBANK("ldpay_ebanks","EBANKS_LD",""),
    //联动微信小程序支付 jzs 这是个bug？
    LDPAY_WXAPPLET("ldpay_wx","WXPAYAPPLET_LD","");

    private String name;
    private String aliasName;
    private String thirdName;

    ConfigPayChannelEnum(String name, String aliasName) {
        this.name = name;
        this.aliasName = aliasName;
    }


    ConfigPayChannelEnum(String name, String aliasName, String thirdName) {
        this.name = name;
        this.aliasName = aliasName;
        this.thirdName = thirdName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    ConfigPayChannelEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getThirdNameByName(String name) {
        for (ConfigPayChannelEnum configPayChannelEnum : ConfigPayChannelEnum.values()) {
            if (configPayChannelEnum.getName().equals(name)) {
                return configPayChannelEnum.getThirdName();
            }
        }
        return null;
    }
}
