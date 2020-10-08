package com.shuyuan.judd.client.model.request.channel.callback;

import com.shuyuan.judd.client.model.request.channel.payment.PaymentResponse;
import lombok.Data;

@Data
public class PaymentResultNotification extends PaymentResponse {

    /**
     *平台唯一订单号
     */
    private String orderNo;
    /**
     *平台订单日期
     */
    private String date;
    /**
     *支付方式
     */
    private String payType;

    /**
     * 支付结果
     */
    private String paymentResult;

    /**
     * 备注
     */
    private String remark;
    public static class PaymentResult{
        public static String SUCCESS = "S";
        public static String FAIL = "F";
    }
}
