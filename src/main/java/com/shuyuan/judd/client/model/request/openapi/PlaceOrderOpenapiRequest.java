package com.shuyuan.judd.client.model.request.openapi;

import com.shuyuan.judd.client.model.request.channel.order.FundInOrderRequest;
import lombok.Data;

@Data
public class PlaceOrderOpenapiRequest extends FundInOrderRequest {
    private String merNo;
    private String notifyUrl;
    private String version;
}
