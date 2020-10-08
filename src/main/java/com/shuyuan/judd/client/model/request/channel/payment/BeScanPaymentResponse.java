package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class BeScanPaymentResponse extends PaymentResponse {
    /**
     * 唯一订单号, 商户生成的标识该笔交易的编号， 编号支持数字、英文字母组合使用，
     * 类型为字符串；订单号必须唯一
     */
    private String orderNo;
}
