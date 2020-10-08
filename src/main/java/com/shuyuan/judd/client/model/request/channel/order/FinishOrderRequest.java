package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class FinishOrderRequest {
    /**
     * 创建订单时平台返回流水号
     */
    private String tradeNo;
    /**
     * 原分账明细订单号，非必填，如果每填，默认完成所有分账
     */
    private String dividingOrderNo;
    /**
     * 原分账明细订单日期，非必填
     */
    private String dividingMerDate;
}
