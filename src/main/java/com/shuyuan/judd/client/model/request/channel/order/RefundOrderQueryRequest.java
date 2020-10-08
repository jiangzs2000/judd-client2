package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class RefundOrderQueryRequest {
    private String orderNo;
    private String date;
}
