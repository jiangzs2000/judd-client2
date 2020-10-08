package com.shuyuan.judd.client.model.trade;

import lombok.Data;

/**
 * @author Sting
 * create 2019/02/12

 **/
//短信验证码发送对象
@Data
public class SmsSendCodeVO {
    //redis缓存中的key
    private String smsVerifyType;
    //手机号码
    private String phone;
}
