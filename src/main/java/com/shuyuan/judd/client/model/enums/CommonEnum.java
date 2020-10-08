package com.shuyuan.judd.client.model.enums;
/**
 * Created by Kevin
 * description: 子商户和平台区分
 * date: 2018/11/23 1:35 PM
 */
public enum CommonEnum {
    MERCHANT("MERCHANT", "子商户"),
    PLAT("PLAT", "平台");

    private String code;
    private String msg;

    CommonEnum(String code, String msg) {
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

    public static CommonEnum getEnumByKey(String key){
        if(null == key){
            return null;
        }
        for(CommonEnum temp: CommonEnum.values()){
            if(temp.getCode().equals(key)){
                return temp;
            }
        }
        return null;
    }
}
