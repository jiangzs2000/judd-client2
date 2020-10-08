package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class WithdrawOrderQueryResponse {
    private String orderNo;
    private String date;
    private Long amount;
    private String merCheckDate;
    private String tradeNo;
    private String tradeState;
    private Long channelRetFeeAmt;
}
