package com.shuyuan.judd.client.model.enums;

import java.util.stream.Stream;

/**
 * Created by Kevin
 * description:结算(出款)规则类型
 * date: 2018/10/21 10:47 AM
 */
public enum SettleMentRuleTypeEnum {
    D1_SETTLEMENT("D+1", "不分交易日还是节假日提现"),
    T1_SETTLEMENT("T+1", "工作日提现");

    private String code;
    private String msg;

    SettleMentRuleTypeEnum(String code, String msg) {
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

    public static String getMsgBycode(Integer code){
        return Stream.of(values()).filter(p->code.equals(p.code)).findFirst().get().getMsg();
    }
}
