package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class AppPaymentRequest extends PaymentRequest {
    /**
     * 产品 ID, 非必填，
     */
    private String goodsId;
    /**
     * 商品信息
     */
    private String goodsInf;
    /**
     * 用户 IP 地址, 用户在创建交易时，该用户当前
     * 所使用机器的 IP。 用作防钓鱼校验
     */
    private String userIp;

}
