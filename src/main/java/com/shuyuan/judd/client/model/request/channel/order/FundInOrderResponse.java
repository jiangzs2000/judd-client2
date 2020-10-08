package com.shuyuan.judd.client.model.request.channel.order;

import lombok.Data;

@Data
public class FundInOrderResponse {
    /**
     * 下单时提交的唯一订单号
     */
    private String orderNo;
    /**
     * 下单时提交的data， YYYYMMDD
     */
    private String date;
    /**
     * 下单时，三方平台返回流水号
     */
    private String tradeNo;

}
