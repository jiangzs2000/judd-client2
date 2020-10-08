package com.shuyuan.judd.client.model.request.openapi;

import com.shuyuan.judd.client.model.request.channel.order.FundInOrderResponse;

public class PlaceOrderOpenapiResponse extends FundInOrderResponse {
    /**
     * 商户编号：由平台统一分配合作商户唯一标识
     */
    private String merNo;
    /**
     * 版本号, 定值 1.0
     */
    private String version = "1.0";
}
