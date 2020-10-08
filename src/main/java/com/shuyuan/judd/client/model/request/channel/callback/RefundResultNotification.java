package com.shuyuan.judd.client.model.request.channel.callback;

import lombok.Data;

@Data
public class RefundResultNotification {
    private Long amount;
    private String date;
    private String orderNo;
    private String oriOrderNo;
    private String oriDate;
    private String tradeNo;
    private String merCheckDate;
    /**
     * 支付结果
     */
    private String refundResult;
    /**
     * 备注
     */
    private String remark;
    public static class RefundResult{
        public static String SUCCESS = "S";
        public static String FAIL = "F";
    }
}
