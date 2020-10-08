package com.shuyuan.judd.client.model.request.portal;

import com.shuyuan.judd.client.model.merchant.MerchantBank;
import lombok.Data;

/**
 * @author Sting
 * create 2019/01/14
 * 子商户绑卡下单请求对象
 **/
@Data
public class MerchantBindCardFrontEndRequest {
    //短信验证码
    private String messageCode;
    //订单号
    private String orderNo;

    //渠道返回的订单号
    private String tradeNo;

    //图文验证码相关参数
    private String token;
    private String captcha;
    private String merchantNo;
    private MerchantBank merchantBank;
    private String channelCode;

}
