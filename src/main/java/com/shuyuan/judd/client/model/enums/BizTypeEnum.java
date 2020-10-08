package com.shuyuan.judd.client.model.enums;
/**
 * Created by Kevin
 * description: 支付业务类型
 * date: 2018/11/23 1:35 PM
 */
public enum BizTypeEnum {
    FUNDIN("I", "入款"),
    FUNDOUT("O", "出款"),
    REFUND("R", "退款");
    private String code;
    private String msg;

    BizTypeEnum(String code, String msg) {
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

    public static BizTypeEnum getEnumByKey(String key){
        if(null == key){
            return null;
        }
        for(BizTypeEnum temp:BizTypeEnum.values()){
            if(temp.getCode().equals(key)){
                return temp;
            }
        }
        return null;
    }
}
