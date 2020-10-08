package com.shuyuan.judd.client.model.enums;

/**
 * @author Boris
 * create 2019/01/17
 * 
 **/
public enum SMSCodeEnum {

    //【聚多多】您的验证码是：@var(code)，3分钟内有效。如非您本人操作，可忽略本消息。
    SMS_VERIFF("8pVMb3");

    String name;

    SMSCodeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
