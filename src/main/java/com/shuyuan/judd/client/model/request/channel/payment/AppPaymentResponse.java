package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class AppPaymentResponse extends PaymentResponse {
    /**
     * 唯一订单号，生成的标识该笔交易的编号，
     * 编号支持数字、英文字母组合使用， 类型为字符串；订单号必须唯一
     */
    private String orderNo;
    /**
     * 交易日期，格式：YYYYMMDD
     */
    private String date;
    /**
     * 银行支付订单号,APP 发起支付时，需要传入到tradeNo(交易号)( APP 支付时需要
     * )
     */
    private String payTradeNo;
    /**
     * 支付签名, APP 发起支付，需要传入到 sign(签
     * 名)( APP 支付时需要)
     */
    private String paySign;


}
