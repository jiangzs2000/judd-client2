package com.shuyuan.judd.client.model.enums;
/**
 * Created by Kevin
 * description: 1.（平台错误码 此号以此累加） 2.（机构错误码按照联动）
 * date: 2018/11/23 1:35 PM
 */
public enum CompanyOrPrivateTypeEnum {
    COMMPANY("B","对公"),
    PRIVATE("C", "对私");

    private String code;
    private String msg;

    CompanyOrPrivateTypeEnum(String code, String msg) {
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

    public static CompanyOrPrivateTypeEnum getEnumByKey(String key){
        if(null == key){
            return null;
        }
        for(CompanyOrPrivateTypeEnum temp: CompanyOrPrivateTypeEnum.values()){
            if(temp.getCode().equals(key)){
                return temp;
            }
        }
        return null;
    }
}
