package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class AppletPaymentResponse extends PaymentResponse {
    /**
     * 支付方式, WECHAT:微信
     */
    private String payType = "WECHAT";
    /**
     * 用户授权标识, 用户在商户 appid 下的唯一标识
     */
    private String openid;
    /**
     * 微信分配的小程序 ID
     */
    private String appid;
    /**
     * 预支付交易会话 ID, 调起支付插件需要
     */
    private String prepayId;
    /**
     * 时间戳, 调起微信支付插件需要
     */
    private String timeStamp;
    /**
     * 随机字符串, 调起微信支付插件需要
     */
    private String nonceStr;
    /**
     * 签名算法, 调起微信支付插件需要RSA
     * MD5
     * HMAC-SHA256
     */
    private String paySignType;
    /**
     * 支付签名, 调起微信支付插件需要
     */
    private String paySign;
}
