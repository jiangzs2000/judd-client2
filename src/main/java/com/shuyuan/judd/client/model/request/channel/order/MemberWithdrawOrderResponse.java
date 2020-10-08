package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class MemberWithdrawOrderResponse {
    private String orderNo;
    private String date;
    private String tradeNo;
    private Long amount;
    private String merCheckDate;
    private Long channelRetFeeAmt;
}
