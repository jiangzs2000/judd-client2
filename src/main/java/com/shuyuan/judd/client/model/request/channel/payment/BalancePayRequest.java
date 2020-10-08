package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class BalancePayRequest extends PaymentRequest {
    /**
     * 商户在渠道的编号
     */
    private String merChannelNo;
}
