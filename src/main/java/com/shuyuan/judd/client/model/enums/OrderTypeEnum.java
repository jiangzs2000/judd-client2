package com.shuyuan.judd.client.model.enums;
/**
 * Created by Kevin
 * description: 业务订单业务类型
 * date: 2018/11/23 1:35 PM
 */
public enum OrderTypeEnum {
    FUNDIN("FI", "入款订单生成规则"),
    FUNDOUT("FO", "出款订单生成规则"),
    REFUND("RF", "退款订单生成规则"),
    FUNDROUTING("FR","分账生成规则"),
    FUNHUISHANGIN("HSFI","惠商入款生成");
    private String code;
    private String msg;

    OrderTypeEnum(String code, String msg) {
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
