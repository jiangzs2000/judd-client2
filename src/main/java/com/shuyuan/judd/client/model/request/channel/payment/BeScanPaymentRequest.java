package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class BeScanPaymentRequest extends PaymentRequest {
    /**
     * 支付方式, WECHAT:微信
     * ALIPAY:支付宝
     */
    private String payType;
    /**
     * 扫码支付授权码
     */
    private String authCode;
    /**
     * 商品ID
     */
    private String goodsId;
    /**
     * 商品信息
     */
    private String goodsInf;
}
