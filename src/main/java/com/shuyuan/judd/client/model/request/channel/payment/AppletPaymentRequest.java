package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class AppletPaymentRequest extends PaymentRequest {
    /**
     * 前台通知地址, 支付完成后，前台通知地址
     */
    private String retUrl;
    /**
     * WECHAT:微信
     */
    private String payType = "WECHAT";
    /**
     * 用户在商户 appid 下的唯一标识
     */
    private String openid;
    /**
     * 微信分配的公众账号 ID（企业号corpid 即为此appId）或
     * 支付宝分配给开发者的应用 ID
     */
    private String appid;
}
