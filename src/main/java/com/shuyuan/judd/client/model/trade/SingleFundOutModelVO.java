package com.shuyuan.judd.client.model.trade;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Boris
 * create 2019/01/08
 * 
 **/
@Data
public class SingleFundOutModelVO {

    //商户
    private String userId;
    //金额
    private BigDecimal amount;
    //手机号
    private String phone;
    //验证码
    private String code;
    //saas流水号
    private String payOrderId;
    //saas段token
    private String token;
    //图文验证码
    private String captcha;
}
