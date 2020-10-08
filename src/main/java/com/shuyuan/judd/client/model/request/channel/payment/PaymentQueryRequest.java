package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class PaymentQueryRequest extends PaymentRequest {
    /**
     * 业务交易时传入的平台生成订单的日期，格式 YYYYMMDD，类型为字符
     * 串
     */
    private String date;
    /**
     * 商户唯一订单号
     */
    private String orderNo;
}
