package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class RefundOrderResponse {
    private String oriOrderNo;
    private String oriDate;
    private String orderNo;
    private String date;
    private String merCheckDate;
    private String tradeNo;
}
