package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class OfficialAccountPaymentResponse extends PaymentResponse {

    /**
     *支付方式，WECHAT:微信
     * ALIPAY:支付宝
     */
    private String payType;
    /**
     *用户授权标识， 网页授权获取的用户唯一标识
     */
    private String openid;
    /**
     *APPID， 微信及支付宝的 appId
     */
    private String appid;
    /**
     *预支付交易会话 ID, 调起支付插件需要
     */
    private String prepayId;
    /**
     *时间戳,调起微信支付插件需要
     */
    private String timeStamp;
    /**
     *随机字符串, 调起微信支付插件需要
     */
    private String nonceStr;
    /**
     *签名算法, 调起微信支付插件需要MD5
     * HMAC-SHA256
     */
    private String paySignType;
    /**
     *支付签名, 调起微信支付插件需要
     */
    private String paySign;
}
