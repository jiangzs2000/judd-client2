package com.shuyuan.judd.client.model.enums.config;

import java.util.stream.Stream;

/**
 * <br>
 *
 * @author Jessci
 * create by 2019/5/17
 */
public enum ConfigStatementsEnum {

    WX_LD_04("WX_LD_04", "微信公众号支付"),
    CARD_LD_01("CARD_LD_01", "快捷支付"),
    ALI_LD_04("ALI_LD_04", "支付宝支付"),
    EBANKS_LD_01("EBANKS_LD_01", "网银支付"),
    EBANKS_LD_02("EBANKS_LD_02", "网银支付"),
    WX_LD_03("WX_LD_03", "微信APP支付"),
    ALI_LD_02("ALI_LD_02", "支付宝APP支付"),
    WX_LD_02("WX_LD_02", "微信APP支付"),
    WX_LDHS_03("WX_LDHS_03", "微信APP支付");

    private String code;
    private String msg;

    ConfigStatementsEnum(String code, String msg) {
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
        return Stream.of(values()).filter(p -> code.equals(p.getCode())).findFirst().get().msg;
    }
}
