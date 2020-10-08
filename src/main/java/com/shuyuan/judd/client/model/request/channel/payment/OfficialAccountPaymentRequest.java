package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class OfficialAccountPaymentRequest extends PaymentRequest {
    /**
     * 前台通知地址,支付完成后，前台通知地址
     */
    private String retUrl;
    /**
     * 支付方式, WECHAT:微信
     * ALIPAY:支付宝
     */
    private String payType;
    /**
     * 网页授权获取的用户唯一标识
     */
    private String openid;
    /**
     * 微信及支付宝的 appId
     */
    private String appid;


}
