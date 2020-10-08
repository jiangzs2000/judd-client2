package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class EntrustPayRequest extends PaymentRequest {
    /**
     *子商户编号
     */
    private String merCustId;
    /**
     *支付协议号
     */
    private String pAgreementId;

}
