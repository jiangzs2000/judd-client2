package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class EbankPaymentResponse extends PaymentResponse {
    /**
     * 平台唯一订单号，商户下单时提交的 order_no
     */
    private String orderNo;

}
