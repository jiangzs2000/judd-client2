package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class ScanPaymentResponse extends PaymentResponse {
    /**
     * 唯一订单号,生成的标识该笔交易的编号，
     * 编号支持数字、英文字母组合使用， 类型为字符串；订单号必须唯一
     * 创建订单时传给三方平台的
     */
    private String orderNo;
    /**
     * 订单日期, 平台生成订单的日期，格式
     * YYYYMMDD，类型为字符串
     */
    private String date;
    /**
     * 缴费二维码地址, 缴费二维码地址
     * 微信或支付宝二维码链接
     */
    private String paymentLink;
}
