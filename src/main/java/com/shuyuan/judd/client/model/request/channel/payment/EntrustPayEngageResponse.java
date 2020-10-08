package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class EntrustPayEngageResponse extends PaymentResponse {
    /**
     * 支付协议号,当返回码为已签约时，会返回支付协议号。
     */
    private String pAgreementId;
}
