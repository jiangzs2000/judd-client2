package com.shuyuan.judd.client.model.request.channel.callback;

import lombok.Data;

@Data
public class WithdrawResultNotification {
    private String orderNo;
    private String date;
    private String tradeNo;
    private String merCheckDate;
    private Long amount;
    private Long channelRetFeeAmt;
    private String withdrawResult;
    private String remark;
    public static class WithdrawResult{
        public static String SUCCESS = "S";
        public static String FAIL = "F";
    }
}
