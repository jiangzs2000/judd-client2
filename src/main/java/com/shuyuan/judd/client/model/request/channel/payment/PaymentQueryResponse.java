package com.shuyuan.judd.client.model.request.channel.payment;

import lombok.Data;

@Data
public class PaymentQueryResponse extends PaymentResponse {
    /**
     * 业务交易时传入的平台生成订单的日期，格式 YYYYMMDD，类型为字符
     * 串
     */
    private String date;
    /**
     * 商户唯一订单号
     */
    private String OrderNo;
    /**
     * 0	初始、
     * 1	成功、
     * 2	失败、
     * 3	处理中、
     * 4	交易关闭
     */
    private String state;
}
