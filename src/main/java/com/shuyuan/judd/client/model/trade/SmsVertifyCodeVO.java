package com.shuyuan.judd.client.model.trade;

import lombok.Data;

/**
 * @author Sting
 * create 2019/02/12

 **/
//验证码验证校验
@Data
public class SmsVertifyCodeVO {
    //redis缓存中的key
    private String smsVerifyType;
    //验证码
    private String smsVerifyCode;
}
