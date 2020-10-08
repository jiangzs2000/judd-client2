package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class RefundOrderRequest {

    private String oriOrderNo;
    private String oriDate;
    private String orderNo;
    private String date;
    private Long amount;
    private Integer refundType;
    private String refundDesc;
    private String remark;
    private String oriMerTrace;
    private Integer feePayer;
    private String dividingOrderNo;
    private String dividingMerDate;
    private Long feeAmount;
}
