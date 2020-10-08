package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class PaymentResponse {
    /**
     * 商户流水号(支付流水号），商户系统生产的标识支付交易的流水号
     */
    private String trace;
    /**
     *三方机构针对业务订单生成的订单号
     */
    private String tradeNo;
    /**
     *支付金额，分
     */
    private Long amount;
    /**
     *结算金额，分
     */
    private Long settleAmt;
    /**
     *对账日期，对账日期，格式：YYYYMMDD
     */
    private String merCheckDate;
}
